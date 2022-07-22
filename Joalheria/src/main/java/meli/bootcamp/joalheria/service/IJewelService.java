package meli.bootcamp.joalheria.service;

import meli.bootcamp.joalheria.model.Jewel;

import java.util.List;

public interface IJewelService {
    Jewel createJewel(Jewel newJewel);
    List<Jewel> getAllJewels();
}
