package com.example.fooddeliveryapp.domain.repo

import com.example.fooddeliveryapp.common.ResultState
import com.example.fooddeliveryapp.data.model.UserData
import kotlinx.coroutines.flow.Flow

interface Repo {

    fun loginWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>

    fun registerWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
}