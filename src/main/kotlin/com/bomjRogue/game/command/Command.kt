package com.bomjRogue.game.command

import kotlinx.serialization.Serializable

enum class CommandType {
    Move,
    Hit,
    Respawn
}

@Serializable
open class Command(val type: CommandType)

@Serializable
class MoveCommand(val playerName: String, val x: Float, val y: Float) : Command(CommandType.Move)

@Serializable
class HitCommand(val playerName: String): Command(CommandType.Hit)

@Serializable
class DeathCommand(val playerName: String): Command(CommandType.Respawn)