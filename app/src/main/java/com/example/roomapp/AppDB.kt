package com.example.roomapp

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Room


@Database(entities = [Key::class], version = 1, exportSchema = false)
abstract class AppDB : RoomDatabase() {
    abstract val keyDao: KeyDao
    abstract val key: Key

    companion object {

        @Volatile
        private var _instance: AppDB? = null

        fun getInstance(context: Context): AppDB {
            synchronized(this) {
                var instance = _instance

                if (instance == null) {

                    instance = Room.databaseBuilder(
                        context,
                        AppDB::class.java,
                        "app_database"
                    ).fallbackToDestructiveMigration().build()

                    _instance = instance
                }

                return instance
            }
        }
    }

}