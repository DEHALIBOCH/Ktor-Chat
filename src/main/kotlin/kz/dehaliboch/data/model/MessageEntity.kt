package kz.dehaliboch.data.model

import org.ktorm.entity.Entity


interface MessageEntity : Entity<MessageEntity> {

    val text: String
    val username: String
    val timestamp: String
    val id: Int

    companion object : Entity.Factory<MessageEntity>()
}