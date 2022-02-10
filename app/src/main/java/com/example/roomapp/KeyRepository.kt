package com.example.roomapp

import androidx.annotation.WorkerThread


class KeyRepository(private val keyDao: KeyDao) {

    val allWords: Key? = keyDao.getByKey("key")

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(key: Key) {
        keyDao.insert(key)
    }
}