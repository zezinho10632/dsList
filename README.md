# DSList

**DSList** é uma aplicação desenvolvida em Java utilizando o framework **Spring Boot**. O objetivo do projeto é gerenciar uma lista de jogos, permitindo a visualização e manipulação de dados relacionados a jogos. Esta aplicação é uma excelente oportunidade para aprender sobre desenvolvimento de APIs RESTful e integração com bancos de dados.

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.3.8
- Spring Data JPA
- H2 Database (para desenvolvimento e testes)
- PostgreSQL (para produção)
- Maven como gerenciador de dependências

## Funcionalidades

- Listar todos os jogos cadastrados.
- Armazenar informações sobre jogos, incluindo título, ano de lançamento, gênero, plataformas, pontuação, imagens e descrições.
- Interface de console H2 para visualização e manipulação de dados.

## Como Executar o Projeto

1. **Clone o repositório:**
   ```
   git clone https://github.com/seu_usuario/dslist.git
   cd dslist
   ```

2. **Compile e execute a aplicação:**
   ```
   ./mvnw spring-boot:run
   ```

3. **Acesse a aplicação:**
   A aplicação estará disponível em `http://localhost:8080/game`.

## Banco de Dados

O projeto utiliza o H2 como banco de dados em memória para desenvolvimento e testes. Para visualizar os dados, você pode acessar o console H2 em `http://localhost:8080/h2-console` com as seguintes configurações:

- JDBC URL: `jdbc:h2:mem:testdb`
- User Name: `sa`
- Password: (deixe em branco)




