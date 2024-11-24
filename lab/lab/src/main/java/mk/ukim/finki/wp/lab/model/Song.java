package mk.ukim.finki.wp.lab.model;

import java.util.List;

public class Song {
    private String trackId;
    private String title;
    private String genre;
    private int releaseYear;
    private List<Artist> performers;

    // Конструктор без параметри
    public Song() {
    }

    // Конструктор со параметри
    public Song(String trackId, String title, String genre, int releaseYear, List<Artist> performers) {
        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers = performers;
    }

    // Гетери и сетери
    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<Artist> getPerformers() {
        return performers;
    }

    public void setPerformers(List<Artist> performers) {
        this.performers = performers;
    }

    // Метод за да ја претставите класата како String
    @Override
    public String toString() {
        return "Song{" +
                "trackId='" + trackId + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", performers=" + performers +
                '}';
    }
}
