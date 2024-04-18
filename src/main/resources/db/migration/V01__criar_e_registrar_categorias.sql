CREATE TABLE categoria (
                           codigo BIGINT(20) AUTO_INCREMENT PRIMARY KEY,
                           nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO  categoria (nome) VALUES ('Alimentação');
INSERT INTO  categoria (nome) VALUES ('Transporte');
INSERT INTO  categoria (nome) VALUES ('Moradia');
INSERT INTO  categoria (nome) VALUES ('Saúde');
INSERT INTO  categoria (nome) VALUES ('Outros');