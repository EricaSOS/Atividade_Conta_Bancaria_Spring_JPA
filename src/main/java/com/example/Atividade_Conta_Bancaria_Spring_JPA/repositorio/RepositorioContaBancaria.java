/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Atividade_Conta_Bancaria_Spring_JPA.repositorio;

import com.example.Atividade_Conta_Bancaria_Spring_JPA.modelo.ContaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContaBancaria extends JpaRepository<ContaBancaria, Long>{
    
}
