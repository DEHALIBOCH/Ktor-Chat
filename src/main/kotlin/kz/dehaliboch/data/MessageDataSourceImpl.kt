package kz.dehaliboch.data

import kz.dehaliboch.data.database.DatabaseManager
import kz.dehaliboch.data.model.Message
import kz.dehaliboch.data.model.MessageDraft

class MessageDataSourceImpl(private val databaseManager: DatabaseManager) : MessageDataSource {

    override fun getAllMessages(): List<Message> = databaseManager.getAllMessages()

    override fun insertMessage(message: MessageDraft) = databaseManager.insertMessage(message)
}