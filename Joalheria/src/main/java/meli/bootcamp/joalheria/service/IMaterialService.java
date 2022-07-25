package meli.bootcamp.joalheria.service;

import meli.bootcamp.joalheria.model.Material;

import java.util.Optional;

public interface IMaterialService {
    Material createMaterial(Material newMaterial);
    Optional<Material> getById(Long id);
}
