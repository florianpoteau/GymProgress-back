package com.gymprogress.gymprogress.persistance.repository.difficultylevel;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gymprogress.gymprogress.persistance.entity.DifficultyLevels;

public interface IDifficultyLevel extends JpaRepository<DifficultyLevels, Integer> {

    
}