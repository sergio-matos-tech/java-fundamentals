package controller;



import domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @GetMapping(path = "list")
    public List<Anime> animeList() {
        return List.of(Anime.builder().name("DBZ").build(), Anime.builder().name("Berserk").build());
    }
}
