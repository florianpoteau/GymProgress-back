package com.gymprogress.gymprogress.persistance.repository.favorite;

public final class FavoritesQueries {

    public static final String FIND_FAVORITES_BY_USER_ID =
    "SELECT f from Favorite WHERE f.userId = :userId";

}
