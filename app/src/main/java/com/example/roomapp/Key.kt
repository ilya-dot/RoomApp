package com.example.roomapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "key_table")
class Key(keyDao: Any?) {
    @PrimaryKey(autoGenerate = true)
    var key: String = ""
    var value: String = ""
}