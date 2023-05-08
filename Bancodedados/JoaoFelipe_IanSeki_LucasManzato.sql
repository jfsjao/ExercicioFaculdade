CREATE TABLE Agencia(
	nome VARCHAR PRIMARY KEY,
	localizacao VARCHAR
)
CREATE TABLE Funcionario(
	num_funcional INTEGER PRIMARY KEY,
	nome VARCHAR,
	telefone INTEGER,
	data_adimissao DATE,
	tempo_serv INTEGER,
	fk_Agencia_nome VARCHAR,
	fk_funcionario_id_supervisor INTEGER,
	FOREIGN KEY (fk_funcionario_id_supervisor) REFERENCES Funcionario(num_funcional),
	FOREIGN KEY (fk_Agencia_nome) REFERENCES Agencia(nome)
)
CREATE TABLE Cliente(
	num_id INTEGER PRIMARY KEY,
	nome VARCHAR,
	cpf INTEGER NOT NULL,
	data_nasc DATE,
	endereco VARCHAR,
	fk_funcionario_numgerente INTEGER,
	FOREIGN KEY (fk_funcionario_numgerente) REFERENCES Funcionario(num_funcional)
)

CREATE TABLE Conta(
	id_conta INTEGER PRIMARY KEY,
	dat DATE,
	saldo FLOAT,
	ult_acesso DATE
)

CREATE TABLE Emprestimo(
	num_empr INTEGER PRIMARY KEY,
	valor FLOAT,
	parcelas INTEGER,
	fk_Cliente_numid INTEGER,
	FOREIGN KEY (fk_Conta_id_conta) REFERENCES Conta(id_conta)
)

CREATE TABLE Possui(
	fk_Cliente_numid INTEGER PRIMARY KEY,
	fk_Conta_id_conta INTEGER,
	FOREIGN KEY (fk_Cliente_numid) REFERENCES Cliente(num_id),
	FOREIGN KEY (fk_Conta_id_conta) REFERENCES Conta(id_conta)

)
CREATE TABLE Realiza(
	fk_Emprestimo_num_empr INTEGER PRIMARY KEY,
	fk_Conta_id_conta INTEGER,
	FOREIGN KEY (fk_Emprestimo_num_empr) REFERENCES Emprestimo(num_empr),
	FOREIGN KEY (fk_Conta_id_conta) REFERENCES Conta(id_conta)
)

CREATE TABLE Poupança(
	fk_Conta_id_conta INTEGER PRIMARY KEY,
	taxa_juros FLOAT,
	saldo FLOAT,
	dat_ac DATE,
	dat_criacao DATE,
	FOREIGN KEY (fk_Conta_id_conta) REFERENCES Conta(id_conta)
)

CREATE TABLE Corrente(
	fk_Conta_id_conta INTEGER PRIMARY KEY,
	tarifa_mensal FLOAT,
	saldo FLOAT,
	dat_ac DATE,
	dat_criacao DATE,
	FOREIGN KEY (fk_Conta_id_conta) REFERENCES Conta(id_conta)
)

CREATE TABLE Operacao(
	id_operacao INTEGER PRIMARY KEY,
	fk_Conta_id_conta INTEGER,
	descricao VARCHAR,
	valor FLOAT,
	dat DATE,
	FOREIGN KEY (fk_Conta_id_conta) REFERENCES Conta(id_conta)
)

CREATE TABLE Dependente(
	fk_funcionario_num_funcional INTEGER PRIMARY KEY,
	nome VARCHAR,
	FOREIGN KEY (fk_funcionario_num_funcional) REFERENCES Funcionario(num_funcional)
)

SELECT * FROM Agencia
SELECT * FROM Funcionario
SELECT * FROM Cliente
SELECT * FROM Emprestimo
SELECT * FROM Possui
SELECT * FROM Realiza
SELECT * FROM Poupança
SELECT * FROM Corrente
SELECT * FROM Operacao
SELECT * FROM Dependente

INSERT INTO Agencia (nome, localizacao) values('banco_1','end_1');
INSERT INTO Agencia (nome, localizacao) values('banco_2','end_2');
INSERT INTO Agencia (nome, localizacao) values('banco_3','end_3');
INSERT INTO Agencia (nome, localizacao) values('banco_4','end_4');
INSERT INTO Agencia (nome, localizacao) values('banco_5','end_5');
INSERT INTO Agencia (nome, localizacao) values('banco_6','end_6');
INSERT INTO Agencia (nome, localizacao) values('banco_7','end_7');

INSERT INTO Funcionario (num_funcional, nome, telefone, data_adimissao, tempo_serv, fk_Agencia_nome, fk_funcionario_id_supervisor) VALUES(1,'a',111,'1-DEC-2010',12,'banco_1',NULL);
INSERT INTO Funcionario (num_funcional, nome, telefone, data_adimissao, tempo_serv, fk_Agencia_nome, fk_funcionario_id_supervisor) VALUES(2,'b',222,'10-FEB-2020',2,'banco_1',1);
INSERT INTO Funcionario (num_funcional, nome, telefone, data_adimissao, tempo_serv, fk_Agencia_nome, fk_funcionario_id_supervisor) VALUES(3,'c',333,'25-AUG-2010',12,'banco_1',NULL);
INSERT INTO Funcionario (num_funcional, nome, telefone, data_adimissao, tempo_serv, fk_Agencia_nome, fk_funcionario_id_supervisor) VALUES(4,'d',444,'2-DEC-2012',10,'banco_1',1);
INSERT INTO Funcionario (num_funcional, nome, telefone, data_adimissao, tempo_serv, fk_Agencia_nome, fk_funcionario_id_supervisor) VALUES(5,'e',555,'5-FEB-2020',2,'banco_1',3);
INSERT INTO Funcionario (num_funcional, nome, telefone, data_adimissao, tempo_serv, fk_Agencia_nome, fk_funcionario_id_supervisor) VALUES(6,'f',666,'3-MAR-2015',7,'banco_1',3);
INSERT INTO Funcionario (num_funcional, nome, telefone, data_adimissao, tempo_serv, fk_Agencia_nome, fk_funcionario_id_supervisor) VALUES(7,'g',777,'17-AUG-2015',7,'banco_1',3);

INSERT INTO Cliente (num_id, nome, cpf, data_nasc, endereco, fk_funcionario_numgerente) VALUES(1,'z',9999,'1-DEC-1990','end_1',2);
INSERT INTO Cliente (num_id, nome, cpf, data_nasc, endereco, fk_funcionario_numgerente) VALUES(2,'y',8888,'1-AUG-1980','end_2',2);
INSERT INTO Cliente (num_id, nome, cpf, data_nasc, endereco, fk_funcionario_numgerente) VALUES(3,'x',7777,'1-FEB-1999','end_3',2);
INSERT INTO Cliente (num_id, nome, cpf, data_nasc, endereco, fk_funcionario_numgerente) VALUES(4,'w',6677,'1-FEB-1994','end_4',2);
INSERT INTO Cliente (num_id, nome, cpf, data_nasc, endereco, fk_funcionario_numgerente) VALUES(5,'u',5566,'1-AUG-1970','end_5',6);
INSERT INTO Cliente (num_id, nome, cpf, data_nasc, endereco, fk_funcionario_numgerente) VALUES(6,'v',5544,'1-DEC-1960','end_6',6);
INSERT INTO Cliente (num_id, nome, cpf, data_nasc, endereco, fk_funcionario_numgerente) VALUES(7,'t',3322,'1-MAR-1998','end_7',6);

INSERT INTO Emprestimo(num_empr,valor,parcelas, fk_Cliente_numid) VALUES(1,10000.00,5,1);
INSERT INTO Emprestimo(num_empr,valor,parcelas, fk_Cliente_numid) VALUES(2,15000.00,4,2);
INSERT INTO Emprestimo(num_empr,valor,parcelas, fk_Cliente_numid) VALUES(3,5000.00,10,3);
INSERT INTO Emprestimo(num_empr,valor,parcelas, fk_Cliente_numid) VALUES(4,1000.00,3,2);
INSERT INTO Emprestimo(num_empr,valor,parcelas, fk_Cliente_numid) VALUES(5,100.00,2,4);
INSERT INTO Emprestimo(num_empr,valor,parcelas, fk_Cliente_numid) VALUES(6,100000.00,8,6);
INSERT INTO Emprestimo(num_empr,valor,parcelas, fk_Cliente_numid) VALUES(7,20000.00,4,7);

INSERT INTO Operacao(id_operacao,fk_Conta_id_conta,descricao,valor,dat) VALUES(1,1,'aaa',100.00,'1-DEC-2022');
INSERT INTO Operacao(id_operacao,fk_Conta_id_conta,descricao,valor,dat) VALUES(2,2,'bbb',100.00,'5-NOV-2022');
INSERT INTO Operacao(id_operacao,fk_Conta_id_conta,descricao,valor,dat) VALUES(3,3,'ccc',1000.00,'6-DEC-2022');
INSERT INTO Operacao(id_operacao,fk_Conta_id_conta,descricao,valor,dat) VALUES(4,4,'ddd',150.00,'26-NOV-2022');
INSERT INTO Operacao(id_operacao,fk_Conta_id_conta,descricao,valor,dat) VALUES(5,5,'eee',300.00,'30-NOV-2022');
INSERT INTO Operacao(id_operacao,fk_Conta_id_conta,descricao,valor,dat) VALUES(6,6,'fff',5000.00,'2-DEC-2022');
INSERT INTO Operacao(id_operacao,fk_Conta_id_conta,descricao,valor,dat) VALUES(7,7,'ggg',10.00,'30-NOV-2022');



