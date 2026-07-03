package com.gymprogress.gymprogress.persistance.repository.difficultylevel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymprogress.gymprogress.persistance.entity.DifficultyLevels;

@Repository
public interface IDifficultyLevel extends JpaRepository<DifficultyLevels, Integer> {

    
}