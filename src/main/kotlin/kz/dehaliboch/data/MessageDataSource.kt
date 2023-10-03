package kz.dehaliboch.data

import kz.dehaliboch.data.model.Message
import kz.dehaliboch.data.model.MessageDraft

interface MessageDataSource {

    fun getAllMessages() : List<Message>

    fun insertMessage(message: MessageDraft): Int
}