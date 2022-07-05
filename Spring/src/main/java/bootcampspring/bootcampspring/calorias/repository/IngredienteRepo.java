package bootcampspring.bootcampspring.calorias.repository;

import bootcampspring.bootcampspring.calorias.exception.NotFoundException;
import bootcampspring.bootcampspring.calorias.model.Ingrediente;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class IngredienteRepo implements Dao<Ingrediente> {
    private final String fileAddress = "src/main/resources/food.json";

    @Override
    public List<Ingrediente> getAll() {
        ObjectMapper mapper = new ObjectMapper();
        List<Ingrediente> lista = null;
        try {
            lista = Arrays.asList(mapper.readValue(new File(fileAddress), Ingrediente[].class));
            return lista;
        } catch(Exception err) {
            System.out.println("Erro no getAll.");
        }
        if (lista != null) {
            return lista;
        }
        throw new NotFoundException("Nenhum ingrediente encontrado.");
    }

    @Override
    public Ingrediente getFirstByName(String name) {
        List<Ingrediente> lista = this.getAll();
        for (Ingrediente ingrediente : lista) {
            if (ingrediente.getName().toLowerCase().contains(name.toLowerCase())) {
                return ingrediente;
            }
        }
        throw new NotFoundException("Ingrediente não encontrado com o nome " + name + ".");
    }

    @Override
    public List<Ingrediente> getListByName(String name) {
        List<Ingrediente> lista = this.getAll();
        return lista
                .stream()
                .filter(i -> i.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.collectingAndThen(Collectors.toList(), result -> {
                    if (result.isEmpty())
                        throw new NotFoundException("Nenhum ingrediente encontrato com o nome " + name + ".");
                    return result;
                }));
    }
}
