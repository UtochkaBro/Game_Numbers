package com.example.game_numbers.domain.usecases

import com.example.game_numbers.domain.entity.Question
import com.example.game_numbers.domain.repository.GameRepository

class GenerateQuestionUseCase (
    private val repository: GameRepository
        ){
    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}