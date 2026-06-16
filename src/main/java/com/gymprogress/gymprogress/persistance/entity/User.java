package com.gymprogress.gymprogress.persistance.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Basic
    @Column(name = "user_email", unique = true, nullable = false, length = 254)
    private String userEmail;

    @Basic
    @Column(name = "user_password", nullable = false)
    private String userPassword;

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "user_gender", length = 20)
    private Gender userGender;

    @Basic
    @Column(name = "user_age", length = 120, nullable = false)
    private int userAge;


}
