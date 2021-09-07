package com.rafaelbandeeira.businesscard.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BusinessCard(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val nome: String,
    val cargo: String,
    val telefone: String,
    val empresa: String,
    val email: String,
    val background: String
)
