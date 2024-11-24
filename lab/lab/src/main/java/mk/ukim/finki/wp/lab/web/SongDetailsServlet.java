package mk.ukim.finki.wp.lab.web;

import mk.ukim.finki.wp.lab.service.SongService;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SongDetailsServlet {

    private final SongService songService;

    @Autowired
    public SongDetailsServlet(SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/songDetails")
    public String showSongDetails(@RequestParam("trackId") String trackId, Model model) {
        // Fetch the song by trackId
        Song song = songService.findByTrackId(trackId);

        if (song != null) {
            // Add song and its performers to the model
            model.addAttribute("song", song);
            model.addAttribute("performers", song.getPerformers());
        }

        return "songDetails";
    }
}
