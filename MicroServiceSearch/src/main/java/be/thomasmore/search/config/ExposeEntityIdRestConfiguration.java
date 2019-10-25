package be.thomasmore.search.config;

import be.thomasmore.search.entity.Album;
import be.thomasmore.search.entity.Artist;
import be.thomasmore.search.entity.Track;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class ExposeEntityIdRestConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config){
        config.exposeIdsFor(Album.class);
        config.exposeIdsFor(Artist.class);
        config.exposeIdsFor(Track.class);
    }
}
