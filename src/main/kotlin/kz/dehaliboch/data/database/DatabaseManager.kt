package kz.dehaliboch.data.database

import kz.dehaliboch.common.toMessage
import kz.dehaliboch.data.database.table.MessageTable
import kz.dehaliboch.data.model.MessageDraft
import org.ktorm.database.Database
import org.ktorm.dsl.insertAndGenerateKey
import org.ktorm.entity.sequenceOf
import org.ktorm.entity.toList

class DatabaseManager(private val database: Database) {

    fun getAllMessages() = database.sequenceOf(MessageTable).toList().map { it.toMessage() }

    fun insertMessage(messageDraft: MessageDraft) = (database.insertAndGenerateKey(MessageTable) {
        set(MessageTable.text, messageDraft.text)
        set(MessageTable.timestamp, messageDraft.timestamp)
        set(MessageTable.username, messageDraft.username)
    } as Int)
}