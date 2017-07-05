package web.ra_113.controllers;

import org.joda.time.DateTime;
import web.ra_113.domain.User;
import web.ra_113.repositories.UserRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class Users {

    private UserRepository userRepository;

    @Inject
    public Users(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerUser(final User user) {

        user.setRegisteredAt(DateTime.now());
        final User saved = userRepository.save(user);

        return Response.ok(saved).build();
    }

    @GET
    @Path("/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveUser(@PathParam("username") final String username) {
        final User user = userRepository.findUserByUsername(username);

        if (user == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        return Response.ok(user).build();
    }

}
