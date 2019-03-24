package io.github.ahocquard.sevenwonders.game.application

interface CommandHandler<C : Command> : (C) -> Unit {
    override operator fun invoke(command: C)
}
