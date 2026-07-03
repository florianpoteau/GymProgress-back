package com.gymprogress.gymprogress.persistance.repository.exercise_prescription;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymprogress.gymprogress.persistance.entity.ExercisesPrescription;

@Repository
public interface IExercisePrescription extends JpaRepository<ExercisesPrescription, Integer> {

}
