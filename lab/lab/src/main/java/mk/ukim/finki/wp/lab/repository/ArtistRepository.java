package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class ArtistRepository {
    // Листа со артисти иницијализирана со 5 вредности
    private final List<Artist> artists = new ArrayList<>();

    public ArtistRepository() {
        // Иницијализирајте 5 артисти
        artists.add(new Artist(1L, "John", "Doe", "A talented singer and songwriter."));
        artists.add(new Artist(2L, "Jane", "Smith", "A famous jazz performer."));
        artists.add(new Artist(3L, "Michael", "Johnson", "A versatile guitarist."));
        artists.add(new Artist(4L, "Emily", "Brown", "A classical pianist."));
        artists.add(new Artist(5L, "Chris", "Wilson", "An innovative music producer."));
    }

    // Метод кој ја враќа листата со сите артисти
    public List<Artist> findAll() {
        return artists;
    }

    // Метод кој го враќа артистот со даденото id
    public Optional<Artist> findById(Long id) {
        return artists.stream()
                .filter(artist -> artist.getId().equals(id))
                .findFirst();
    }
}
