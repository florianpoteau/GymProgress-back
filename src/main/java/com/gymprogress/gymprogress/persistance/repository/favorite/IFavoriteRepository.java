package com.gymprogress.gymprogress.persistance.repository.favorite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymprogress.gymprogress.persistance.entity.Favorite;

@Repository
public interface IFavoriteRepository extends JpaRepository<Favorite, Integer>{

}
