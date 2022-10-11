package br.com.alura.controleorcamentofamiliar.api.repository;

import br.com.alura.controleorcamentofamiliar.api.model.DespesaModel;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface DespesaRepository extends JpaRepository<DespesaModel,Integer> {
}
