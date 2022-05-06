package io.github.vanessaeich.clientes.util;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author Vanessa Eich
 * @created 03/05/2022
 */
@Component
public class BigDecimalConverter {

    public BigDecimal converter(String value){
        if(value==null){
            return null;
        }
        value = value.replace(".", "").replace(",", ".");
        return new BigDecimal(value);
    }
}
