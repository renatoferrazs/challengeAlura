package br.com.alura.controleorcamentofamiliar.api.repository;

import br.com.alura.controleorcamentofamiliar.api.model.ReceitaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<ReceitaModel,Integer> {
}
