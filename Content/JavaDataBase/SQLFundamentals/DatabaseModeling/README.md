# Modelagem de Banco de Dados 🏗️

> Prática de modelagem de banco de dados: operações CRUD, chaves primárias e estrangeiras, alteração e exclusão de tabelas e registros.

## Comandos SQL

### Comando SQL: CREATE TABLE

#### Opções
- Restrições de Valor
  - Not Null
  - UNIQUE
  - DEFAULT
- Chaves primárias e estrangeiras
- Auto Incremento

Exemplo de sintaxe para criar uma tabela com chave primária:
```sql
CREATE TABLE Cliente (
    id INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE
);
```
---

### Tipos de Dados
Veja Abaixo:

| Tipo de Dado | Descrição | SQL (nome do código) |
|--------------|-----------|----------------------|
| Inteiro      | Números inteiros, positivos ou negativos. | INT |
| Decimal/Numerico | Números decimais, com precisão configurável. | DECIMAL(precision, scale) ou NUMERIC(precision, scale) |
| Caractere/Varchar | Cadeias de caracteres variáveis de comprimento limitado. | VARCHAR(max_length) |
| Data/Hora    | Data e/ou hora, incluindo data, hora ou ambos. | DATE, TIME, DATETIME |
| Booleano     | Valores lógicos verdadeiro (true) ou falso (false). | BOOLEAN |
| Texto longo  | Texto extenso, usado para armazenar grandes quantidades de dados de texto. | TEXT |

--

### Comando SQL: INSERT

O comando `INSERT` é usado para adicionar novos registros a uma tabela existente em um banco de dados. Ele permite inserir valores específicos nas colunas de uma tabela.

#### Sintaxe do INSERT

A sintaxe básica do comando `INSERT` é a seguinte:

```sql
INSERT INTO nome_da_tabela (coluna1, coluna2, ...)
VALUES (valor1, valor2, ...);
```

#### Exemplo de Utilização

Vamos usar o exemplo da tabela `Cliente` para demonstrar como inserir um novo registro:

Suponha que a tabela `Cliente` tenha as colunas `id`, `nome` e `email`. Aqui está como você poderia inserir um novo cliente:

```sql
INSERT INTO Cliente (id, nome, email)
VALUES (1, 'João Silva', 'joao@example.com');
```

Neste exemplo:
- `Cliente` é o nome da tabela onde os dados serão inseridos.
- `id`, `nome` e `email` são as colunas onde os dados serão inseridos.
- `1`, `'João Silva'` e `'joao@example.com'` são os valores que estão sendo inseridos para as respectivas colunas.

---

### Comando SQL: SELECT

O comando `SELECT` é fundamental para consultas em bancos de dados relacionais. Ele permite selecionar dados de uma tabela ou mais tabelas com base em critérios específicos.

#### Sintaxe Básica do SELECT

A sintaxe básica do comando `SELECT` é a seguinte:

```sql
SELECT coluna1, coluna2, ...
FROM nome_da_tabela;
```

- `coluna1, coluna2, ...`: São as colunas específicas que você deseja recuperar da tabela. Use `*` para selecionar todas as colunas.
- `nome_da_tabela`: É o nome da tabela da qual você deseja selecionar os dados.

#### Exemplo de Utilização Simples

Vamos usar a tabela `Cliente` como exemplo para selecionar todos os registros:

```sql
SELECT * FROM Cliente;
```

Este comando seleciona todas as colunas (`*`) da tabela `Cliente`, retornando todos os registros armazenados nela.

#### Selecionando Colunas Específicas

Para selecionar apenas algumas colunas específicas, liste-as separadas por vírgulas:

```sql
SELECT nome, email FROM Cliente;
```

Neste exemplo, apenas as colunas `nome` e `email` da tabela `Cliente` serão retornadas na consulta.

#### Uso do LIKE para Filtrar Resultados

O operador `LIKE` é usado para filtrar registros baseados em padrões de texto. Ele é útil para encontrar registros que correspondam a um padrão específico em uma coluna de texto:

```sql
SELECT * FROM Cliente WHERE nome LIKE 'João%';
```

Esta consulta retornará todos os clientes cujo nome começa com "João".

#### Ordenando Resultados com ORDER BY

Para ordenar os resultados em ordem ascendente ou descendente, use a cláusula `ORDER BY` seguida pelo nome da coluna de ordenação e opcionalmente por `ASC` (ascendente) ou `DESC` (descendente):

```sql
SELECT * FROM Cliente ORDER BY nome ASC;
```
---
### Operadores SQL utilizados:

| Operador | Descrição                                              | Exemplo                              |
|----------|--------------------------------------------------------|--------------------------------------|
| =        | Igual a                                                 | `SELECT * FROM tabela WHERE coluna = valor;` |
| <>       | Diferente de                                            | `SELECT * FROM tabela WHERE coluna <> valor;` |
| >        | Maior que                                               | `SELECT * FROM tabela WHERE coluna > valor;` |
| <        | Menor que                                               | `SELECT * FROM tabela WHERE coluna < valor;` |
| >=       | Maior ou igual a                                        | `SELECT * FROM tabela WHERE coluna >= valor;` |
| <=       | Menor ou igual a                                        | `SELECT * FROM tabela WHERE coluna <= valor;` |
| LIKE     | Comparação de padrões de texto (coringa)                 | `SELECT * FROM tabela WHERE coluna LIKE 'padrão';` |
| IN       | Verifica se o valor está dentro de um conjunto          | `SELECT * FROM tabela WHERE coluna IN (valor1, valor2);` |
| BETWEEN  | Verifica se um valor está dentro de um intervalo        | `SELECT * FROM tabela WHERE coluna BETWEEN valor1 AND valor2;` |
| AND      | Condição que requer que todas as condições sejam verdadeiras | `SELECT * FROM tabela WHERE condição1 AND condição2;` |
| OR       | Condição que requer que pelo menos uma condição seja verdadeira | `SELECT * FROM tabela WHERE condição1 OR condição2;` |

Esses operadores são fundamentais para criar consultas SQL que filtram e retornam dados de acordo com critérios específicos.
---

### Comando SQL: UPDATE

O comando `UPDATE` é usado para modificar registros existentes em uma tabela.

#### Sintaxe do UPDATE

A sintaxe básica do comando `UPDATE` é a seguinte:

```sql
UPDATE nome_da_tabela
SET coluna1 = valor1, coluna2 = valor2, ...
WHERE condição;
```

- `nome_da_tabela`: É o nome da tabela que será atualizada.
- `coluna1 = valor1, coluna2 = valor2, ...`: São as colunas que serão atualizadas com seus novos valores.
- `WHERE condição`: É opcional e especifica quais registros devem ser atualizados. Se omitido, todos os registros da tabela serão atualizados.

#### Exemplo de Utilização

Vamos usar a tabela `Cliente` como exemplo para atualizar um registro específico:

```sql
UPDATE Cliente
SET email = 'joao.silva@example.com'
WHERE id = 1;
```

Neste exemplo:
- A coluna `email` do cliente com `id` igual a `1` será atualizada para `'joao.silva@example.com'`.

#### Atualizando Todos os Registros de uma Tabela

Para atualizar todos os registros de uma tabela, simplesmente omita a cláusula `WHERE`:

```sql
UPDATE Cliente
SET email = 'novoemail@example.com';
```

**Observação:** Tome cuidado ao executar comandos `UPDATE` sem uma cláusula `WHERE`, pois isso atualizará todos os registros da tabela, o que pode não ser desejado em muitos casos.

---

### Comando SQL: DELETE

O comando `DELETE` é usado para remover registros de uma tabela.

#### Sintaxe do DELETE

A sintaxe básica do comando `DELETE` é a seguinte:

```sql
DELETE FROM nome_da_tabela
WHERE condição;
```

- `nome_da_tabela`: É o nome da tabela da qual os registros serão deletados.
- `WHERE condição`: É opcional e especifica quais registros devem ser deletados. Se omitido, todos os registros da tabela serão deletados.

#### Exemplo de Utilização

Vamos usar a tabela `Cliente` como exemplo para deletar um registro específico:

```sql
DELETE FROM Cliente
WHERE id = 1;
```

Neste exemplo:
- O cliente com `id` igual a `1` será deletado da tabela `Cliente`.

#### Deletando Todos os Registros de uma Tabela

Para deletar todos os registros de uma tabela, simplesmente omita a cláusula `WHERE`:

```sql
DELETE FROM Cliente;
```

**Observação:** Tome cuidado ao executar comandos `DELETE` sem uma cláusula `WHERE`, pois isso deletará todos os registros da tabela, o que pode não ser desejado em muitos casos.


### Comando SQL: DROP

O comando `DROP` é utilizado para remover objetos de um banco de dados, como tabelas, índices, views, ou até mesmo o próprio banco de dados.

#### Sintaxe do DROP

A sintaxe básica do comando `DROP` varia conforme o objeto a ser removido:

1. **Para tabelas:**
   ```sql
   DROP TABLE nome_da_tabela;
   ```

2. **Para índices:**
   ```sql
   DROP INDEX nome_do_indice;
   ```

3. **Para views:**
   ```sql
   DROP VIEW nome_da_view;
   ```

4. **Para o banco de dados inteiro:**
   ```sql
   DROP DATABASE nome_do_banco;
   ```

#### Exemplo de Utilização

Vamos usar um exemplo simples para dropar uma tabela:

```sql
DROP TABLE Cliente;
```

Neste caso, a tabela `Cliente` será completamente removida do banco de dados.

**Observação:** Tome cuidado ao usar o comando `DROP`, pois ele remove permanentemente o objeto especificado e todos os dados associados a ele.

### Comando SQL: ALTER

O comando `ALTER` é usado para fazer alterações em estruturas de objetos existentes no banco de dados, como tabelas e colunas.

#### Sintaxe do ALTER

A sintaxe básica do comando `ALTER` varia dependendo da operação que você deseja realizar:

1. **Adicionar uma coluna:**
   ```sql
   ALTER TABLE nome_da_tabela
   ADD nome_da_coluna tipo_de_dado;
   ```

2. **Modificar uma coluna:**
   ```sql
   ALTER TABLE nome_da_tabela
   ALTER COLUMN nome_da_coluna tipo_de_dado;
   ```

3. **Remover uma coluna:**
   ```sql
   ALTER TABLE nome_da_tabela
   DROP COLUMN nome_da_coluna;
   ```

4. **Renomear uma tabela:**
   ```sql
   ALTER TABLE nome_da_tabela
   RENAME TO novo_nome_da_tabela;
   ```

#### Exemplo de Utilização

Vamos usar um exemplo simples para adicionar uma nova coluna à tabela `Cliente`:

```sql
ALTER TABLE Cliente
ADD telefone VARCHAR(20);
```

Neste exemplo, a coluna `telefone` do tipo `VARCHAR` será adicionada à tabela `Cliente`.

**Observação:** O comando `ALTER` permite ajustar a estrutura de um banco de dados existente sem a necessidade de recriar completamente o objeto.

---
## Chaves Primárias (PRIMARY KEY) 🔑

Exemplo de sintaxe para definir uma chave primária:
```sql
CREATE TABLE Pedido (
    id INT PRIMARY KEY,
    cliente_id INT,
    valor DECIMAL(10, 2),
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
);
```

## Chaves Estrangeiras (FOREIGN KEY) 🔗

Exemplo de sintaxe para definir uma chave estrangeira:
```sql
CREATE TABLE ItemPedido (
    id INT PRIMARY KEY,
    pedido_id INT,
    produto_id INT,
    quantidade INT,
    FOREIGN KEY (pedido_id) REFERENCES Pedido(id),
    FOREIGN KEY (produto_id) REFERENCES Produto(id)
);
```

---

