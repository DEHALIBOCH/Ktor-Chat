package kz.dehaliboch.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val text: String,
    val username: String,
    val timestamp: String,
    val id: Int,
)
