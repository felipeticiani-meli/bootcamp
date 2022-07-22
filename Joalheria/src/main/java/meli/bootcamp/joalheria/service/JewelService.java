package meli.bootcamp.joalheria.service;

import meli.bootcamp.joalheria.model.Jewel;
import meli.bootcamp.joalheria.repository.IJewelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JewelService implements IJewelService {

    @Autowired
    private IJewelRepo repo;

    @Override
    public Jewel createJewel(Jewel newJewel) {
        if (newJewel.getId() != null) return null;
        return repo.save(newJewel);
    }

    @Override
    public List<Jewel> getAllJewels() {
        List<Jewel> jewels = new ArrayList<>();
        repo.findAll().forEach(jewels::add);
        return jewels;
    }
}
