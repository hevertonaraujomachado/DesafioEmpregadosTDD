# 🧪 Desafio Empregados - TDD (Spring Boot)

Projeto desenvolvido com **Spring Boot** utilizando **TDD (Test Driven Development)**.

O sistema foi implementado a partir de um desafio proposto pelo Professor Nélio Alves, com foco em boas práticas de desenvolvimento backend.

O sistema gerencia **funcionários (Employees)** e **departamentos (Departments)** com relacionamento N-1.

---

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database (ambiente de teste)
- JUnit 5
- Mockito
- Maven
- REST API
- TDD (Test Driven Development)

---

## 🏗️ Modelo de domínio

### Department
- id (Long)
- name (String)

### Employee
- id (Long)
- name (String)
- email (String)
- department (ManyToOne)

Relacionamento:
- Um departamento pode ter vários funcionários (N-1).

---

## 📌 Endpoints da API

### 🔹 Buscar departamentos (ordenados por nome)


Resposta:
```json
[
  {
    "id": 2,
    "name": "Management"
  },
  {
    "id": 1,
    "name": "Sales"
  },
  {
    "id": 3,
    "name": "Training"
  }
]
GET /employees?page=0&size=10&sort=name,asc
{
  "content": [
    {
      "id": 1,
      "name": "Alex",
      "email": "alex@gmail.com",
      "department": {
        "id": 1,
        "name": "Sales"
      }
    }
  ],
  "totalElements": 14,
  "totalPages": 2,
  "number": 0
}
🧪 Testes automatizados (TDD)

O projeto foi desenvolvido seguindo a metodologia TDD:

Análise dos testes automatizados

Implementação das funcionalidades

Refatoração do código

Garantia de que todos os testes passam ✅

🗂️ Estrutura do projeto
src/main/java/com/devsuperior/demo
│
├── controllers
├── services
├── repositories
├── entities
├── dto
└── DemoApplication.java

▶️ Como executar o projeto
1️⃣ Clonar o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

2️⃣ Entrar no projeto
cd DesafioEmpregadosTDD

3️⃣ Executar o projeto
mvn spring-boot:run

🧪 Executar os testes
mvn test

📚 Créditos

Desafio proposto pelo Professor Nélio Alves
Implementação realizada pelo aluno Heverton Araújo

👨‍💻 Autor

Heverton Araújo
💻 Backend Java | Spring Boot

⭐ Se você gostou do projeto, deixe uma estrela no repositório!
