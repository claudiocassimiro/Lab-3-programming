# Projeto GitHub - Desafios de Programação

Este repositório contém soluções para alguns desafios de programação. Abaixo estão os detalhes de cada desafio e como executar os programas correspondentes.

## Desafio 1: Múltiplos de 3

Desenvolva um programa que leia um intervalo, busque quantos números são múltiplos de 3 naquele intervalo e mostre a soma destes números.

Exemplo:

```
Intervalo: 1 à 10
Total de Múltiplos de 3: 3
Soma: 18
```

## Desafio 2: Sistema de Compras

Desenvolva um programa que mostre um menu de opções. O usuário pode escolher produtos e acumular o valor da compra até escolher a opção "Sair". O programa deve mostrar o valor total da compra.

Exemplo:

```
O usuário começa com a variável compras = 0 usd

Arroz - 8 usd
Feijão - 10 usd
Batata - 15 usd
Carne - 100 usd
Sair

"Ingresse com uma opção: "
```

## Desafio 3: Verificador de String

Implemente uma função `printer_error` que verifica se uma string é "boa" ou "má" em relação a uma sequência de controle. A função deve retornar a taxa de erro como uma fração.

Exemplo:

```python
s = "aaabbbbhijjjm"
error_printer(s) => "0/13"   # significa que houve 0 erros e a string tem 13 caracteres
```

## Desafio 4: Sequência Collatz

Implemente um programa que solicita ao usuário um limite, encontra o número com a sequência mais longa, mostra a quantidade de passos e a sequência completa.

Exemplo:

```
Limite: 10
Número com a sequência mais larga: 9
Passos desse número: 19
Sequência: 9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
```