package meli.bootcamp.joalheria.service;

import meli.bootcamp.joalheria.model.Jewel;

import java.util.List;
import java.util.Optional;

public interface IJewelService {
    Jewel createJewel(Jewel newJewel);
    List<Jewel> getAllJewels();
    Optional<Jewel> getById(Long id);
    void deleteJewel(Long id);
    Jewel updateJewel(Jewel jewel);
    List<Jewel> getAllOrderedByMaterial();
    Jewel getHeaviestJewel();
}
