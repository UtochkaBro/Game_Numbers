package com.example.game_numbers.domain.repository

import com.example.game_numbers.domain.entity.GameSettings
import com.example.game_numbers.domain.entity.Level
import com.example.game_numbers.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level) : GameSettings
}