# Atividade Prática: Conta Bancária com Spring Boot, JPA e Testes de Concorrência

## 📚 Introdução

Este projeto é uma atividade prática da disciplina Aplicação de Banco de Dados, utilizando Spring Boot, JPA (Java Persistence API) e Testes de Concorrência para implementar uma aplicação que realiza operações básicas de contas bancárias, incluindo criação, consulta geral e por ID, depósito, retirada e exclusão de contas.

O projeto foi dividido em duas versões:
- Versão simples (sem controle de concorrência);
- Versão com controle de concorrência otimista, utilizando a anotação `@Version`.

Cada versão conta com sua própria entidade, repositório e controlador REST.

---

## 💻 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.5.0
- Spring Data JPA
- H2 Database (modo arquivo)
- Apache Maven
- Apache JMeter
- IDE recomendada: NetBeans, mas pode ser usada a Intellij ou VS Code com suporte a Maven.

---

## 📦 Dependências

As principais dependências do projeto estão no `pom.xml`:

- `spring` (boot, data-jpa, web)
- `hibernate` (provedor JPA)
- `h2` (banco de dados)
- Outras bibliotecas auxiliares

---

## ▶️ Como Executar

1. Clone o projeto e abra na sua IDE Java com suporte a Maven;
2. Ao abrir e realizar as configurações necessárias, clique com o botão direito do mouse sobre o projeto e escolha a opção "Build";
3. Após isso, execute a classe principal `AtividadeContaBancariaSpringJpaApplication.java`, para a subida do servidor;
4. Se estiver tudo certo, o servidor será iniciado com sucesso. Você verá no terminal uma mensagem indicando o link de acesso: http://localhost:8080/contas;
5. Logo depois, abra o browser e cole o link do passo anterior;
6. Será exibida uma tela com a array vazia "[]";
7. Para realizar os testes, pode-se usar o prompt cmd do windows, JMEter, console do h2, como se verá nos próximos tópicos;
8. Para encerrar, basta clicar no botão stop existente no terminal do NetBeans.

---



## 📝 Observações

- Este projeto é exclusivamente acadêmico.

---

## 👩‍💻 Autoria

Desenvolvido por Érica Santos Oliveira da Silva.  
Curso de Tecnologia em Análise e Desenvolvimento de Sistemas  
Disciplina: Aplicação de Banco de Dados
Professor: Cláudio Martins  
Entrega em: 21/06/2025

2º Projeto da disciplina Prática de Banco de Dados - CRUD com Spring Boot e testes de concorrência.

Configuração spring
https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.5.0&packaging=jar&jvmVersion=21&groupId=com.example&artifactId=Atividade_Conta_Bancaria_Spring_JPA&name=Atividade_Conta_Bancaria_Spring_JPA&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.Atividade_Conta_Bancaria_Spring_JPA&dependencies=web,devtools,data-jpa,h2
