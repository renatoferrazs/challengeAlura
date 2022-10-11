package br.com.alura.controleorcamentofamiliar.api.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "receita")
public class ReceitaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idReceita;
    @Column(nullable = false, length = 50)
    private String descricao;
    @Column(nullable = false, length = 50)
    private Double valor;
    private LocalDate data;

    public ReceitaModel() { }

    public ReceitaModel(Integer idReceita, String descricao, Double valor, LocalDate data) {
        this.idReceita = idReceita;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }
    public ReceitaModel(String descricao, Double valor, LocalDate data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public Integer getIdReceita() {
        return idReceita;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setIdReceita(Integer idReceita) {
        this.idReceita = idReceita;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
