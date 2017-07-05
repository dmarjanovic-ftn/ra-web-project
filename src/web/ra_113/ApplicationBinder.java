package web.ra_113;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import web.ra_113.repositories.UserRepository;
import web.ra_113.repositories.file.FileUserRepository;

import javax.inject.Singleton;

public class ApplicationBinder extends AbstractBinder {

    @Override
    protected void configure() {
        bind(FileUserRepository.class).to(UserRepository.class).in(Singleton.class);
    }

}
