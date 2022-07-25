package meli.bootcamp.joalheria.service;

import meli.bootcamp.joalheria.model.Material;
import meli.bootcamp.joalheria.repository.IMaterialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MaterialService implements IMaterialService {

    @Autowired
    private IMaterialRepo repo;

    @Override
    public Material createMaterial(Material newMaterial) {
        return repo.save(newMaterial);
    }

    @Override
    public Optional<Material> getById(Long id) {
        return repo.findById(id);
    }
}
