package br.com.alura.controleorcamentofamiliar.api.controller;

import br.com.alura.controleorcamentofamiliar.api.model.DespesaModel;
import br.com.alura.controleorcamentofamiliar.api.repository.DespesaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/despesa")
public class DespesaController {

    @Autowired
    private DespesaRepository despesaRepository;


    //Listar todas Despesas
   @GetMapping
    public List<DespesaModel> getAllDespesas(){
        return despesaRepository.findAll();
    }

    //listar Despesa por Id
    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<DespesaModel> getDespesaById(@PathVariable Integer id){
        return despesaRepository.findById(id);

    }

    //Salva Despesa
    @PostMapping(value = "/salvar")
    @ResponseStatus(HttpStatus.OK)
    public DespesaModel saveDespesa(@RequestBody DespesaModel despesa){
       return despesaRepository.save(despesa);
    }

    @DeleteMapping(value = "{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletDespesaById(@PathVariable Integer id){
        despesaRepository.deleteById(id);
    }



}
