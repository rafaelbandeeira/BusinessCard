package com.rafaelbandeeira.businesscard.data

import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class BusinessCardRepository(
    private val dao: BusinessCardDao
) {
    fun getAll(): LiveData<List<BusinessCard>> = dao.getAll()

    fun insert(businessCard: BusinessCard) = runBlocking {
        launch(Dispatchers.IO) {
            dao.insert(businessCard)
        }
    }
}