package be.thomasmore.lyrics.config;

import be.thomasmore.lyrics.entity.Lyrics;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class ExposeEntityIdRestConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config){
        config.exposeIdsFor(Lyrics.class);
    }
}
