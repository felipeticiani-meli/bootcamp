package bootcampspring.bootcampspring.concessionaria.dto;

import bootcampspring.bootcampspring.concessionaria.model.Veiculo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class VeiculoDto {
    private String brand, model, currency;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date manufacturingDate;
    private int doors, numberOfKilometers , countOfOwners;
    private double price;

    public VeiculoDto(Veiculo veiculo) {
        this.brand = veiculo.getBrand();
        this.model = veiculo.getModel();
        this.currency = veiculo.getCurrency();
        this.manufacturingDate = veiculo.getManufacturingDate();
        this.doors = veiculo.getDoors();
        this.numberOfKilometers = veiculo.getNumberOfKilometers();
        this.countOfOwners = veiculo.getCountOfOwners();
        this.price = veiculo.getPrice();
    }
}
