package meli.bootcamp.joalheria.service;

import meli.bootcamp.joalheria.model.Jewel;
import meli.bootcamp.joalheria.repository.IJewelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Jewel> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void deleteJewel(Long id) {
        if (repo.findById(id).isPresent())
            repo.deleteById(id);

        // TODO: throw exception when not found
    }

    @Override
    public Jewel updateJewel(Jewel jewel) {
        Optional<Jewel> foundJewel = repo.findById(jewel.getId());
        if (foundJewel.isPresent())
            repo.save(jewel);
        return null; // TODO: throw exception
    }


}
