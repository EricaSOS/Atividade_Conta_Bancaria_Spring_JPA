package com.example.Atividade_Conta_Bancaria_Spring_JPA.versionado.modelo;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ContaBancariaVersionada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCliente;

    private float saldo;

    @Version
    private LocalDateTime dataMovimento;

    public ContaBancariaVersionada() {}

    public ContaBancariaVersionada(String nomeCliente, float saldo) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.dataMovimento = LocalDateTime.now();
    }

    public void deposita(float valor) {
        this.saldo += valor;
        this.dataMovimento = LocalDateTime.now();
    }

    public void retirada(float valor) {
        this.saldo -= valor;
        this.dataMovimento = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(LocalDateTime dataMovimento) {
        this.dataMovimento = dataMovimento;
    }
}
