package bootcampspring.bootcampspring.calorias.exception;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data // cria os getters e setters
@Builder
public class NotFoundExceptionDetails {
    private String title, message;
    private LocalDateTime timestamp;

}
