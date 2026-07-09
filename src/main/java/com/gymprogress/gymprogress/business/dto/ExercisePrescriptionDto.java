package com.gymprogress.gymprogress.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExercisePrescriptionDto {

    private int exercisePrescriptionId;
    private int exerciseId;
    private int difficultyLevelId;
    
}
