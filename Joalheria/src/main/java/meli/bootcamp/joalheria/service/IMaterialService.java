package meli.bootcamp.joalheria.service;

import meli.bootcamp.joalheria.model.Material;

import java.util.List;
import java.util.Optional;

public interface IMaterialService {
    Material createMaterial(Material newMaterial);
//    List<Material> getAllMaterials();
    Optional<Material> getById(Long id);
//    void deleteMaterial(Long id);
//    Material updateMaterial(Material material);
}
