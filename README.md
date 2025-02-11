# DSList - API de Listas de Jogos 🎮

[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2%2B-brightgreen)](https://spring.io/projects/spring-boot)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Uma API RESTful desenvolvida em Java Spring Boot para gerenciamento de listas de jogos, com funcionalidades completas de CRUD e integração com banco de dados em memória H2.

## ✨ Funcionalidades

- **CRUD Completo** de Games e Game Lists
- Endpoints RESTful seguindo boas práticas
- Paginação e ordenação de resultados
- Banco de dados H2 em memória (modo desenvolvimento)
- Documentação integrada do H2 Database Console

## 🛠️ Tecnologias

- **Java 17**
- **Spring Boot 3.2+**
  - Spring Web
  - Spring Data JPA
  - Spring DevTools
- **H2 Database** (em memória)
- **Maven**
- **ModelMapper** (para DTOs)

## 🚀 Como Executar

### Pré-requisitos
- Java 17 JDK
- Maven 3.8+
- Postman ou similar (para testar endpoints)


A aplicação estará disponível em: `http://localhost:8080`

### Acessar H2 Console
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:dslist`
- User: `sa`
- Password: (vazio)

## 📚 Endpoints Principais

| Método | Endpoint               | Descrição                     |
|--------|------------------------|-------------------------------|
| GET    | /games                 | Lista todos os jogos          |
| GET    | /games/{id}            | Busca jogo por ID             |
| POST   | /games                 | Cria novo jogo                |
| PUT    | /games/{id}            | Atualiza jogo existente       |
| DELETE | /games/{id}            | Remove jogo                   |
| GET    | /lists                 | Lista todas as listas         |
| POST   | /lists/{listId}/replacement | Move jogos entre listas |



## 📄 Estrutura do Projeto

```
dslist/
├── src/
│   ├── main/
│   │   ├── java/com/dslist/
│   │   │   ├── controllers/       # Camada de controllers
│   │   │   ├── dtos/              # Objetos de transferência de dados
│   │   │   ├── entities/          # Entidades JPA
│   │   │   ├── repositories/      # Interfaces Spring Data JPA
│   │   │   ├── services/          # Lógica de negócio
│   │   │   └── DslistApplication.java
│   │   └── resources/
│   │       ├── application.properties # Configurações
│   │       └── data.sql            # Dados iniciais
├── pom.xml                        # Dependências Maven
```


Este README pode ser personalizado com:
- Screenshots da API em ação
- Diagrama de arquitetura
- Exemplos de requests/responses
- Badges adicionais
- Link para documentação Swagger/OpenAPI (se disponível)
