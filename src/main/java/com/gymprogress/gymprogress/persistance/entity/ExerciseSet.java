package com.gymprogress.gymprogress.persistance.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "exercise_sets")
public class ExerciseSet {

    @Id
    @Column(name = "exercise_sets_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exerciseSetsId;

    @Basic
    @Column(name = "exercise_sets_number", length = 10, nullable = false)
    private int exerciseSetsNumber;

    @Basic
    @Column(name = "exercise_sets_rep", length = 100, nullable = false)
    private int exerciseSetsRep;

    @Basic
    @Column(name = "exercise_sets_weight", length = 300, nullable = true)
    private int exerciseSetsWeight;

    @Basic
    @Column(name = "exercise_sets_duration", nullable = false)
    private int exerciseSetsDuration;

    @ManyToOne
    @JoinColumn(name = "exercise_prescription_id", nullable = false)
    private ExercisesPrescription exercisesPrescription;

}
