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