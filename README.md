# 🛒 DSCommerce

Projeto fullstack desenvolvido durante o curso do professor Nélio Alves (DevSuperior), utilizando **React** no frontend e **Spring** no backend. A aplicação simula um sistema de e-commerce, com funcionalidades de autenticação, gerenciamento de produtos, categorias, usuários e pedidos.

## 📌 Tecnologias Utilizadas

### Backend (Java + Spring Boot)
- **Spring Web** – criação de APIs REST
- **Spring Data JPA** – persistência com ORM
- **Spring Security** – autenticação e autorização
- **JWT & OAuth2** – segurança com tokens
- **Bean Validation** – validações com anotações
- **Banco de Dados SQL**: PostgreSQL

### Frontend (React + TypeScript)
- **Vite** – estrutura de build moderna
- **Axios** – requisições HTTP
- **React Router DOM** – rotas da aplicação
- **Context API** – gerenciamento de autenticação

## 🔐 Autenticação

O projeto utiliza autenticação baseada em **JWT** com **OAuth2**, onde usuários podem se autenticar e acessar rotas protegidas com base no seu perfil (admin ou cliente). Os tokens são armazenados localmente no navegador para requisições autenticadas.

## 🔄 Funcionalidades

- Login de usuários
- Listagem de produtos e categorias
- Cadastro e atualização de produtos (admin)
- Visualização de pedidos do usuário
- Sistema de roles (Admin e Cliente)
- Validações no backend e frontend
- Layout responsivo

## 🧪 Como Executar

### Backend

```bash
# Acesse a pasta do backend
cd backend

# Instale as dependências (caso use Maven Wrapper)
./mvnw clean install

# Rode a aplicação
./mvnw spring-boot:run
```

### Frontend

```bash
# Acesse a pasta do frontend
cd frontend

# Instale as dependências
npm install

# Inicie o servidor de desenvolvimento
npm run dev
```
