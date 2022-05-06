package io.github.vanessaeich.clientes.rest.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Vanessa Eich
 * @created 29/04/2022
 */
@AllArgsConstructor
public class ApiErrors {

    @Getter
    private List<String> errors;

    public ApiErrors(String message){
        this.errors = Arrays.asList(message);
    }

}
