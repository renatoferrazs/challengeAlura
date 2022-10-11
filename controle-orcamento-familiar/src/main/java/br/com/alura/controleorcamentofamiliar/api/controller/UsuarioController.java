package br.com.alura.controleorcamentofamiliar.api.controller;

import br.com.alura.controleorcamentofamiliar.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return usuarioRepository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

}
