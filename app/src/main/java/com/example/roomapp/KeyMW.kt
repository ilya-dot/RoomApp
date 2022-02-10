package com.example.roomapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class KeyMW(private val repository: KeyRepository) : ViewModel() {
    fun insertKeyToLocalDb() {
        GlobalScope.launch(Dispatchers.IO) {
            GlobalVariables.instance.appDatabase.keyDao.insert(
                Key(GlobalVariables.instance.key)
            )
        }
    }
}