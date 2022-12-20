package com.example.game_numbers.domain.usecases

import com.example.game_numbers.domain.entity.GameSettings
import com.example.game_numbers.domain.entity.Level
import com.example.game_numbers.domain.repository.GameRepository

class GetGameSettingsUseCase (
    private val repository: GameRepository
        ) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }

}