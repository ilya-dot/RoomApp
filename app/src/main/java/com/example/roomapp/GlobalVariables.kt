package com.example.roomapp

import android.content.Context

class GlobalVariables private constructor() {
    companion object {
        val instance = GlobalVariables()
    }

    lateinit var applicationContext: Context
    lateinit var appDatabase: AppDB

    var key: String = ""
}

