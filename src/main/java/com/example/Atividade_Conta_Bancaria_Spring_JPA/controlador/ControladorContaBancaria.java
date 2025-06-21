package com.example.Atividade_Conta_Bancaria_Spring_JPA.controlador;

import com.example.Atividade_Conta_Bancaria_Spring_JPA.modelo.ContaBancaria;
import com.example.Atividade_Conta_Bancaria_Spring_JPA.repositorio.RepositorioContaBancaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")

public class ControladorContaBancaria {
    @Autowired
    private RepositorioContaBancaria repositorio;

    @GetMapping
    public List<ContaBancaria> listar() {
        return repositorio.findAll();
    }
    
    @GetMapping("/{id}")
    public ContaBancaria buscarPorId(@PathVariable Long id) {
        return repositorio.findById(id).orElseThrow();
    }

    @PostMapping
    public ContaBancaria criar(@RequestBody ContaBancaria conta) {
        return repositorio.save(conta);
    }

    @PutMapping("/{id}/deposito")
    public ContaBancaria depositar(@PathVariable Long id, @RequestParam float valor) {
        ContaBancaria conta = repositorio.findById(id).orElseThrow();
        conta.deposita(valor);
        return repositorio.save(conta);
    }

    @PutMapping("/{id}/retirada")
    public ContaBancaria retirar(@PathVariable Long id, @RequestParam float valor) {
        ContaBancaria conta = repositorio.findById(id).orElseThrow();
        conta.retirada(valor);
        return repositorio.save(conta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repositorio.deleteById(id);
    }
}

