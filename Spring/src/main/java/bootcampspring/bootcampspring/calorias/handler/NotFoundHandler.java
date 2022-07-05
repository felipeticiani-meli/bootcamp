package bootcampspring.bootcampspring.calorias.handler;

import bootcampspring.bootcampspring.calorias.exception.NotFoundException;
import bootcampspring.bootcampspring.calorias.exception.NotFoundExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class NotFoundHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<NotFoundExceptionDetails> handlerNotFoundEx(NotFoundException ex) {
        return new ResponseEntity<>(
                NotFoundExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .title("Object not found.")
                        .message(ex.getMessage())
                        .build(),
                HttpStatus.NOT_FOUND
        );
    }
}
