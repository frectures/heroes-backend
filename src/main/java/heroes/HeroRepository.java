package heroes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends CrudRepository<Hero, Long> {
    Iterable<Hero> findByNameContainingIgnoreCase(String nameFilter);
}
