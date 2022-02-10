package com.example.roomapp

import androidx.room.*

interface KeyDao {
    @Query("SELECT * FROM `key` WHERE id = :id")
    fun getByKey(s: String): Key?

    @Insert
    fun insert(key: Key?)

    @Update
    fun update(key: Key?)

    @Delete
    fun deleteAll(key: Key?)

    @Query("DELETE FROM `key` WHERE id = :id")
    fun deleteByKey(key: Key?)

}