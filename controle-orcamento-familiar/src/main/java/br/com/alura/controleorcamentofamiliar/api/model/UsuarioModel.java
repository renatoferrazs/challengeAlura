package br.com.alura.controleorcamentofamiliar.api.model;

import javax.persistence.*;

@Entity(name = "usuario") //o Entity meio que mostra pro java que essa classe é uma entidade de banco de dados/ uma tabela com o nome usuario, essa é uma anotação do JPA
public class UsuarioModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer idUsuario;
    @Column(nullable = false, length = 50)
    public String nome;

    //Construtor vazio
    public UsuarioModel() {
    }

    //Construtor com os campos
    public UsuarioModel(Integer idUsuario, String nome) {
        this.idUsuario = idUsuario;
        this.nome = nome;
    }

//Geters
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

//Seters
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
