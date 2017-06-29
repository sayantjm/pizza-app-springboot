package sayant.repository;

import sayant.model.Pizza;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PizzaRepository extends CrudRepository<Pizza, Long> {

}