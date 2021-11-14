package gg.rsmod.game.message.encoder

import gg.rsmod.game.message.MessageEncoder
import gg.rsmod.game.message.impl.IfMoveSubMessage

/**
 * @author Tom <rspsmods@gmail.com>
 */
class IfMoveSubEncoder : MessageEncoder<IfMoveSubMessage>() {

    override fun extract(message: IfMoveSubMessage, key: String): Number = when (key) {
        "from" -> message.from.also {
            println("IfMoveFrom: ${message.from}")
        }
        "to" -> message.to.also {
            println("IfCloseSubTo:: ${message.to}")
        }
        else -> throw Exception("Unhandled value key.")
    }

    override fun extractBytes(message: IfMoveSubMessage, key: String): ByteArray = throw Exception("Unhandled value key.")
}