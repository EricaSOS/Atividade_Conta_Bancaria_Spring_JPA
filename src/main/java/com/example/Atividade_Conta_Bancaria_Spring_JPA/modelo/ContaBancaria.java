/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Atividade_Conta_Bancaria_Spring_JPA.modelo;

import jakarta.persistence.*;

@Entity
public class ContaBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCliente;
    private float saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, float saldo) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void deposita(float valor) {
        this.saldo += valor;
    }

    public void retirada(float valor) {
        this.saldo -= valor;
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
}