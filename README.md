# Desafio_compra

Desafio  do curso de carreira Back-End Java pela Alura.

## Sobre o Projeto

Este projeto consiste em uma aplicação simples de gerenciamento de compras utilizando cartão de crédito. O objetivo é demonstrar conceitos essenciais da linguagem Java, incluindo manipulação de classes, listas, ordenação e controle de fluxo, simulando o funcionamento básico de um cartão de crédito.

## Funcionalidades

- Definição do limite do cartão de crédito pelo usuário.
- Cadastro de compras com descrição e valor.
- Verificação automática de saldo disponível antes de cada compra.
- Lançamento de compras realizadas no cartão.
- Exibição das compras realizadas, ordenadas pelo valor.
- Exibição do saldo restante do cartão após as compras.

## Como funciona

1. O usuário informa o limite do cartão de crédito.
2. Para cada compra, informa a descrição e o valor.
3. Caso o saldo seja suficiente, a compra é registrada; caso contrário, o sistema informa saldo insuficiente e encerra.
4. Ao final, o sistema exibe todas as compras realizadas na ordem crescente de valor e o saldo disponível.

## Estrutura do Código

- `CartaoCredito.java`: Classe responsável pela lógica do cartão, armazenamento do limite, saldo e lista de compras.
- `Compra.java`: Classe que representa uma compra, contendo descrição e valor. Implementa a ordenação por valor.
- `Principal.java`: Classe principal que faz a interação com o usuário, coleta dados e exibe os resultados.

## Como executar

1. Clone o repositório:
   ```sh
   git clone https://github.com/gabriel0l1veira/Desafio_compra.git
   ```
2. Compile os arquivos Java:
   ```sh
   javac src/*.java
   ```
3. Execute a aplicação:
   ```sh
   java -cp src Principal
   ```

## Tecnologias Utilizadas

- Java

## Autor

- [Gabriel Oliveira](https://github.com/gabriel0l1veira)
