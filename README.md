

# DSList API

[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.4-brightgreen)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-orange)](LICENSE)

**DSList** é uma API RESTful desenvolvida em Java Spring Boot para gerenciar listas de jogos, permitindo a consulta e manipulação de dados de jogos e suas categorias. Ideal para desenvolvedores que desejam integrar um catálogo de jogos em suas aplicações.

## ✨ Funcionalidades Principais

- **CRUD Completo**: Operações de criação, leitura, atualização e exclusão de jogos e listas.
- **Consultas Personalizadas**: Endpoints para buscas específicas usando `Projections` do JPA.
- **Banco de Dados H2**: Configuração pronta para desenvolvimento com dados iniciais pré-carregados.
- **DTOs e Boas Práticas**: Separação clara entre entidades e modelos de transferência de dados.
- **API Documentada**: Endpoints estruturados e fáceis de testar via `Swagger` (opcional) ou ferramentas como Postman.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (ou outro banco configurável via `application.properties`)
- **Maven**
- **Lombok** (para redução de boilerplate)
- **ModelMapper** (conversão entre entidades e DTOs)

## 🚀 Como Executar

1. **Pré-requisitos**:
   - Java 17+ instalado.
   - Maven instalado (ou use o `mvnw` do projeto).
   - Git (opcional, para clonar o repositório).

2. **Clonar e Construir**:
   ```bash
   git clone https://github.com/seu-usuario/dslist.git
   cd dslist
   ./mvnw clean install
   ```

3. **Executar a Aplicação**:
   ```bash
   ./mvnw spring-boot:run
   ```
   A API estará disponível em: `http://localhost:8080`.

4. **Acessar o Banco H2 (Desenvolvimento)**:
   - URL: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:dslistdb`
   - Usuário: `sa` (senha vazia).

## 📡 Endpoints da API

### Jogos (`/games`)
| Método | Endpoint                | Descrição                          |
|--------|-------------------------|------------------------------------|
| GET    | `/games`                | Lista todos os jogos (resumo).     |
| GET    | `/games/{id}`           | Detalhes completos de um jogo.     |
| POST   | `/games`                | Cria um novo jogo.                 |
| PUT    | `/games/{id}`           | Atualiza um jogo existente.        |
| DELETE | `/games/{id}`           | Remove um jogo.                    |

### Listas (`/lists`)
| Método | Endpoint                | Descrição                          |
|--------|-------------------------|------------------------------------|
| GET    | `/lists`                | Lista todas as listas de jogos.    |
| GET    | `/lists/{id}/games`     | Jogos pertencentes a uma lista.    |
| POST   | `/lists`                | Cria uma nova lista.              |

### Exemplo de Requisição (GET)
```bash
curl -X GET "http://localhost:8080/games" -H "Content-Type: application/json"
```

## 🗃️ Modelo de Dados
```plaintext
Game
├── id (Long)
├── title (String)
├── genre (String)
├── platform (String)
├── score (Double)
└── list (associação com List)

GameList
├── id (Long)
├── name (String)
└── games (List<Game>)
```

