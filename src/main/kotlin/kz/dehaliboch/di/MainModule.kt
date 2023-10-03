package kz.dehaliboch.di

import kz.dehaliboch.common.DatabaseHelper
import kz.dehaliboch.data.MessageDataSource
import kz.dehaliboch.data.MessageDataSourceImpl
import kz.dehaliboch.data.database.DatabaseManager
import kz.dehaliboch.room.RoomController
import org.koin.dsl.module

val mainModule = module {
    single {
        DatabaseManager(DatabaseHelper.database())
    }
    single<MessageDataSource> {
        MessageDataSourceImpl(get())
    }
    single {
        RoomController(get())
    }
}