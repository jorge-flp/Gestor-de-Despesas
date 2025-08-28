package com.GestordeDespesasPessoais.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private Double valor;
    private LocalDate data;

    @Enumerated(EnumType.STRING)
    private Transacao tipo;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Usuario usuario;
}
