package bootcampspring.bootcampspring.concessionaria.repository;

import bootcampspring.bootcampspring.calorias.exception.NotFoundException;
import bootcampspring.bootcampspring.concessionaria.dto.VeiculoDto;
import bootcampspring.bootcampspring.concessionaria.model.Veiculo;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class VeiculoRepo {
    private final String fileAddress = "src/main/resources/veiculos.json";

    public List<VeiculoDto> getAll() {
        ObjectMapper mapper = new ObjectMapper();
        List<Veiculo> listaVeiculos;
        List<VeiculoDto> listaDto;
        try {
            listaVeiculos = Arrays.asList(mapper.readValue(new File(fileAddress), Veiculo[].class));
            listaDto = listaVeiculos.stream().map(VeiculoDto::new).collect(Collectors.toList());
            return listaDto;
        } catch(Exception err) {
            System.out.println("Erro no getAll.");
        }
        throw new NotFoundException("Nenhum veículo encontrado.");
    }

    public void save(Veiculo novoVeiculo) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        List<Veiculo> listaAtual;
        try {
            listaAtual = Arrays.asList(mapper.readValue(new File(fileAddress), Veiculo[].class));
            List<Veiculo> novaLista = new ArrayList<>(listaAtual);
            novaLista.add(novoVeiculo);
            writer.writeValue(new File(fileAddress), novaLista);
        } catch (Exception err) {
            System.out.println("Erro ao salvar o veículo.");
        }
    }

}
