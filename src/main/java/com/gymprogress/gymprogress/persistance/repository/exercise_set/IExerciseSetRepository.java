package com.gymprogress.gymprogress.persistance.repository.exercise_set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymprogress.gymprogress.persistance.entity.ExerciseSet;

@Repository
public interface IExerciseSetRepository extends JpaRepository<ExerciseSet, Integer> {

    
}
