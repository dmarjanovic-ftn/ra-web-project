package web.ra_113.repositories;

import web.ra_113.domain.User;

import java.util.List;

public interface UserRepository {

    User save(final User user);

    List<User> findAll();

    User findUserByUsername(final String username);

}
