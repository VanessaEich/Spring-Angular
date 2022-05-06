package io.github.vanessaeich.clientes.rest.exception;

/**
 * @author Vanessa Eich
 * @created 05/05/2022
 */
public class UsuarioCadastradoException extends RuntimeException {

    public UsuarioCadastradoException( String login ){
        super("Usuário já cadastrado para o login " + login);
    }
}
