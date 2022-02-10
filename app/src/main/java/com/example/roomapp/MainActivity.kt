package com.example.roomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val globalVariables = GlobalVariables.instance
        globalVariables.applicationContext = applicationContext
        globalVariables.appDatabase = AppDB.getInstance(applicationContext)

        GlobalScope.launch(Dispatchers.IO) {
            var value =
                GlobalVariables.instance.appDatabase.keyDao.getByKey("key")

            if (value != null) {
                globalVariables.key = value.toString()
            }
        }

    }
}