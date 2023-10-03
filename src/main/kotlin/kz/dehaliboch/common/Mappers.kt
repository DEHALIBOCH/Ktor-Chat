package kz.dehaliboch.common

import kz.dehaliboch.data.model.Message
import kz.dehaliboch.data.model.MessageEntity

fun MessageEntity.toMessage() = Message(
    id = id,
    text = text,
    username = username,
    timestamp = timestamp,
)