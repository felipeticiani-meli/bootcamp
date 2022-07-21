package bootcampspring.bootcampspring.concessionaria.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    private int id;
    private String brand, model, currency;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date manufacturingDate;
    private int doors, numberOfKilometers , countOfOwners;
    private double price;
    @JsonProperty("services")
    private List<Service> services;

}
