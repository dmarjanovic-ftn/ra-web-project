package web.ra_113.repositories.file;

import org.codehaus.jackson.map.ObjectMapper;
import web.ra_113.domain.User;
import web.ra_113.repositories.UserRepository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static web.ra_113.Constants.ROOT_PATH;

public class FileUserRepository implements UserRepository {

    private static final String USERS_FILE = ROOT_PATH + "users.json";

    @Override
    public User save(final User user) {
        // Read all users from file
        final List<User> users = findAll();

        final ObjectMapper mapper = new ObjectMapper();
        try {
            users.add(user);
            mapper.writeValue(new File(USERS_FILE), users);
            return user;
        }
        catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<User> findAll() {
        final ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(new File(USERS_FILE), mapper.getTypeFactory().constructCollectionType(ArrayList.class, User.class));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public User findUserByUsername(final String username) {
        for (final User user: findAll()) {
            if (username.equals(user.getUsername())) {
                return user;
            }
        }

        return null;
    }

}
