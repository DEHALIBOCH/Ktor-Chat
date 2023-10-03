package kz.dehaliboch.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import kz.dehaliboch.room.RoomController
import kz.dehaliboch.routes.chatSocket
import kz.dehaliboch.routes.getAllMessages
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
