package com.gymprogress.gymprogress.persistance.repository.favorite;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gymprogress.gymprogress.persistance.entity.Favorite;

@Repository
public interface IFavoriteRepository extends JpaRepository<Favorite, Integer>{
    
    @Query(FavoritesQueries.FIND_FAVORITES_BY_USER_ID)
    List<Favorite> findFavoritesByUserId(@Param("userId") int userId);

}
