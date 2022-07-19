USE empresa_internet;

CREATE TABLE departamento(
depto_nro VARCHAR(7) NOT NULL,
nome_depto VARCHAR(50) NOT NULL,
localizacao VARCHAR(50) NOT NULL,
PRIMARY KEY (depto_nro)
);

INSERT INTO departamento VALUES
('D-000-1', 'Software', 'Los Tigres'),
('D-000-2', 'Sistemas', 'Guadalupe'),
('D-000-3', 'Contabilidade', 'La Roca'),
('D-000-4', 'Vendas', 'Plata');

CREATE TABLE funcionario(
cod_func VARCHAR(6) NOT NULL,
nome VARCHAR(100) NOT NULL,
sobrenome VARCHAR(100) NOT NULL,
cargo VARCHAR(50) NOT NULL,
data_alta DATE NOT NULL,
salario DECIMAL(10,2) NOT NULL,
depto_nro VARCHAR(7) NOT NULL,
PRIMARY KEY (cod_func),
FOREIGN KEY (depto_nro) REFERENCES departamento(depto_nro)
);

INSERT INTO funcionario VALUES
('E-0001', 'César', 'Piñero', 'Vendedor', '2018-05-12', 80000, 'D-000-4'),
('E-0002', 'Yosep', 'Kowaleski', 'Analista', '2015-07-14', 140000, 'D-000-2'),
('E-0003', 'Mariela', 'Barrios', 'Diretor', '2014-06-05', 185000, 'D-000-3'),
('E-0004', 'Jonathan', 'Aguilera', 'Vendedor', '2015-06-03', 85000, 'D-000-4'),
('E-0005', 'Daniel', 'Brezezicki', 'Vendedor', '2018-03-03', 83000, 'D-000-4'),
('E-0006', 'Mito', 'Barchuk', 'Presidente', '2014-06-05', 190000, 'D-000-3'),
('E-0007', 'Emilio', 'Galarza', 'Desenvolvedor', '2014-08-02', 60000, 'D-000-1');

-- 1 Selecione o nome, cargo e localização dos departamentos onde os vendedores trabalham.
SELECT funcionario.nome, funcionario.cargo, departamento.localizacao
FROM funcionario
INNER JOIN departamento
ON funcionario.depto_nro = departamento.depto_nro;

-- 2 Visualize departamentos com mais de cinco funcionários.
SELECT departamento.nome_depto, COUNT(funcionario.depto_nro) as funcionarios
FROM departamento
INNER JOIN funcionario
ON funcionario.depto_nro = departamento.depto_nro
GROUP BY departamento.nome_depto;

-- 3 Exiba o nome, salário e nome do departamento dos funcionários que têm o mesmo cargo que 'Mito Barchuk'.
SELECT funcionario.nome, funcionario.salario, departamento.nome_depto
FROM funcionario
INNER JOIN departamento
ON funcionario.depto_nro = departamento.depto_nro
WHERE funcionario.cargo = (SELECT funcionario.cargo FROM funcionario WHERE funcionario.nome = 'Mito' AND funcionario.sobrenome = 'Barchuk');

-- 4 Mostre os dados dos funcionários que trabalham no departamento de contabilidade, ordenados por nome.
SELECT funcionario.* FROM funcionario
INNER JOIN departamento
ON funcionario.depto_nro = departamento.depto_nro
WHERE departamento.nome_depto = 'Contabilidade'
ORDER BY funcionario.nome;

-- 5 Mostre o nome do funcionário que tem o menor salário.
SELECT funcionario.nome FROM funcionario
ORDER BY salario
LIMIT 1;

-- 6 Mostre os dados do funcionário que tem o maior salário no departamento 'Vendas'.
SELECT funcionario.* FROM funcionario
INNER JOIN departamento
ON funcionario.depto_nro = departamento.depto_nro
WHERE departamento.nome_depto = 'Vendas'
ORDER BY funcionario.salario DESC
LIMIT 1;