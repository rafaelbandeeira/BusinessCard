package com.rafaelbandeeira.businesscard

import android.app.Application
import com.rafaelbandeeira.businesscard.data.AppDatabase
import com.rafaelbandeeira.businesscard.data.BusinessCardRepository

class BaseApp : Application() {
    val database by lazy { AppDatabase.getDatabasse(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}