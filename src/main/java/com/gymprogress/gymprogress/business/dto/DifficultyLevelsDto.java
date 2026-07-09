package com.gymprogress.gymprogress.business.dto;

import com.gymprogress.gymprogress.persistance.entity.Difficulty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DifficultyLevelsDto {

    private int difficultyLevelId;
    private Difficulty difficultyLevelName;
    
}
