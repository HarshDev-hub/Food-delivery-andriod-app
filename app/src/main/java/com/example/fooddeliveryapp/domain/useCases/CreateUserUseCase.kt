package com.example.fooddeliveryapp.domain.useCases

import com.example.fooddeliveryapp.common.ResultState
import com.example.fooddeliveryapp.data.model.UserData
import com.example.fooddeliveryapp.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CreateUserUseCase @Inject constructor(val repo: Repo) {

    fun createUser(userData: UserData): Flow<ResultState<String>> {
        return repo.registerWithEmailAndPassword(userData)

    }
}