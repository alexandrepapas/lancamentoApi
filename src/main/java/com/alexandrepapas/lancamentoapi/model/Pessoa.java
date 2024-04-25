package com.alexandrepapas.lancamentoapi.model;

import javax.persistence.Embeddable;


import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotNull
    private String nome;

    @NotNull
    private boolean ativo;

    @Embedded
    private Endereco endereco;

    public Pessoa(Long codigo, boolean ativo, Endereco endereco, String nome) {
        this.codigo = codigo;
        this.ativo = ativo;
        this.endereco = endereco;
        this.nome = nome;
    }

    public Pessoa() {

    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
