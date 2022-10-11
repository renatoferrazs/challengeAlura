package br.com.alura.controleorcamentofamiliar.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "despesa")
public class DespesaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDespesa;
    @Column(nullable = false, length = 50)
    private String descricao;
    @Column(nullable = false, length = 50)
    private Double valor;
    private LocalDate data;

    //Constructors
    public DespesaModel(){};

    public DespesaModel(Integer idDespesa, String descricao, Double valor, LocalDate data) {
        this.idDespesa = idDespesa;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }
    public DespesaModel( String descricao, Double valor, LocalDate data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    //Geters
    public Integer getIdDespesa() {
        return idDespesa;
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

    //Seters
    public void setIdDespesa(Integer idDespesa) {
        this.idDespesa = idDespesa;
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
