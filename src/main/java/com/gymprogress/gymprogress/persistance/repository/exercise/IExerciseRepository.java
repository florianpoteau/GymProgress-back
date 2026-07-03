package com.gymprogress.gymprogress.persistance.repository.exercise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymprogress.gymprogress.persistance.entity.Exercise;

@Repository
public interface IExerciseRepository extends JpaRepository<Exercise, Integer> {
    
}
