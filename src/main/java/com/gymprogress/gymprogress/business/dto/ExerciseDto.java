package com.gymprogress.gymprogress.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseDto {

    private int ExerciseId;
    private String exerciseName;
    private String exerciseImage;
    
}
