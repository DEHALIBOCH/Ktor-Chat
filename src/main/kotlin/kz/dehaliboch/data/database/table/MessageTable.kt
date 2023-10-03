package kz.dehaliboch.data.database.table

import kz.dehaliboch.common.DatabaseHelper
import kz.dehaliboch.data.model.MessageEntity
import org.ktorm.schema.*

object MessageTable : Table<MessageEntity>(tableName = DatabaseHelper.MESSAGES_TABLE_NAME) {

    val text = text("text").bindTo { it.text }
    val username = varchar("username").bindTo { it.username }
    val timestamp = varchar("timestamp").bindTo { it.timestamp }
    val id = int("id").primaryKey().bindTo { it.id }
}