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
@Table(name = "favorites")
public class Favorite {

    @Id
    @Column(name = "favorite_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int favoriteId;

    @Basic
    @Column(name = "favorite_target_type", length = 20, nullable = false)
    private FavoriteTargetType favoriteTargetType;

    @Basic
    @Column(name = "favorite_target_id", nullable = false)
    private int favoriteTargetId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private int userId;

}
