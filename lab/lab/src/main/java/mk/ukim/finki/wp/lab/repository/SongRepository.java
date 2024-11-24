package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class SongRepository {
    // Листа со песни иницијализирана со 5 вредности
    private final List<Song> songs = new ArrayList<>();

    public SongRepository() {
        // Иницијализација на песни со пример вредности
        songs.add(new Song("T1", "Song A", "Rock", 2000, new ArrayList<>()));
        songs.add(new Song("T2", "Song B", "Pop", 2005, new ArrayList<>()));
        songs.add(new Song("T3", "Song C", "Jazz", 2010, new ArrayList<>()));
        songs.add(new Song("T4", "Song D", "Classical", 2015, new ArrayList<>()));
        songs.add(new Song("T5", "Song E", "Hip-Hop", 2020, new ArrayList<>()));
    }

    // Метод кој ја враќа листата со сите песни
    public List<Song> findAll() {
        return songs;
    }

    // Метод кој ја враќа песната со дадениот trackId
    public Song findByTrackId(String trackId) {
        return songs.stream()
                .filter(song -> song.getTrackId().equals(trackId))
                .findFirst()
                .orElse(null);
    }

    // Метод за додавање нов артист во листата од изведувачи за дадена песна
    public Artist addArtistToSong(Artist artist, Song song) {
        song.getPerformers().add(artist);
        return artist;
    }
}
