package mk.ukim.finki.wp.lab.web;

import mk.ukim.finki.wp.lab.service.ArtistService;
import mk.ukim.finki.wp.lab.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArtistServlet {

    private final ArtistService artistService;
    private final SongService songService;

    @Autowired
    public ArtistServlet(ArtistService artistService, SongService songService) {
        this.artistService = artistService;
        this.songService = songService;
    }

    @GetMapping("/artist")
    public String showArtistPage(@RequestParam("trackId") String trackId, Model model) {
        // Fetch the song by trackId
        model.addAttribute("song", songService.findByTrackId(trackId));

        // Add the list of artists to the model
        model.addAttribute("artists", artistService.listArtists());

        // Pass the trackId to the view
        model.addAttribute("trackId", trackId);

        return "artistsList";
    }
}
