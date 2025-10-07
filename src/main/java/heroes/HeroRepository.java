package heroes;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroRepository extends ListCrudRepository<Hero, Long> {
    List<Hero> findByNameContainingIgnoreCase(String nameFilter);
}
