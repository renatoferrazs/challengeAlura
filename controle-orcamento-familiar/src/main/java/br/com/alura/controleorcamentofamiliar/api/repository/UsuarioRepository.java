package br.com.alura.controleorcamentofamiliar.api.repository;

import br.com.alura.controleorcamentofamiliar.api.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
