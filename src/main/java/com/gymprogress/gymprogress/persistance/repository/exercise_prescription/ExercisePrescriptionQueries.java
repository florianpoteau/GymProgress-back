package com.gymprogress.gymprogress.persistance.repository.exercise_prescription;

public final class ExercisePrescriptionQueries {

    public static final String FIND_EXERCISES_PRESCRIPTION_BY_DIFFICULTIES =
    "SELECT ep FROM ExercisesPrescription ep WHERE ep.difficultyLevel.difficultyLevelName IN :difficultyName";
}
