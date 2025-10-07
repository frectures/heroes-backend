package heroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/heroes")
public class HeroController {
    @Autowired
    private HeroService heroService;

    @GetMapping
    public List<Hero> get() {
        return heroService.allHeroes();
    }

    @GetMapping("/{id}")
    public Hero get(@PathVariable Long id) {
        return heroService.heroById(id);
    }

    @GetMapping("/")
    public List<Hero> search(@RequestParam String name) {
        return heroService.heroesWithNamesContaining(name);
    }

    @PutMapping
    public Hero put(@RequestBody Hero hero) {
        if (hero.getId() == null) throw new IllegalArgumentException("required id on existing hero");

        return heroService.save(hero);
    }

    @PostMapping
    public Hero post(@RequestBody Hero hero) {
        if (hero.getId() != null) throw new IllegalArgumentException("forbidden id " + hero.getId() + " on new hero");

        return heroService.save(hero);
    }

    @DeleteMapping("/{id}")
    public Long delete(@PathVariable Long id) {
        heroService.delete(id);
        return id;
    }
}
