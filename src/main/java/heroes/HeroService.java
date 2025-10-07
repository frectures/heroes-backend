package heroes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {
    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;

        // For some reason, the Angular tutorial hero ids start with 11 instead of 1.
        wasteIdsFrom1To10();
        populateHeroes();
    }

    private void wasteIdsFrom1To10() {
        for (int id = 1; id <= 10; ++id) {
            Hero dummy = heroRepository.save(new Hero("Dummy"));
            heroRepository.delete(dummy);
        }
    }

    private void populateHeroes() {
        heroRepository.save(new Hero("Dr Nice"));
        heroRepository.save(new Hero("Narco"));
        heroRepository.save(new Hero("Bombasto"));
        heroRepository.save(new Hero("Celeritas"));
        heroRepository.save(new Hero("Magneta"));
        heroRepository.save(new Hero("RubberMan"));
        heroRepository.save(new Hero("Dynama"));
        heroRepository.save(new Hero("Dr IQ"));
        heroRepository.save(new Hero("Magma"));
        heroRepository.save(new Hero("Tornado"));
    }

    public List<Hero> allHeroes() {
        return heroRepository.findAll();
    }

    public List<Hero> heroesWithNamesContaining(String nameFilter) {
        return heroRepository.findByNameContainingIgnoreCase(nameFilter);
    }

    public Hero heroById(Long id) {
        return heroRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("missing id " + id));
    }

    public Hero save(Hero hero) {
        return heroRepository.save(hero);
    }

    public void delete(Long id) {
        heroRepository.deleteById(id);
    }
}
