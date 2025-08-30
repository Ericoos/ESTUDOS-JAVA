package academy.devdojo.maratonajava.introducao;

import java.util.*;

public class Exercicios {
    public static void main(String[] args) {

        // 1.1. Dado um número inteiro entre 1 e 7, use switch para retornar o dia da semana correspondente.

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 1");
        System.out.println("------------------------------------------------------------------------------");

        int dia = 7;

        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Digito inválido");
                break;
        }

        // Exibir se é semana ou fim de semana

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("É dia de semana");
                break;
            case 7:
            case 8:
                System.out.println("É fim de semana");
                break;

            default:
                System.out.println("Digito inválido");
                break;
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 2");
        System.out.println("------------------------------------------------------------------------------");

        // 1.2. Use switch para exibir o nome de um animal com base em um número de 1 a 3 (1 - Cachorro, 2 - Gato, 3 - Coelho).

        int numAnimal = 1;

        switch (numAnimal) {
            case 1:
                System.out.println("Cachorro");
                break;
            case 2:
                System.out.println("Gato");
                break;
            case 3:
                System.out.println("Coelho");
                break;

            default:
                System.out.println("Digito inválido");
                break;
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 3");
        System.out.println("------------------------------------------------------------------------------");

        // 1.3. Crie um menu com switch onde o usuário pode escolher entre "Iniciar Jogo", "Ver Pontuação" ou "Sair".

        String escolhaJogador = "Sair"; // Ações disponíveis: Iniciar Jogo, Ver Pontuação, Sair
        int pontuacaoJogador = 5;

        switch (escolhaJogador) {
            case "Iniciar Jogo":
                System.out.println("O jogo foi iniciado");
                break;
            case "Ver Pontuação":
                System.out.println("A pontuação do jogador é: " + pontuacaoJogador);
                break;
            case "Sair":
                System.out.println("O jogo foi encerrado");
                break;

            default:
                System.out.println("Sintaxe inválida");
                break;
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 4");
        System.out.println("------------------------------------------------------------------------------");

        // 1.4. Escreva um programa que receba um número de 1 a 4 e mostre a estação do ano correspondente.

        int estacaoAno = 1;

        switch (estacaoAno) {
            case 1:
                System.out.println("É verão");
                break;
            case 2:
                System.out.println("É outono");
                break;
            case 3:
                System.out.println("É inverno");
                break;
            case 4:
                System.out.println("É primavera");
                break;

            default:
                System.out.println("Digito inválido");
                break;
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 5");
        System.out.println("------------------------------------------------------------------------------");

        // 1.5. Implemente um programa que recebe a nota A, B, C, D ou F e imprime uma mensagem simples com base no desempenho.

        String notaAluno = "A";

        switch (notaAluno) {
            case "B":
            case "A":
                System.out.println("Desempenho excelente!");
                break;
            case "C":
                System.out.println("Desempenho mediano");
                break;
            case "D":
            case "E":
            case "F":
                System.out.println("Desempenho ruim!");
                break;

            default:
                System.out.println("Valor inválido!");
                break;
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 6");
        System.out.println("------------------------------------------------------------------------------");

        // 2.1. Crie um array com 5 números inteiros e imprima todos os valores.

        int num[] = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 7");
        System.out.println("------------------------------------------------------------------------------");

        // 2.2. Leia 6 números e imprima apenas os números pares.

        int numPares[] = {1, 2, 3, 4, 5, 6};

        for (int num1 : numPares) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 8");
        System.out.println("------------------------------------------------------------------------------");

        // 2.3. Crie um array com 10 nomes e imprima todos em letras maiúsculas.

        String nomes[] = {"José", "Jonas", "Marcio", "Marcelo", "Kaique"};

        for (String elemento : nomes) {
            System.out.println(elemento.toUpperCase());
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 9");
        System.out.println("------------------------------------------------------------------------------");

        // 2.4. Preencha um array de 10 posições com os números de 10 a 1 e imprima em ordem crescente.

        int numerosCrescente[] = {3, 6, 2, 1, 9, 15, 4, 23, 10};
        Arrays.sort(numerosCrescente);

        for (int elementos : numerosCrescente) {
            System.out.println(elementos);
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 10");
        System.out.println("------------------------------------------------------------------------------");

        // 2.5. Crie um array com 10 elementos e mostre a soma de todos eles.

        int arraySoma[] = {10,2,3,6,1,7,9,5,8};
        int soma = 0;

        for (int i = 0; i < arraySoma.length; i++) {
            soma += arraySoma[i];
        }

        System.out.println(soma);

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 11");
        System.out.println("------------------------------------------------------------------------------");

        // 2.6. Dado um array de 15 números inteiros, encontre e imprima todos os números primos contidos nele.

        int numerosPrimos[] = {1,2,3,4,5};
        int divisores = 0;

        for (int i = 0; i < numerosPrimos.length; i++) {
            divisores = 0;

            for (int j = 0; j < numerosPrimos.length; j++) {
                if (numerosPrimos[i] % numerosPrimos[j] == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println("O número " + numerosPrimos[i] + " é primo");
            } else {
                System.out.println("O número " + numerosPrimos[i] + " não é primo");
            }
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Exercício 12");
        System.out.println("------------------------------------------------------------------------------");

        // 2.7. Receba 10 números inteiros. Imprima os três maiores valores em ordem decrescente.

        Integer maioresNumeros[] = {5,3,1,9,10,2,11,14,6};
    }
}
