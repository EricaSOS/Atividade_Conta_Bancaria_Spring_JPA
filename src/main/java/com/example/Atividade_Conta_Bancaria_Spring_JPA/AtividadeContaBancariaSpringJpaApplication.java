package com.example.Atividade_Conta_Bancaria_Spring_JPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeContaBancariaSpringJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AtividadeContaBancariaSpringJpaApplication.class, args);
	}
        
        @Override
        public void run(String... args) {
            System.out.println("🌐 Servidor iniciado com sucesso!");
            System.out.println("🔗 Acesse: http://localhost:8080/contas");
            System.out.println("💡 Para parar o servidor, pressione CTRL + C.");
        }

}