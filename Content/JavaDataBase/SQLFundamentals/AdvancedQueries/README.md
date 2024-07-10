# Consultas Avançadas 🔍

> Trabalhando com consultas avançadas: junções, subconsultas, funções agregadas, agrupamento de resultados, ordenação e índices.

## Junções (Joins)

As junções são usadas para combinar dados de duas ou mais tabelas com base em uma condição relacionada.

### Tipos de Junções

1. **INNER JOIN**: Retorna registros que têm valores correspondentes em ambas as tabelas.
   
2. **LEFT JOIN** (ou LEFT OUTER JOIN): Retorna todos os registros da tabela da esquerda (A) e os registros correspondentes da tabela da direita (B). Os resultados serão NULL do lado direito quando não houver correspondência.
   
3. **RIGHT JOIN** (ou RIGHT OUTER JOIN): Retorna todos os registros da tabela da direita (B) e os registros correspondentes da tabela da esquerda (A). Os resultados serão NULL do lado esquerdo quando não houver correspondência.
   
4. **FULL JOIN** (ou FULL OUTER JOIN): Retorna registros quando há uma correspondência em uma das tabelas. Isso significa que retorna todas as linhas de ambas as tabelas e preenche com NULLs onde não há correspondência.

### Exemplo

```sql
-- INNER JOIN entre tabelas de clientes e pedidos
SELECT clientes.nome, pedidos.numero_pedido
FROM clientes
INNER JOIN pedidos ON clientes.cliente_id = pedidos.cliente_id;

-- LEFT JOIN entre tabelas de clientes e pedidos
SELECT clientes.nome, pedidos.numero_pedido
FROM clientes
LEFT JOIN pedidos ON clientes.cliente_id = pedidos.cliente_id;

-- RIGHT JOIN entre tabelas de clientes e pedidos
SELECT clientes.nome, pedidos.numero_pedido
FROM clientes
RIGHT JOIN pedidos ON clientes.cliente_id = pedidos.cliente_id;

-- FULL JOIN entre tabelas de clientes e pedidos
SELECT clientes.nome, pedidos.numero_pedido
FROM clientes
FULL JOIN pedidos ON clientes.cliente_id = pedidos.cliente_id;
```

## Subconsultas (Subqueries)

Subconsultas são consultas aninhadas dentro de outra consulta. Elas podem ser usadas em SELECT, INSERT, UPDATE ou DELETE, e geralmente são usadas para retornar dados que serão utilizados na consulta principal.

### Exemplo

```sql
-- Subconsulta em uma cláusula WHERE
SELECT nome
FROM clientes
WHERE cliente_id IN (SELECT cliente_id FROM pedidos WHERE valor_total > 1000);

-- Subconsulta em uma cláusula FROM
SELECT avg_salary
FROM (SELECT AVG(salario) AS avg_salary FROM empregados) AS avg_salario;
```

## Funções Agregadas

Funções agregadas realizam cálculos em um conjunto de valores e retornam um único valor.

### Principais Funções Agregadas

1. **COUNT()**: Retorna o número de registros.
2. **SUM()**: Retorna a soma dos valores.
3. **AVG()**: Retorna a média dos valores.
4. **MIN()**: Retorna o menor valor.
5. **MAX()**: Retorna o maior valor.

### Exemplo

```sql
-- Contagem do número de clientes
SELECT COUNT(cliente_id) FROM clientes;

-- Soma dos valores dos pedidos
SELECT SUM(valor_total) FROM pedidos;

-- Média dos salários dos empregados
SELECT AVG(salario) FROM empregados;

-- Menor e maior valor dos pedidos
SELECT MIN(valor_total) AS valor_minimo, MAX(valor_total) AS valor_maximo FROM pedidos;
```

## Agrupamento de Resultados

O agrupamento de resultados é feito utilizando a cláusula `GROUP BY`, que é usada para agrupar linhas que têm valores iguais em colunas especificadas em um único conjunto de resultados.

### Exemplo

```sql
-- Agrupando pedidos por cliente
SELECT cliente_id, COUNT(numero_pedido) AS total_pedidos
FROM pedidos
GROUP BY cliente_id;

-- Agrupando empregados por departamento e calculando a média salarial
SELECT departamento_id, AVG(salario) AS media_salarial
FROM empregados
GROUP BY departamento_id;
```

## Ordenação de Resultados (ORDER BY)

A cláusula `ORDER BY` é usada para ordenar o conjunto de resultados de uma consulta SQL por uma ou mais colunas. Pode ser ordenado em ordem crescente (ASC) ou decrescente (DESC).

### Exemplo

```sql
-- Ordenando clientes por nome em ordem crescente
SELECT * FROM clientes
ORDER BY nome ASC;

-- Ordenando pedidos pelo valor total em ordem decrescente
SELECT * FROM pedidos
ORDER BY valor_total DESC;
```

## Índices

Índices são estruturas de dados que melhoram a velocidade das operações de consulta em tabelas. Eles são usados para localizar rapidamente os registros de uma tabela sem ter que fazer uma varredura completa.

### Criação de Índices

```sql
-- Criando um índice na coluna 'nome' da tabela 'usuarios'
CREATE INDEX idx_nome ON usuarios (nome);

-- Verificando o plano de execução da consulta antes e depois da criação do índice
EXPLAIN SELECT * FROM usuarios WHERE nome = "Maria";
```

### Vantagens dos Índices

1. **Aumento da Velocidade de Consulta**: Reduz o tempo de execução das consultas, especialmente em tabelas grandes.
2. **Melhoria do Desempenho**: Melhora o desempenho geral do banco de dados, permitindo consultas mais rápidas.
3. **Manutenção da Integridade**: Ajuda a manter a integridade dos dados através da aplicação de chaves primárias e estrangeiras.

### Considerações ao Usar Índices

1. **Espaço em Disco**: Índices ocupam espaço adicional no disco.
2. **Performance de Escrita**: Podem diminuir a performance de operações de inserção, atualização e exclusão, pois os índices também precisam ser atualizados.
3. **Escolha Estratégica**: Deve-se criar índices em colunas que são frequentemente usadas em cláusulas WHERE, JOIN e ORDER BY.

---

> Este README fornece uma visão abrangente das consultas avançadas em SQL, cobrindo junções, subconsultas, funções agregadas, agrupamento de resultados, ordenação e criação de índices. Essas técnicas são essenciais para a manipulação e análise eficazes de dados em bancos de dados relacionais, otimizando a performance e garantindo consultas mais rápidas e eficientes.
