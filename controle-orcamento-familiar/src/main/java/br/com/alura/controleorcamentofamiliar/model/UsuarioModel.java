package br.com.alura.controleorcamentofamiliar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "usuario") //o Entity meio que mostra pro java que essa classe é uma entidade de banco de dados/ uma tabela com o nome usuario, essa é uma anotação do JPA
public class UsuarioModel {
    
    @Id
    @GeneratedValue
    public Integer idUsuario;
    public String nome;

    //Construtor vazio
    public UsuarioModel() {
    }

    //Construtor com os campos
    public UsuarioModel(Integer idUsuario, String nome) {
        this.idUsuario = idUsuario;
        this.nome = nome;
    }

//Geters e seters
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
