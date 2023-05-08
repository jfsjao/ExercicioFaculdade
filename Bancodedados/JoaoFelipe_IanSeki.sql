CREATE TABLE Produtos (
    cod INTEGER PRIMARY KEY,
    descricao VARCHAR,
    quantidade INTEGER,
    fk_Fornecedores_cnpj INTEGER	
)ON UPDATE CASCADE ON DELETE set NULL;

CREATE TABLE Fornecedores (
    cnpj INTEGER PRIMARY KEY,
    razao_social VARCHAR,
    endereco VARCHAR
)ON UPDATE CASCADE ON DELETE CASCADE;

CREATE TABLE Venda (
    produtos VARCHAR,
    cod_venda INTEGER PRIMARY KEY,
    registro_data DATE
)ON UPDATE CASCADE ON DELETE CASCADE;

CREATE TABLE Compoe (
    fk_Venda_cod_venda INTEGER,
    fk_Produtos_cod INTEGER
)ON UPDATE CASCADE ON DELETE CASCADE;
 
INSERT INTO fornecedores(cnpj,razao_social,endereco) values (1,'laticiniosmaximo','rua padre eustaquio');
INSERT INTO fornecedores(cnpj,razao_social,endereco) values (2,'loja a','rua a');
INSERT INTO fornecedores(cnpj,razao_social,endereco) values (3,'loja b','rua b');
INSERT INTO fornecedores(cnpj,razao_social,endereco) values (4,'loja c','rua c');
INSERT INTO fornecedores(cnpj,razao_social,endereco) values (5,'loja d','rua e');
INSERT INTO fornecedores(cnpj,razao_social,endereco) values (6,'loja e','rua f');
INSERT INTO fornecedores(cnpj,razao_social,endereco) values (7,'loja f','rua g');
INSERT INTO fornecedores(cnpj,razao_social,endereco) values (8,'loja g','rua h');
INSERT INTO fornecedores(cnpj,razao_social,endereco) values (9,'loja h','rua i');
INSERT INTO fornecedores(cnpj,razao_social,endereco) values (10,'loja i','rua j');

INSERT INTO produtos(cod,descricao,quantidade,fk_Fornecedores_cnpj) values (15,'queijo',55,10);
INSERT INTO produtos(cod,descricao,quantidade,fk_Fornecedores_cnpj) values (2,'sabão',40,9);
INSERT INTO produtos(cod,descricao,quantidade,fk_Fornecedores_cnpj) values (3,'pão',30,8);
INSERT INTO produtos(cod,descricao,quantidade,fk_Fornecedores_cnpj) values (4,'garrafa',100,7);
INSERT INTO produtos(cod,descricao,quantidade,fk_Fornecedores_cnpj) values (5,'refrigerante',50,6);
INSERT INTO produtos(cod,descricao,quantidade,fk_Fornecedores_cnpj) values (6,'macarrão',60,5);
INSERT INTO produtos(cod,descricao,quantidade,fk_Fornecedores_cnpj) values (7,'farinha',10,4);
INSERT INTO produtos(cod,descricao,quantidade,fk_Fornecedores_cnpj) values (8,'requeijão',30,3);
INSERT INTO produtos(cod,descricao,quantidade,fk_Fornecedores_cnpj) values (9,'mix de frutas',45,2);
INSERT INTO produtos(cod,descricao,quantidade,fk_Fornecedores_cnpj) values (10,'molho',35,1);

INSERT INTO venda(produtos,cod_venda,registro_data) values ('queijo',1,'25-OCT-2022');
INSERT INTO venda(produtos,cod_venda,registro_data) values ('sabão',2,'15-NOV-2022');
INSERT INTO venda(produtos,cod_venda,registro_data) values ('pão',3,'25-JAN-2023');
INSERT INTO venda(produtos,cod_venda,registro_data) values ('garrafa',4,'3-JAN-2023');
INSERT INTO venda(produtos,cod_venda,registro_data) values ('refrigerante',5,'2-DEC-2022');
INSERT INTO venda(produtos,cod_venda,registro_data) values ('macarrão',6,'22-NOV-2022');
INSERT INTO venda(produtos,cod_venda,registro_data) values ('farinha',7,'20-OCT-2022');
INSERT INTO venda(produtos,cod_venda,registro_data) values ('requeijão',8,'25-NOV-2022');
INSERT INTO venda(produtos,cod_venda,registro_data) values ('mix de frutas',9,'10-MAR-2023');
INSERT INTO venda(produtos,cod_venda,registro_data) values ('molho',10,'25-JAN-2023');

INSERT INTO compoe(fk_Venda_cod_venda,fk_Produtos_cod) values (1,1);
INSERT INTO compoe(fk_Venda_cod_venda,fk_Produtos_cod) values (2,2);
INSERT INTO compoe(fk_Venda_cod_venda,fk_Produtos_cod) values (3,3);
INSERT INTO compoe(fk_Venda_cod_venda,fk_Produtos_cod) values (4,4);
INSERT INTO compoe(fk_Venda_cod_venda,fk_Produtos_cod) values (5,5);
INSERT INTO compoe(fk_Venda_cod_venda,fk_Produtos_cod) values (6,6);
INSERT INTO compoe(fk_Venda_cod_venda,fk_Produtos_cod) values (7,7);
INSERT INTO compoe(fk_Venda_cod_venda,fk_Produtos_cod) values (8,8);
INSERT INTO compoe(fk_Venda_cod_venda,fk_Produtos_cod) values (9,9);
INSERT INTO compoe(fk_Venda_cod_venda,fk_Produtos_cod) values (10,10);


SELECT * FROM fornecedores
SELECT * FROM produtos
SELECT * FROM compoe
SELECT * FROM venda

UPDATE produtos SET quantidade=25 WHERE quantidade=10;
UPDATE produtos SET quantidade=70 WHERE quantidade=40;

UPDATE fornecedores SET endereco= 'rua z' WHERE cnpj = 2;
UPDATE fornecedores SET endereco= 'rua y' WHERE cnpj = 7;

UPDATE compoe SET fk_Venda_cod_venda= 5 WHERE fk_Venda_cod_venda = 1
UPDATE compoe SET fk_Venda_cod_venda= 3 WHERE fk_Venda_cod_venda = 2

UPDATE venda SET registro_data= '25-DEC-2023' WHERE cod_venda = 5
UPDATE venda SET registro_data= '25-DEC-2023' WHERE cod_venda = 2

DELETE FROM produtos WHERE cod = 3

DELETE FROM fornecedores WHERE cnpj = 3

DELETE FROM venda WHERE cod_venda = 2

DELETE FROM compoe WHERE fk_Produtos_cod = 3



