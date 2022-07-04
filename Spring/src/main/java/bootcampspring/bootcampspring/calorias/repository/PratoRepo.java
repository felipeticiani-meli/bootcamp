package bootcampspring.bootcampspring.calorias.repository;

import bootcampspring.bootcampspring.calorias.model.Ingrediente;
import bootcampspring.bootcampspring.calorias.model.Prato;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Repository
public class PratoRepo implements Dao<Prato>{
    private final String fileAddress = "src/main/resources/pratos.json";

    @Override
    public List<Prato> getAll() {
        ObjectMapper mapper = new ObjectMapper();
        List<Prato> lista = null;
        try {
            lista = Arrays.asList(mapper.readValue(new File(fileAddress), Prato[].class));
        } catch(Exception err) {
            System.out.println("Erro no getAll.");
        }
        return lista;
    }

    @Override
    public Prato getFirstByName(String name) {
        List<Prato> lista = this.getAll();
        for (Prato prato : lista) {
            if (prato.getName().toLowerCase().contains(name.toLowerCase())) {
                return prato;
            }
        }
        return null;
    }

    @Override
    public List<Prato> getListByName(String name) {
        List<Prato> lista = this.getAll();
        return lista
                .stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    public String getTotalCalories(String name) {
        Prato prato = this.getFirstByName(name);
        int totalCalories = 0;
        for (Ingrediente i : prato.getIngredients()) {
            totalCalories += i.getCalories();
        }
        return "Total de calorias do prato: " + totalCalories;
    }

    public Ingrediente getHighestCalorie(String name) {
        Prato prato = this.getFirstByName(name);
        Ingrediente ingrediente = prato.getIngredients()
                .stream().max(Comparator.comparing(Ingrediente::getCalories))
                .orElseThrow(NoSuchElementException::new);
        return ingrediente;
    }
}
