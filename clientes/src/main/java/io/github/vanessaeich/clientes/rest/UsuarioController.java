package io.github.vanessaeich.clientes.rest;

import io.github.vanessaeich.clientes.model.entity.Usuario;
import io.github.vanessaeich.clientes.model.repository.UsuarioRepository;
import io.github.vanessaeich.clientes.rest.exception.UsuarioCadastradoException;
import io.github.vanessaeich.clientes.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

/**
 * @author Vanessa Eich
 * @created 05/05/2022
 */
@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid Usuario usuario) {
        try {
            service.salvar(usuario);
        } catch (UsuarioCadastradoException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
}