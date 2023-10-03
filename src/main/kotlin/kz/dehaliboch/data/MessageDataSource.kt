package kz.dehaliboch.data

import kz.dehaliboch.data.model.Message

interface MessageDataSource {

    fun getAllMessages() : List<Message>

    fun insertMessage(message: Message)
}