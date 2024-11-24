package mk.ukim.finki.wp.lab.web;

import mk.ukim.finki.wp.lab.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongListServlet {

    private final SongService songService;

    // Autowire the SongService to access the songs
    @Autowired
    public SongListServlet(SongService songService) {
        this.songService = songService;
    }

    // Map the servlet to the /listSongs path
    @GetMapping("/listSongs")
    public String listSongs(Model model) {
        // Get the list of songs from the service
        model.addAttribute("songs", songService.listSongs());
        // Return the name of the view to be displayed
        return "songList";
    }
}
