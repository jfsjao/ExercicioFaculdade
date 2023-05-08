CREATE TABLE Livraria (
    nomeL VARCHAR,
    cod_Loja INT PRIMARY KEY,
    fk_telefoneL_telefoneL_PK VARCHAR,
    emailL VARCHAR,
    ruaL VARCHAR,
    bairroL VARCHAR,
    cidadeL VARCHAR
);

CREATE TABLE Cliente (
    CPF VARCHAR PRIMARY KEY,
    nomeCli VARCHAR,
    emailCli VARCHAR,
    fk_telefoneCli_telefoneCli_PK VARCHAR,
    ruaCli VARCHAR,
    cidadeCli VARCHAR,
    bairroCli VARCHAR
);

CREATE TABLE Categoria (
    genero VARCHAR,
    faixaEtaria INT,
    cod_Categoria INT PRIMARY KEY
);

CREATE TABLE Livro (
    autor VARCHAR,
    editora VARCHAR,
    tituloL VARCHAR,
    cod_Livro INT PRIMARY KEY
);

CREATE TABLE Funcionario (
    nomeFun VARCHAR,
    id_Fun SERIAL PRIMARY KEY,
    dependentes VARCHAR,
    ruaFun VARCHAR,
    bairroFun VARCHAR,
    cidadeFun VARCHAR,
    salario FLOAT,
    dataContratacao DATE
);

CREATE TABLE telefoneL (
    telefoneL_PK VARCHAR NOT NULL PRIMARY KEY,
    telefoneL VARCHAR
);

CREATE TABLE telefoneCli (
    telefoneCli_PK VARCHAR NOT NULL PRIMARY KEY,
    telefoneCli VARCHAR
);

CREATE TABLE Cadastra (
    fk_Cliente_CPF VARCHAR,
    fk_Livraria_cod_Loja INT,
    dataCriacao DATE,
    cod_Conta INT,
    dataC DATE,
    saldo FLOAT
);

CREATE TABLE Possui (
    fk_Categoria_cod_Categoria INT,
    fk_Livro_cod_Livro INT
);

CREATE TABLE Trabalha (
    fk_Livraria_cod_Loja INT,
    fk_Funcionario_id_Fun SERIAL
);

CREATE TABLE Acervo (
    fk_Livro_cod_Livro INT,
    fk_Livraria_cod_Loja INT,
    quantidade INT
);

CREATE TABLE Gerencia (
    fk_Livraria_cod_Loja INT,
    fk_Funcionario_id_Fun SERIAL
);
 
ALTER TABLE Livraria ADD CONSTRAINT FK_Livraria_2
    FOREIGN KEY (fk_telefoneL_telefoneL_PK)
    REFERENCES telefoneL (telefoneL_PK)
    ON DELETE NO ACTION;
 
ALTER TABLE Cliente ADD CONSTRAINT FK_Cliente_2
    FOREIGN KEY (fk_telefoneCli_telefoneCli_PK)
    REFERENCES telefoneCli (telefoneCli_PK)
    ON DELETE NO ACTION;
 
ALTER TABLE Cadastra ADD CONSTRAINT FK_Cadastra_1
    FOREIGN KEY (fk_Cliente_CPF)
    REFERENCES Cliente (CPF)
    ON DELETE SET NULL;
 
ALTER TABLE Cadastra ADD CONSTRAINT FK_Cadastra_2
    FOREIGN KEY (fk_Livraria_cod_Loja)
    REFERENCES Livraria (cod_Loja)
    ON DELETE SET NULL;
 
ALTER TABLE Possui ADD CONSTRAINT FK_Possui_1
    FOREIGN KEY (fk_Categoria_cod_Categoria)
    REFERENCES Categoria (cod_Categoria)
    ON DELETE RESTRICT;
 
ALTER TABLE Possui ADD CONSTRAINT FK_Possui_2
    FOREIGN KEY (fk_Livro_cod_Livro)
    REFERENCES Livro (cod_Livro)
    ON DELETE RESTRICT;
 
ALTER TABLE Trabalha ADD CONSTRAINT FK_Trabalha_1
    FOREIGN KEY (fk_Livraria_cod_Loja)
    REFERENCES Livraria (cod_Loja)
    ON DELETE RESTRICT;
 
ALTER TABLE Trabalha ADD CONSTRAINT FK_Trabalha_2
    FOREIGN KEY (fk_Funcionario_id_Fun)
    REFERENCES Funcionario (id_Fun)
    ON DELETE RESTRICT;
 
ALTER TABLE Acervo ADD CONSTRAINT FK_Acervo_1
    FOREIGN KEY (fk_Livro_cod_Livro)
    REFERENCES Livro (cod_Livro)
    ON DELETE SET NULL;
 
ALTER TABLE Acervo ADD CONSTRAINT FK_Acervo_2
    FOREIGN KEY (fk_Livraria_cod_Loja)
    REFERENCES Livraria (cod_Loja)
    ON DELETE SET NULL;
 
ALTER TABLE Gerencia ADD CONSTRAINT FK_Gerencia_1
    FOREIGN KEY (fk_Livraria_cod_Loja)
    REFERENCES Livraria (cod_Loja)
    ON DELETE RESTRICT;
 
ALTER TABLE Gerencia ADD CONSTRAINT FK_Gerencia_2
    FOREIGN KEY (fk_Funcionario_id_Fun)
    REFERENCES Funcionario (id_Fun)
    ON DELETE SET NULL;
	
INSERT INTO Livraria (nomeL, cod_Loja, fk_telefoneL_telefoneL_PK, emailL, ruaL, bairroL, cidadeL) VALUES ('Livraria 1', 1, '555-555-5555', 'livraria1@email.com', 'Rua 1', 'Bairro 1', 'Cidade 1');
INSERT INTO Livraria (nomeL, cod_Loja, fk_telefoneL_telefoneL_PK, emailL, ruaL, bairroL, cidadeL) VALUES ('Livraria 2', 2, '555-555-5556', 'livraria2@email.com', 'Rua 2', 'Bairro 2', 'Cidade 2');
INSERT INTO Livraria (nomeL, cod_Loja, fk_telefoneL_telefoneL_PK, emailL, ruaL, bairroL, cidadeL) VALUES ('Livraria 3', 3, '555-555-5557', 'livraria3@email.com', 'Rua 3', 'Bairro 3', 'Cidade 3');

INSERT INTO Cliente (CPF, nomeCli, emailCli, fk_telefoneCli_telefoneCli_PK, ruaCli, cidadeCli, bairroCli) VALUES ('111-111-111-11', 'Cliente 1', 'cliente1@email.com', '555-555-5555', 'Rua 1', 'Cidade 1', 'Bairro 1');
INSERT INTO Cliente (CPF, nomeCli, emailCli, fk_telefoneCli_telefoneCli_PK, ruaCli, cidadeCli, bairroCli) VALUES ('111-111-111-12', 'Cliente 2', 'cliente2@email.com', '555-555-5556', 'Rua 2', 'Cidade 2', 'Bairro 2');
INSERT INTO Cliente (CPF, nomeCli, emailCli, fk_telefoneCli_telefoneCli_PK, ruaCli, cidadeCli, bairroCli) VALUES ('111-111-111-13', 'Cliente 3', 'cliente3@email.com', '555-555-5557', 'Rua 3', 'Cidade 3', 'Bairro 3');

INSERT INTO Categoria (genero, faixaEtaria, cod_Categoria) VALUES ('Ficção', 18, 1);
INSERT INTO Categoria (genero, faixaEtaria, cod_Categoria) VALUES ('Romance', 16, 2);
INSERT INTO Categoria (genero, faixaEtaria, cod_Categoria) VALUES ('Aventura', 12, 3);

INSERT INTO Livro (autor, editora, tituloL, cod_Livro) VALUES ('Autor 1','Editora 1', 'Titulo Livro 1', 1);
INSERT INTO Livro (autor, editora, tituloL, cod_Livro) VALUES ('Autor 2', 'Editora 2', 'Titulo Livro 2', 2);
INSERT INTO Livro (autor, editora, tituloL, cod_Livro) VALUES ('Autor 3', 'Editora 3', 'Titulo Livro 3', 3);

INSERT INTO Funcionario (nomeFun, id_Fun, dependentes, ruaFun, bairroFun, cidadeFun, salario, dataContratacao) VALUES ('Funcionario 1', 1, 'Dependente 1', 'Rua 1', 'Bairro 1', 'Cidade 1', 1000, '2022-01-01');
INSERT INTO Funcionario (nomeFun, id_Fun, dependentes, ruaFun, bairroFun, cidadeFun, salario, dataContratacao) VALUES ('Funcionario 2', 2, 'Dependente 2', 'Rua 2', 'Bairro 2', 'Cidade 2', 2000, '2022-02-01');
INSERT INTO Funcionario (nomeFun, id_Fun, dependentes, ruaFun, bairroFun, cidadeFun, salario, dataContratacao) VALUES ('Funcionario 3', 3, 'Dependente 3', 'Rua 3', 'Bairro 3', 'Cidade 3', 3000, '2022-03-01');

INSERT INTO telefoneL (telefoneL_PK, telefoneL) VALUES ('555-555-5555', '555-555-5555');
INSERT INTO telefoneL (telefoneL_PK, telefoneL) VALUES ('555-555-5556', '555-555-5556');
INSERT INTO telefoneL (telefoneL_PK, telefoneL) VALUES ('555-555-5557', '555-555-5557');

INSERT INTO telefoneCli (telefoneCli_PK, telefoneCli) VALUES ('555-555-5555', '555-555-5555');
INSERT INTO telefoneCli (telefoneCli_PK, telefoneCli) VALUES ('555-555-5556', '555-555-5556');
INSERT INTO telefoneCli (telefoneCli_PK, telefoneCli) VALUES ('555-555-5557', '555-555-5557');

INSERT INTO Cadastra (fk_Cliente_CPF, fk_Livraria_cod_Loja, dataCriacao, cod_Conta, dataC, saldo) VALUES ('111-111-111-11', 1, '2022-01-01', 1, '2022-01-01', 0);
INSERT INTO Cadastra (fk_Cliente_CPF, fk_Livraria_cod_Loja, dataCriacao, cod_Conta, dataC, saldo) VALUES ('111-111-111-12', 2, '2022-02-01', 2, '2022-02-01', 0);
INSERT INTO Cadastra (fk_Cliente_CPF, fk_Livraria_cod_Loja, dataCriacao, cod_Conta, dataC, saldo) VALUES ('111-111-111-13', 3, '2022-03-01', 3, '2022-03-01', 0);

INSERT INTO Possui (fk_Categoria_cod_Categoria, fk_Livro_cod_Livro) VALUES (1, 1);
INSERT INTO Possui (fk_Categoria_cod_Categoria, fk_Livro_cod_Livro) VALUES (2, 2);
INSERT INTO Possui (fk_Categoria_cod_Categoria, fk_Livro_cod_Livro) VALUES (3, 3);

INSERT INTO Trabalha (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (1, 1);
INSERT INTO Trabalha (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (2, 2);
INSERT INTO Trabalha (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (3, 3);

INSERT INTO Acervo (fk_Livro_cod_Livro, fk_Livraria_cod_Loja, quantidade) VALUES (1, 1, 10);
INSERT INTO Acervo (fk_Livro_cod_Livro, fk_Livraria_cod_Loja, quantidade) VALUES (2, 2, 20);
INSERT INTO Acervo (fk_Livro_cod_Livro, fk_Livraria_cod_Loja, quantidade) VALUES (3, 3, 30);

INSERT INTO Gerencia (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (1, 1);
INSERT INTO Gerencia (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (2, 2);
INSERT INTO Gerencia (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (3, 3);

UPDATE Livraria SET nomeL = 'Novo Nome Livraria 1' WHERE cod_Loja = 1;
UPDATE Livraria SET emailL = 'novolivraria1@email.com' WHERE cod_Loja = 1;
UPDATE Cliente SET nomeCli = 'Novo Nome Cliente 1' WHERE CPF = '111-111-111-11';

DELETE FROM Livraria WHERE cod_Loja = 2;
DELETE FROM Cliente WHERE CPF = '111-111-111-12';
DELETE FROM Categoria WHERE cod_Categoria = 3;

INSERT INTO Livraria (nomeL, cod_Loja, fk_telefoneL_telefoneL_PK, emailL, ruaL, bairroL, cidadeL) VALUES ('Livraria 4', 4, '555-555-5558', 'livraria4@email.com', 'Rua 4', 'Bairro 4', 'Cidade 4');
INSERT INTO Livraria (nomeL, cod_Loja, fk_telefoneL_telefoneL_PK, emailL, ruaL, bairroL, cidadeL) VALUES ('Livraria 5', 5, '555-555-5559', 'livraria5@email.com', 'Rua 5', 'Bairro 5', 'Cidade 5');
INSERT INTO Livraria (nomeL, cod_Loja, fk_telefoneL_telefoneL_PK, emailL, ruaL, bairroL, cidadeL) VALUES ('Livraria 6', 6, '555-555-5560', 'livraria6@email.com', 'Rua 6', 'Bairro 6', 'Cidade 6');

INSERT INTO Cliente (CPF, nomeCli, emailCli, fk_telefoneCli_telefoneCli_PK, ruaCli, cidadeCli, bairroCli) VALUES ('111-111-111-14', 'Cliente 4', 'cliente4@email.com', '555-555-5558', 'Rua 4', 'Cidade 4', 'Bairro 4');
INSERT INTO Cliente (CPF, nomeCli, emailCli, fk_telefoneCli_telefoneCli_PK, ruaCli, cidadeCli, bairroCli) VALUES ('111-111-111-15', 'Cliente 5', 'cliente5@email.com', '555-555-5559', 'Rua 5', 'Bairro 5', 'Cidade 5', 5000, '2022-05-01');
INSERT INTO Funcionario (nomeFun, id_Fun, dependentes, ruaFun, bairroFun, cidadeFun, salario, dataContratacao) VALUES ('Funcionario 6', 6, 'Dependente 6', 'Rua 6', 'Bairro 6', 'Cidade 6', 6000, '2022-06-01');

INSERT INTO telefoneL (telefoneL_PK, telefoneL) VALUES ('555-61', '555-555-5561');
INSERT INTO telefoneL (telefoneL_PK, telefoneL) VALUES ('555-555-5562', '555-555-5562');
INSERT INTO telefoneL (telefoneL_PK, telefoneL) VALUES ('555-555-5563', '555-555-5563');

INSERT INTO telefoneCli (telefoneCli_PK, telefoneCli) VALUES ('555-555-5561', '555-555-5561');
INSERT INTO telefoneCli (telefoneCli_PK, telefoneCli) VALUES ('555-555-5562', '555-555-5562');
INSERT INTO telefoneCli (telefoneCli_PK, telefoneCli) VALUES ('555-555-5563', '555-555-5563');

INSERT INTO Cadastra (fk_Cliente_CPF, fk_Livraria_cod_Loja, dataCriacao, cod_Conta, dataC, saldo) VALUES ('111-111-111-14', 4, '2022-04-01', 4, '2022-04-01', 0);
INSERT INTO Cadastra (fk_Cliente_CPF, fk_Livraria_cod_Loja, dataCriacao, cod_Conta, dataC, saldo) VALUES ('111-111-111-15', 5, '2022-05-01', 5, '2022-05-01', 0);
INSERT INTO Cadastra (fk_Cliente_CPF, fk_Livraria_cod_Loja, dataCriacao, cod_Conta, dataC, saldo) VALUES ('111-111-111-16', 6, '2022-06-01', 6, '2022-06-01', 0);

INSERT INTO Possui (fk_Categoria_cod_Categoria, fk_Livro_cod_Livro) VALUES (4, 4);
INSERT INTO Possui (fk_Categoria_cod_Categoria, fk_Livro_cod_Livro) VALUES (5, 5);
INSERT INTO Possui (fk_Categoria_cod_Categoria, fk_Livro_cod_Livro) VALUES (6, 6);

INSERT INTO Trabalha (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (4, 4);
INSERT INTO Trabalha (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (5, 5);
INSERT INTO Trabalha (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (6, 6);

INSERT INTO Acervo (fk_Livro_cod_Livro, fk_Livraria_cod_Loja, quantidade) VALUES (4, 4, 40);
INSERT INTO Acervo (fk_Livro_cod_Livro, fk_Livraria_cod_Loja, quantidade) VALUES (5, 5, 50);
INSERT INTO Acervo (fk_Livro_cod_Livro, fk_Livraria_cod_Loja, quantidade) VALUES (6, 6, 60);

INSERT INTO Gerencia (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (4, 4);
INSERT INTO Gerencia (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (5, 5);
INSERT INTO Gerencia (fk_Livraria_cod_Loja, fk_Funcionario_id_Fun) VALUES (6, 6);

-- Atualizações
UPDATE Livraria SET emailL = 'livraria1_atualizado@email.com' WHERE cod_Loja = 1;
UPDATE Cliente SET nomeCli = 'Cliente 1 Atualizado' WHERE CPF = '111-111-111-11';
UPDATE Categoria SET genero = 'Genero 1 Atualizado' WHERE cod_Categoria = 1;

-- Remoções
DELETE FROM Livraria WHERE cod_Loja = 2;
DELETE FROM Cliente WHERE CPF = '111-111-111-12';
DELETE FROM Categoria WHERE cod_Categoria = 2;

--Consulta que utiliza duas tabelas como fonte:
SELECT nomeCli, nomeL FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF JOIN Livraria ON Cadastra.fk_Livraria_cod_Loja = Livraria.cod_Loja;

--Consulta que utiliza junção externa:
SELECT nomeCli, nomeL FROM Cliente LEFT OUTER JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF;

--Consulta que utiliza funções de agregação com agrupamento:
SELECT cidadeCli, AVG(salario) FROM Funcionario JOIN Trabalha ON Funcionario.id_Fun = Trabalha.fk_Funcionario_id_Fun JOIN Livraria ON Trabalha.fk_Livraria_cod_Loja = Livraria.cod_Loja GROUP BY cidadeCli;

--Consulta que utiliza UNION:
SELECT nomeCli FROM Cliente WHERE cidadeCli = 'Cidade 1'
UNION
SELECT nomeCli FROM Cliente WHERE cidadeCli = 'Cidade 2';

--Consulta que utiliza INTERSECT:
SELECT nomeCli FROM Cliente WHERE cidadeCli = 'Cidade 1'
INTERSECT
SELECT nomeCli FROM Cliente WHERE cidadeCli = 'Cidade 2';

--Consulta que utiliza subconsulta com IN:
SELECT nomeCli FROM Cliente WHERE CPF IN (SELECT fk_Cliente_CPF FROM Cadastra);

--Consulta que utiliza subconsulta com NOT IN:
SELECT nomeCli FROM Cliente WHERE CPF NOT IN (SELECT fk_Cliente_CPF FROM Cadastra);

--Consulta que utiliza subconsulta com EXISTS:
SELECT nomeL FROM Livraria WHERE EXISTS (SELECT fk_Livraria_cod_Loja FROM Cadastra WHERE Livraria.cod_Loja = Cadastra.fk_Livraria_cod_Loja);

--Consulta que utiliza subconsulta com NOT EXISTS:
SELECT nomeL FROM Livraria WHERE NOT EXISTS (SELECT fk_Livraria_cod_Loja FROM Cadastra WHERE Livraria.cod_Loja = Cadastra.fk_Livraria_cod_Loja);

--Consulta que utiliza três tabelas como fonte:
SELECT nomeCli, nomeL, genero FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF JOIN Livraria ON Cadastra.fk_Livraria_cod_Loja = Livraria.cod_Loja JOIN Possui ON Livraria.cod_Loja = Possui.fk_Livraria_cod_Loja JOIN Categoria ON Possui.fk_Categoria_cod_Categoria = Categoria.cod_Categoria;

--Consulta que utiliza duas tabelas como fonte e uma cláusula HAVING:
SELECT nomeL, SUM(quantidade) FROM Livraria JOIN Acervo ON Livraria.cod_Loja = Acervo.fk_Livraria_cod_Loja GROUP BY nomeL HAVING SUM(quantidade) > 50;

--Consulta que utiliza duas tabelas como fonte e uma cláusula ORDER BY:
SELECT nomeCli, nomeFun FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF JOIN Funcionario ON Cadastra.fk_Livraria_cod_Loja = Funcionario.id_Fun ORDER BY nomeCli;

--Consulta que utiliza subconsulta com IN :
SELECT nomeCli,nomeL FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF JOIN Livraria ON Cadastra.fk_Livraria_cod_Loja = Livraria.cod_Loja WHERE Livraria.cod_Loja IN (SELECT fk_Livraria_cod_Loja FROM Possui WHERE fk_Categoria_cod_Categoria =1);

--Consulta que utiliza subconsulta com NOT EXISTS:
SELECT nomeL FROM Livraria WHERE NOT EXISTS (SELECT fk_Livraria_cod_Loja FROM Possui WHERE Livraria.cod_Loja = Possui.fk_Livraria_cod_Loja);

--Consulta que utiliza subconsulta com EXISTS :
SELECT nomeCli FROM Cliente WHERE EXISTS (SELECT fk_Cliente_CPF FROM Cadastra WHERE Cliente.CPF = Cadastra.fk_Cliente_CPF);

--Consulta que utiliza subconsulta com NOT IN:
SELECT nomeFun FROM Funcionario WHERE id_Fun NOT IN (SELECT fk_Funcionario_id_Fun FROM Gerencia);

--Consulta que utiliza duas tabelas como fonte e uma cláusula WHERE :
SELECT nomeCli,nomeL FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF JOIN Livraria ON Cadastra.fk_Livraria_cod_Loja = Livraria.cod_Loja WHERE Livraria.cidadeL = 'Cidade 1';

--Consulta que utiliza duas tabelas como fonte e uma cláusula AND :
SELECT Livro.tituloL, Livraria.nomeL, Categoria.genero
FROM Livro
JOIN Possui ON Possui.fk_Livro_cod_Livro = Livro.cod_Livro
JOIN Categoria ON Possui.fk_Categoria_cod_Categoria = Categoria.cod_Categoria
JOIN Acervo ON Acervo.fk_Livro_cod_Livro = Livro.cod_Livro
JOIN Livraria ON Acervo.fk_Livraria_cod_Loja = Livraria.cod_Loja
WHERE Categoria.genero = 'romance' AND Acervo.quantidade > 5;

--Consulta que utiliza duas tabelas como fonte e uma cláusula OR :
SELECT nomeCli,nomeL FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF JOIN Livraria ON Cadastra.fk_Livraria_cod_Loja = Livraria.cod_Loja WHERE Livraria.cidadeL = 'Cidade 1' OR Cliente.bairroCli='Bairro 1';

--Consulta que utiliza duas tabelas como fonte e uma cláusula NOT :
SELECT nomeCli,nomeL FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF JOIN Livraria ON Cadastra.fk_Livraria_cod_Loja = Livraria.cod_Loja WHERE NOT Livraria.cidadeL = 'Cidade 1';

--Consulta que utiliza duas tabelas como fonte e uma cláusula LIKE :
SELECT autor,tituloL FROM Livro JOIN Possui ON Livro.cod_Livro = Possui.fk_Livro_cod_Livro WHERE autor LIKE '%J%';

--Consulta que utiliza duas tabelas como fonte e uma cláusula BETWEEN:
SELECT nomeFun, salario FROM Funcionario JOIN Trabalha ON Funcionario.id_Fun = Trabalha.fk_Funcionario_id_Fun WHERE salario BETWEEN 2000 AND 4000;

--Consulta que utiliza duas tabelas como fonte e uma cláusula IN :
SELECT nomeCli,nomeL FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF JOIN Livraria ON Cadastra.fk_Livraria_cod_Loja = Livraria.cod_Loja WHERE Livraria.cidadeL IN ('Cidade 1','Cidade 2');

--Consulta que utiliza duas tabelas como fonte e uma cláusula LIMIT:
SELECT nomeCli FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF LIMIT 5;

--Consulta que utiliza duas tabelas como fonte e uma cláusula ORDER BY:
SELECT nomeCli,nomeL FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF JOIN Livraria ON Cadastra.fk_Livraria_cod_Loja = Livraria.cod_Loja ORDER BY nomeCli;

--Consulta que utiliza duas tabelas como fonte e uma cláusula GROUP BY:
SELECT cidadeCli, COUNT(nomeCli) FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF GROUP BY cidadeCli;

--Consulta que utiliza duas tabelas como fonte e uma cláusula HAVING:
SELECT cidadeCli, COUNT(nomeCli) FROM Cliente JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF GROUP BY cidadeCli HAVING COUNT(nomeCli)>5;

--Consulta que utiliza UNION:
SELECT nomeCli FROM Cliente WHERE bairroCli='Bairro 1'
UNION
SELECT nomeCli FROM Cliente WHERE bairroCli='Bairro 2';

--Consulta que utiliza INTERSECT:
SELECT nomeCli FROM Cliente WHERE cidadeCli='Cidade 1'
INTERSECT
SELECT nomeCli FROM Cliente WHERE bairroCli='Bairro 1';

--Consulta que utiliza EXCEPT:
SELECT nomeCli FROM Cliente WHERE cidadeCli='Cidade 1'
EXCEPT
SELECT nomeCli FROM Cliente WHERE bairroCli='Bairro 1';

--Consulta que utiliza junção externa:
SELECT nomeCli, nomeL FROM Cliente LEFT OUTER JOIN Cadastra ON Cliente.CPF = Cadastra.fk_Cliente_CPF LEFT OUTER JOIN Livraria ON Cadastra.fk_Livraria_cod_Loja = Livraria.cod_Loja;

--Consulta que utiliza função de agregação com agrupamento:
SELECT editora, SUM(quantidade) FROM Livro JOIN Acervo ON Livro.cod_Livro = Acervo.fk_Livro_cod_Livro GROUP BY editora;

--Consulta que utiliza função de agregação MIN:
SELECT MIN(salario) FROM Funcionario;

--Consulta que utiliza função de agregação MAX:
SELECT MAX(salario) FROM Funcionario;

--Consulta que utiliza função de agregação AVG:
SELECT AVG(salario) FROM Funcionario;

--Consulta que utiliza função de agregação COUNT:
SELECT COUNT(DISTINCT cidadeCli) FROM Cliente;

--Consulta que utiliza função de agregação SUM:
SELECT SUM(quantidade) FROM Acervo;

--Consulta que utiliza função de agregação GROUP BY:
SELECT cidadeCli, SUM(salario) FROM Funcionario JOIN Trabalha ON Funcionario.id_Fun = Trabalha.fk_Funcionario_id_Fun JOIN Livraria ON Trabalha.fk_Livraria_cod_Loja = Livraria.cod_Loja GROUP BY cidadeCli;

--Consulta que utiliza função de agregação HAVING:
SELECT cidadeCli, SUM(salario) FROM Funcionario JOIN Trabalha ON Funcionario.id_Fun = Trabalha.fk_Funcionario_id_Fun JOIN Livraria ON Trabalha.fk_Livraria_cod_Loja = Livraria.cod_Loja GROUP BY cidadeCli HAVING SUM(salario) > 10000;

--Consulta que utiliza função de agregação ORDER BY:
SELECT editora, SUM(quantidade) FROM Livro JOIN Acervo ON Livro.cod_Livro = Acervo.fk_Livro_cod_Livro GROUP BY editora ORDER BY SUM(quantidade) DESC;