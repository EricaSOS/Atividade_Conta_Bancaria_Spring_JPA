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
4. Se estiver tudo certo, o servidor será iniciado com sucesso. Você verá no terminal uma mensagem indicando o link de acesso: http://localhost:8080/contas ou http://localhost:8080/contas-versionadas;
5. Logo depois, abra o browser e cole o link do passo anterior;
6. Será exibida uma tela com a array vazia "[]";
7. Para realizar os testes, pode-se usar o prompt cmd do windows, JMEter, console do h2, como se verá nos próximos tópicos;
8. Para encerrar, basta clicar no botão stop existente no terminal do NetBeans.

### 📬 Endpoints disponíveis
Os endpoints abaixo, servem tanto para a versão simples (/contas), como para a versão com controle (/contas-versionadas):
- POST /contas : Criar nova conta
- GET /contas : Listar todas as contas
- GET /contas/{id} : Buscar conta por ID
- PUT /contas/{id}/deposito?valor=100 : Depositar valor
- PUT /contas/{id}/retirada?valor=50 : Retirar valor
- DELETE /contas/{id} : Excluir conta

### 🧪 Testes com JMeter
Todos os endpoints foram testados com o JMeter. Plano de testes salvo em: /testes/testes-conta-bancaria.jmx

Para executar o teste, você deve seguir os seguintes passos:
1. Instale o JMeter;
2. Abra o plano de testes ".jmx", baixado;
3. Clique em “Start” ▶️;
4. Visualize os resultados nos painéis “Summary Report” ou “View Results Tree”.

<b>O Plano de Testes possui dois grupos de Threads, um para a versão simples e o outro para a versão com controle. Para executar apenas uma delas, clique com o botão auxiliar do mouse sobre a Thread que deseja executar e clique em Start.<b>

### 🧪 Testes manuais via terminal (curl)
Digite os seguintes comandos no prompt Windows (cmd).
- Criar nova conta : curl -X POST http://localhost:8080/contas-versionadas -H "Content-Type: application/json" -d "{\"nomeCliente\":\"Teste\",\"saldo\":100}"
- Consultar conta por ID: curl http://localhost:8080/contas-versionadas/1
- Consultar contas registradas: curl http://localhost:8080/contas-versionadas
- Depositar valor: curl -X PUT "http://localhost:8080/contas-versionadas/1/deposito?valor=50"
- Sacar/Retirar valor: curl -X PUT "http://localhost:8080/contas-versionadas/1/retirada?valor=30"
- Deletar conta: curl -X DELETE http://localhost:8080/contas-versionadas/1

<b>Para testar a versão simples, basta trocar "/contas-versionadas" por "/contas" nos comandos acima.<b>

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
