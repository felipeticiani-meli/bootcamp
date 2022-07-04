package bootcampspring.bootcampspring.calorias.repository;

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
        } catch(Exception err) {
            System.out.println("Erro no getAll.");
        }
        return lista;
    }

    @Override
    public Ingrediente getFirstByName(String name) {
        List<Ingrediente> lista = this.getAll();
        for (Ingrediente ingrediente : lista) {
            if (ingrediente.getName().toLowerCase().contains(name.toLowerCase())) {
                return ingrediente;
            }
        }
        return null;
    }

    @Override
    public List<Ingrediente> getListByName(String name) {
        List<Ingrediente> lista = this.getAll();
        return lista
                .stream()
                .filter(i -> i.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}
