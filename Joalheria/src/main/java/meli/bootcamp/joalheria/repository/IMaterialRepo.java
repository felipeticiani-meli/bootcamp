package meli.bootcamp.joalheria.repository;

import meli.bootcamp.joalheria.model.Material;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMaterialRepo extends CrudRepository<Material, Long> {
}
