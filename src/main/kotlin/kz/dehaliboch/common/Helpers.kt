package kz.dehaliboch.common

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

const val TIMESTAMP_PATTERN = "yyyy-MM-dd HH:mm:ss"

fun generateTimestamp(): String {
    val currentDateTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern(TIMESTAMP_PATTERN)
    return currentDateTime.format(formatter)
}