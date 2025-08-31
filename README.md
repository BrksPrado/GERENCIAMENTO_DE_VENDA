# Trabalho Parcial Entidades - Engenharia de Software

Sistema de gerenciamento de vendas desenvolvido com **Quarkus** e **MySQL** para a disciplina de Padrões de Desenvolvimento Web.

## + Sobre o Projeto

Este projeto implementa um sistema de entidades para gerenciar:
- **Categorias** e **Fabricantes**
- **Produtos** com controle de estoque
- **Clientes** e **Funcionários**
- **Vendas** e **Itens de Venda**

## + Como Executar

### 1. Compilar o projeto
```bash
./mvnw clean package -DskipTests
```

### 2. Executar a aplicação
```bash
java -jar target/quarkus-app/quarkus-run.jar
```

### 3. Modo de desenvolvimento
```bash
./mvnw quarkus:dev
```

## + Funcionalidades

O sistema carrega dados automaticamente do arquivo `import.sql` e exibe:
- Lista de todas as categorias
- Lista de todos os fabricantes  
- Lista de todos os clientes
- Lista de todos os funcionários
- Lista de todos os produtos
- Lista de todas as vendas
- Lista de todos os itens de venda

## + Tecnologias Utilizadas

- **Java 23**
- **Quarkus** - Framework Java
- **Hibernate ORM com Panache** - Persistência de dados
- **MySQL** - Banco de dados
- **Maven** - Gerenciamento de dependências

## + Desenvolvedor

**Gustavo Prado** - Engenharia de Software  
*Criado em: 30/08/2025*
