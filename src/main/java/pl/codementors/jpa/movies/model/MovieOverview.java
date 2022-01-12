package pl.codementors.jpa.movies.model;

import java.net.URL;

public interface MovieOverview {
    Long getId();
    String getTitle();
    Genre getGenre();
    URL getThumbnail();
}
