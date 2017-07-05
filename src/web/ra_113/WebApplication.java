package web.ra_113;

import org.glassfish.jersey.server.ResourceConfig;

public class WebApplication extends ResourceConfig {

    public WebApplication() {
        register(new ApplicationBinder());
        packages(true, "web.ra_113.controllers", "org.codehaus.jackson.jaxrs");
    }

}
