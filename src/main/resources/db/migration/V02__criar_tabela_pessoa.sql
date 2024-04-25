CREATE TABLE pessoa (
                        codigo BIGINT(20) AUTO_INCREMENT PRIMARY KEY,
                        nome VARCHAR(100) NOT NULL,
                        ativo BOOLEAN NOT NULL,
                        logradouro VARCHAR(25),
                        numero VARCHAR(5),
                        complemento VARCHAR(20),
                        bairro VARCHAR(50),
                        cep VARCHAR(20),
                        cidade VARCHAR(50),
                        estado VARCHAR(50)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES
    ('Alexandre Papas', true, 'Rua das Flores', '123', 'Apto 45', 'Centro', '12345-678', 'São Paulo', 'SP'),
    ('Maria Silva', true, 'Avenida Brasil', '456', 'Bloco 2', 'Jardins', '98765-432', 'Rio de Janeiro', 'RJ'),
    ('João Pereira', false, 'Rua do Sol', '789', '', 'Vila Mariana', '54321-876', 'Belo Horizonte', 'MG'),
    ('Carlos Santos', true, 'Rua das Pedras', '456', 'Casa 2', 'Bela Vista', '23456-789', 'Curitiba', 'PR'),
    ('Ana Oliveira', false, 'Avenida das Americas', '789', 'Apto 3', 'Copacabana', '87654-321', 'Rio de Janeiro', 'RJ'),
    ('Pedro Alves', true, 'Rua do Fogo', '321', '', 'Vila Nova', '65432-187', 'Salvador', 'BA'),
    ('Julia Castro', false, 'Avenida do Sol', '654', 'Bloco 4', 'Jardim Sol', '43210-876', 'Fortaleza', 'CE');