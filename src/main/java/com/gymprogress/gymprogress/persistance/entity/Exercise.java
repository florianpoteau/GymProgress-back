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
@Table(name="exercises")
public class Exercise {

    @Id
    @Column(name="exercise_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ExerciseId;
    
    @Basic
    @Column(name="exercise_name", unique = true, length = 50, nullable = false)
    private String exerciseName;

    @Basic
    @Column(name="exercise_image", length = 255, nullable = false)
    private String exerciseImage;

}
