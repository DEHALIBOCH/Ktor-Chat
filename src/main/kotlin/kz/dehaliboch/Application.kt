package kz.dehaliboch

import io.ktor.server.application.*
import kz.dehaliboch.common.DatabaseHelper.configureDatabaseVariables
import kz.dehaliboch.di.mainModule
import kz.dehaliboch.plugins.*
import org.koin.ktor.plugin.Koin

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    install(Koin) {
        modules(mainModule)
    }
    configureSerialization()
    configureDatabaseVariables()
    configureSockets()
    configureRouting()
    configureMonitoring()
    configureSecurity()
}
