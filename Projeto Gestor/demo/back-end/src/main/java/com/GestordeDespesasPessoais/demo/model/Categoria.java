package com.GestordeDespesasPessoais.demo.model;

import jakarta.persistence.*;
import lombok.*;

public class Categoria {
    private String nome;
    private String descricao;
    private int id;

    public Categoria(String nome, String descricao, int id) {
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
    }
}
