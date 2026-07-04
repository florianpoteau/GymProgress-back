package com.gymprogress.gymprogress.persistance.repository.exercise_prescription;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gymprogress.gymprogress.persistance.entity.Difficulty;
import com.gymprogress.gymprogress.persistance.entity.ExercisesPrescription;

@Repository
public interface IExercisePrescriptionRepository extends JpaRepository<ExercisesPrescription, Integer> {

    @Query(ExercisePrescriptionQueries.FIND_EXERCISES_PRESCRIPTION_BY_DIFFICULTIES)
    List<ExercisesPrescription> findAllExercisesByDifficulty(@Param("difficulty") Difficulty difficulty);

}
