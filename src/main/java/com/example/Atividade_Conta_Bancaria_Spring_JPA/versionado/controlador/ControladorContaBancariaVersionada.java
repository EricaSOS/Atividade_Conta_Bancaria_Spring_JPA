package com.example.Atividade_Conta_Bancaria_Spring_JPA.versionado.controlador;

import com.example.Atividade_Conta_Bancaria_Spring_JPA.versionado.modelo.ContaBancariaVersionada;
import com.example.Atividade_Conta_Bancaria_Spring_JPA.versionado.repositorio.RepositorioContaBancariaVersionada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/contas-versionadas")

public class ControladorContaBancariaVersionada {
    @Autowired
    private RepositorioContaBancariaVersionada repositorio;

    @GetMapping
    public List<ContaBancariaVersionada> listar() {
        return repositorio.findAll();
    }
    
    @GetMapping("/{id}")
    public ContaBancariaVersionada buscarPorId(@PathVariable Long id) {
        return repositorio.findById(id).orElseThrow();
    }

    @PostMapping
    public ContaBancariaVersionada criar(@RequestBody ContaBancariaVersionada conta) {
        return repositorio.save(conta);
    }

    @PutMapping("/{id}/deposito")
    public ContaBancariaVersionada depositar(@PathVariable Long id, @RequestParam float valor) {
        ContaBancariaVersionada conta = repositorio.findById(id).orElseThrow();
        conta.deposita(valor);
        return repositorio.save(conta);
    }

    @PutMapping("/{id}/retirada")
    public ContaBancariaVersionada retirar(@PathVariable Long id, @RequestParam float valor) {
        ContaBancariaVersionada conta = repositorio.findById(id).orElseThrow();
        conta.retirada(valor);
        return repositorio.save(conta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repositorio.deleteById(id);
    }

    // Coloquei um tratamento de concorrência
    @ExceptionHandler(OptimisticLockingFailureException.class)
    public String conflitoConcorrencia() {
        return ">>>️ Conflito de concorrência detectado! A conta foi modificada por outro processo.";
    }
}
