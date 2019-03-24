package io.github.ahocquard.sevenwonders.game.application

import java.lang.reflect.ParameterizedType

class CommandDispatcher(handlerList: List<CommandHandler<out Command>>) {
    val handlers: Map<String, CommandHandler<out Command>> = handlerList.associateBy(
        keySelector = { (it.javaClass.genericInterfaces[0] as ParameterizedType).actualTypeArguments[0].typeName },
        valueTransform = { it }
    )

    inline fun <reified C : Command> handle(command: C) {
        val commandName = command::class.qualifiedName!!
        val handler = handlers[commandName]

        if (null === handler) {
            throw NoSuitableCommandHandlerException("No handler suitable for the command '$commandName'.")
        }

        @Suppress("UNCHECKED_CAST")
        (handler as CommandHandler<C>).invoke(command)
    }
}
