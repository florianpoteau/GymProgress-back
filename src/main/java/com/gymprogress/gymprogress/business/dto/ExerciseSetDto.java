package com.gymprogress.gymprogress.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseSetDto {

    private int exerciseSetsId;
    private int exerciseSetsNumber;
    private int exerciseSetsRep;
    private int exerciseSetsWeight;
    private int exerciseSetsDuration;
    private int exercisesPrescriptionId;
    
}
