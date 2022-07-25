package meli.bootcamp.joalheria.service;

import meli.bootcamp.joalheria.dto.JewelRequestDto;
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

    @Autowired
    private IMaterialService materials;

    @Override
    public Jewel createJewel(JewelRequestDto jewelDto) {
        if (jewelDto.getId() != null) return null; // TODO: throw exception
        if (materials.getById(jewelDto.getMaterial()).isEmpty()) return null; // TODO: throw exception
        Jewel newJewel = new Jewel();
        newJewel.setCarat(jewelDto.getCarat());
        newJewel.setWeight(jewelDto.getWeight());
        newJewel.setMaterial(materials.getById(jewelDto.getMaterial()).get());
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

    @Override
    public List<Jewel> getAllOrderedByMaterial() {
        List<Jewel> jewels = new ArrayList<>();
        repo.getAllOrderedByMaterial().forEach(jewels::add);
        return jewels;
    }

    @Override
    public Jewel getHeaviestJewel() {
        return repo.getHeaviestJewel();
    }


}
