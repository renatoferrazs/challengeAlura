package br.com.alura.controleorcamentofamiliar.api.controller;

import br.com.alura.controleorcamentofamiliar.api.model.ReceitaModel;
import br.com.alura.controleorcamentofamiliar.api.repository.ReceitaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/receita")
public class ReceitaController {

    @Autowired
    private ReceitaRepository receitaRepository;

    @GetMapping
    public List<ReceitaModel> getAllReceitas(){
        return receitaRepository.findAll();
    }
    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<ReceitaModel> getReceitasById(@PathVariable Integer id){
        return receitaRepository.findById(id);
    }

    @PostMapping(value = "/salvar")
    public ReceitaModel saveReceita(@RequestBody ReceitaModel receita){
        return receitaRepository.save(receita);
    }

    @DeleteMapping(value = "{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletaReceita(@PathVariable Integer id){
        receitaRepository.deleteById(id);
    }

}
