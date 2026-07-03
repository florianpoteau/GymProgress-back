package com.gymprogress.gymprogress.persistance.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymprogress.gymprogress.persistance.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
