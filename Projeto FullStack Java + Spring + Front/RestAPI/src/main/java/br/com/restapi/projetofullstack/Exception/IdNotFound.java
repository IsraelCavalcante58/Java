package br.com.restapi.projetofullstack.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Usuário com esse id não encontrado")
public class IdNotFound extends RuntimeException {


    public IdNotFound(String message) {
        super(message);
    }

    public IdNotFound(Throwable t) {
        super(t);
    }
}


