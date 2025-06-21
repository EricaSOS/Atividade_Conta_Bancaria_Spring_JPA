package com.example.Atividade_Conta_Bancaria_Spring_JPA.versionado.repositorio;

import com.example.Atividade_Conta_Bancaria_Spring_JPA.versionado.modelo.ContaBancariaVersionada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContaBancariaVersionada extends JpaRepository <ContaBancariaVersionada,Long>{
    
}
