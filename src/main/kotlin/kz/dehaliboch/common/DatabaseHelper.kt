package kz.dehaliboch.common

import io.ktor.server.application.*
import org.ktorm.database.Database

object DatabaseHelper {

    const val MESSAGES_TABLE_NAME = "messages"

    private const val KEY_DB_URL = "db.config.db_url"
    private const val KEY_DB_USER = "db.config.db_user"
    private const val KEY_DB_PWD = "db.config.db_pwd"

    private var dbUrl = ""
    private var dbUser = ""
    private var dbPassword = ""

    fun Application.configureDatabaseVariables() {
        dbUrl = environment.config.propertyOrNull(KEY_DB_URL)?.getString() ?: ""
        dbUser = environment.config.propertyOrNull(KEY_DB_USER)?.getString() ?: ""
        dbPassword = environment.config.propertyOrNull(KEY_DB_PWD)?.getString() ?: ""
    }

    fun database() = Database.connect(
        url = dbUrl,
        user = dbUser,
        password = dbPassword,
    )
}