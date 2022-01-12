package pl.codementors.jpa.movies;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.codementors.jpa.movies.model.Genre;
import pl.codementors.jpa.movies.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    void deleteAllByGenre(Genre genre);
}
