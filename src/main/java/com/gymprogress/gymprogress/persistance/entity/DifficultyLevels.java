package com.gymprogress.gymprogress.persistance.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="difficulty_levels")
public class DifficultyLevels {

    @Id
    @Column(name="difficulty_level_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DifficultyLevelId;

    @Basic
    @Column(name = "difficulty_level_name")
    private Difficulty difficultyLevelName;

}
