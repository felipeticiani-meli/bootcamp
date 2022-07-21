package bootcampspring.bootcampspring.concessionaria.controller;

import bootcampspring.bootcampspring.concessionaria.dto.VeiculoDto;
import bootcampspring.bootcampspring.concessionaria.model.Veiculo;
import bootcampspring.bootcampspring.concessionaria.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoRepo repo;

    @GetMapping
    public ResponseEntity<List<VeiculoDto>> getAll() {
        return ResponseEntity.ok(repo.getAll());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void save(Veiculo novoVeiculo) {
        repo.save(novoVeiculo);
    }
}
