CREATE SCHEMA IF NOT EXISTS users;

CREATE TABLE IF NOT EXISTS users.users (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    created_at TIMESTAMP NOT NULL
);

INSERT INTO users.users (id, name, email, cpf, created_at)
VALUES
    (1, 'Felipe Matheus', 'felipe@email.com', '123.456.789-00', CURRENT_TIMESTAMP),
    (2, 'Maria Silva', 'maria@email.com', '987.654.321-00', CURRENT_TIMESTAMP),
    (3, 'Joao Souza', 'joao@email.com', '111.222.333-44', CURRENT_TIMESTAMP);