CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    login VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

