package com.example.fooddeliveryapp.domain.repo

interface Repo {

    fun loginWithEmailAndPassword(userDatat: UserData): Flow<ResultState<String>>

    fun registerWithEmailAndPassword(userDatat: UserData): Flow<ResultState<String>>
}