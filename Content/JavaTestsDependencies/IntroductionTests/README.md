# 📝 Introdução a Testes de Software
> Conhecendo: Teoria Testes de código.

## Índice

1. [O que é um Teste?](#o-que-é-um-teste-)
2. [Evolução de Testes na Engenharia de Software](#evolução-de-testes-na-engenharia-de-software-)
   - [Modelo Cascata](#modelo-cascata)
   - [Desenvolvimento Ágil](#desenvolvimento-ágil)
3. [Conceitos Básicos de Testes de Software](#conceitos-básicos-de-testes-de-software-)
   - [Terminologia](#terminologia-)
     - [Defeito, Erro, Falha](#defeito-erro-falha)
     - [Verificação vs Validação](#verificação-vs-validação)
     - [Estático vs Dinâmico](#estático-vs-dinâmico)
4. [Outros Aspectos dos Testes de Software](#outros-aspectos-dos-testes-de-software-)
   - [Níveis de Teste](#níveis-de-teste-)
   - [Técnicas de Teste](#técnicas-de-teste-%EF%B8%8F)
   - [Testes não Funcionais](#testes-não-funcionais-)
   - [Pirâmide de Testes](#pirâmide-de-testes-)
---

## O que é um Teste? 🧪
Um teste de software é um processo realizado para identificar a qualidade e a conformidade de um sistema em relação aos requisitos especificados. Ele ajuda a garantir que o software atenda aos padrões de qualidade esperados antes de ser lançado para os usuários finais.

---

## Evolução de Testes na Engenharia de Software 🚀
Os testes de software evoluíram significativamente desde os métodos iniciais até as práticas modernas. Esta seção explora como os testes passaram de procedimentos manuais simples para técnicas automatizadas avançadas, acompanhando o crescimento da engenharia de software.

### Modelo Cascata

No modelo cascata, um dos primeiros modelos de desenvolvimento, os testes eram realizados apenas no final do ciclo, após a implementação. Era uma abordagem sequencial com foco em testes manuais das funcionalidades finais. Com o tempo, este modelo foi substituído por metodologias ágeis que incorporam testes contínuos ao longo do ciclo de vida do software.
```mermaid
graph LR
Especificação --> Projeto_de_Software --> Implementação --> Testes --> Implantação
```

### Desenvolvimento Ágil

No Desenvolvimento Ágil, os testes são integrados ao longo de todo o ciclo de vida do software, em contraste com o modelo cascata. Esta abordagem promove iterações rápidas e feedback contínuo, permitindo ajustes e melhorias constantes no software. Os testes são automatizados sempre que possível, o que aumenta a eficiência e a confiabilidade do processo de desenvolvimento.
```mermaid
graph LR;
    A[Requisitos] --> B[Planejamento];
    B --> C[Implementação];
    C --> D[Testes];
    D --> E[Integração];
    E --> F[Implantação];
```
---

## Conceitos Básicos de Testes de Software 📘
Os conceitos básicos são fundamentais para entender os testes de software. Aqui, você aprenderá os termos essenciais, tipos de testes e as principais abordagens utilizadas para verificar a funcionalidade e a performance do software.

### Terminologia 🔤

#### Defeito, Erro, Falha
- **Erro**: Também chamado de "engano", é uma ação humana que produz um resultado incorreto. ❌
- **Defeito**: Também conhecido como "falha" ou "bug", é uma imperfeição no produto de trabalho, como código, causada por um erro. 🐞
- **Falha**: Evento causado por um defeito no qual um sistema, ou parte dele, não executa uma função conforme os requisitos estabelecidos. 🚫

```mermaid
graph LR
Erro --> Defeito --> Falha
```
#### Verificação vs Validação
- **Verificação**: Processo de avaliar se o produto de software cumpre as especificações e requisitos durante as fases de desenvolvimento. 📐
- **Validação**: Processo de avaliar se o software atende às necessidades e expectativas do usuário final quando em uso. 🎯
  
#### Estático vs Dinâmico
- **Teste estático**: Análise do código sem a necessidade de execução, como revisões de código. 📝
- **Teste dinâmico**: Envolve a execução do código para validar seu comportamento. 🏃‍♂️

## Outros Aspectos dos Testes de Software 📊
### Níveis de Teste 🔢
- Explora os diferentes níveis de testes, como testes unitários, de integração, de sistema e de aceitação.
- Acesse mais sobre: [Níveis de Teste](LevelsOfTesting)
  
### Técnicas de Teste 🛠️
- Cobertura de técnicas como teste de caixa-preta, teste de caixa-branca, teste de regressão, entre outras.
- Acesse mais sobre: [Técnicas de Teste](TestingTechniques)

### Testes não Funcionais 📛
- Aborda testes relacionados a desempenho, segurança, usabilidade e outros aspectos não funcionais.
- Acesse mais sobre: [Testes não Funcionais](NonFunctionalTests)
  
### Pirâmide de Testes 🔼
- Explica a distribuição ideal dos diferentes tipos de teste na estratégia de garantia de qualidade.
- Acesse mais sobre: [Pirâmide de Testes](TestingPyramid)
