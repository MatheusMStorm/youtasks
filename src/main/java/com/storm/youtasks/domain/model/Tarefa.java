package com.storm.youtasks.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tab_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate conclusao;
    private boolean concluida;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public LocalDate getConclusao() {
        return conclusao;
    }
    public void setConclusao(LocalDate conclusao) {
        this.conclusao = conclusao;
    }
    public boolean isConcluida() {
        return concluida;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    
}
