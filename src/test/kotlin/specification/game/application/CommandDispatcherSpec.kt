package io.github.ahocquard.sevenwonders.specification.game.application

import io.github.ahocquard.sevenwonders.game.application.Command
import io.github.ahocquard.sevenwonders.game.application.CommandDispatcher
import io.github.ahocquard.sevenwonders.game.application.CommandHandler
import io.github.ahocquard.sevenwonders.game.application.NoSuitableCommandHandlerException
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec
import io.mockk.confirmVerified
import io.mockk.spyk
import io.mockk.verify

class CommandDispatcherSpec : StringSpec({
    "it dispatches a command to the appropriate handler" {
        val command = SimpleCommand()
        val commandHandler = spyk(SimpleCommandHandler())
        val anotherCommandHandler = spyk(AnotherSimpleCommandHandler())

        val handlers = listOf(commandHandler, anotherCommandHandler)
        val dispatcher = CommandDispatcher(handlers)

        dispatcher.handle(command)

        verify(exactly = 1) { commandHandler.invoke(command) }
        verify(exactly = 0) { anotherCommandHandler.invoke(any()) }

        confirmVerified(commandHandler)
        confirmVerified(anotherCommandHandler)
    }

    "it throws an exception when it can not handle a command" {
        val commandHandler = SimpleCommandHandler()
        val unknownCommand = UnknownCommand()
        val dispatcher = CommandDispatcher(listOf(commandHandler))

        shouldThrow<NoSuitableCommandHandlerException> {
            dispatcher.handle(unknownCommand)
        }
    }
})

class UnknownCommand : Command
class SimpleCommand : Command
class SimpleCommandHandler : CommandHandler<SimpleCommand> {
    override fun invoke(command: SimpleCommand) {
        // nothing to do here
    }
}
class AnotherSimpleCommand : Command
class AnotherSimpleCommandHandler : CommandHandler<AnotherSimpleCommand> {
    override fun invoke(command: AnotherSimpleCommand) {
        // nothing to do here
    }
}