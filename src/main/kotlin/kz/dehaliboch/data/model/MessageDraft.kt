package kz.dehaliboch.data.model

import kotlinx.serialization.Serializable
import kz.dehaliboch.common.generateTimestamp

@Serializable
data class MessageDraft(
    val text: String,
    val username: String,
    val timestamp: String = generateTimestamp(),
)