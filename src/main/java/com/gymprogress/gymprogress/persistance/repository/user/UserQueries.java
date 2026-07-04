package com.gymprogress.gymprogress.persistance.repository.user;

public final class UserQueries {

    public static final String FIND_USER_ACCOUNT_BY_EMAIL =
      "SELECT u FROM User u WHERE u.userEmail = :email";

}
