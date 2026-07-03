package com.gymprogress.gymprogress.persistance.repository.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gymprogress.gymprogress.persistance.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

    @Query(UserQueries.FIND_USER_ACCOUNT_BY_EMAIL)
    Optional<User> findUserAccountByEmail(String Email);

}
