package com.example.myapplication

import android.util.Log
import javax.inject.Inject

interface UserRepo {
    fun saveUser(email: String, pas: String)
}

class SQLRepo @Inject constructor() : UserRepo {
    override fun saveUser(email: String, pass: String) {
        Log.d("REPO", "SQL")
    }
}

class firebaseRepo @Inject constructor() : UserRepo {
    override fun saveUser(email: String, pass: String) {
        Log.d("REPO", "firebase")
    }
}