package academy.devdojo.maratonajava.introducao;

/**
 * Operadores Aritméticos (+, -, *, / e %) <br>
 * E erros ao usar esses operadores. <br>
 * <br>
 * Operadores Lógicos (>, <, >=, <=, ==, !=) <br>
 * Eles retornam valores booleanos (true ou false)
 */

public class Aula04Operadores {
    public static void main(String[] args) {

        // Exemplo de operações e operadores aritméticos

        int adicao = 5 + 5;
        int subtracao = 11 - 5;
        int divisao = 10 / 2;
        int multiplicacao = 5 * 2;
        int restoDivisao = 10 % 5;

        int num1 = 5;
        int num2 = 5;

        System.out.println("Valor: " + num1 + num2); // Resultara no resultado: Valor: 55 (incorreto)
        System.out.println("Valor: " + (num1 + num2)); // Resultara no resultado: Valor: 10 (correto)

        int num3 = 10;
        int num4 = 20;

        double num5 = 10;
        double num6 = 20;

        System.out.println("Valor " + (num3 / num4)); // Aqui ele não irá imprimir 0.5 e sim o 0, porque estamos utilizando int ao invés de double ou float.
        System.out.println("Valor " + (num5 / num6)); // Aqui ele irá imprimir o valor correto pois está utilizando o tipo de variável correta para a operação.
        System.out.println("Valor " + ((double) num3 / (double) num4)); // Fazendo casting para exibir o valor correto da operação

        // Operadores Relacionais

        boolean maior = 20 > 10;
        // System.out.println("Vinte é maior que 10?: " + maior); // Retornará true pois 20 é maior que 10

        boolean menor = 20 < 10;
        // System.out.println("Vinte é menor que 10?: " + menor); // Retornará false pois 20 é maior que 10

        boolean maiorIgual = 20 >= 10;
        // System.out.println("Vinte é maior ou igual a 10?: " + maiorIgual); // Retornará true pois 20 é maior que 10 (porque ele cumpriu uma das exigências (ser maior ou igual a 10))

        boolean menorIgual = 20 <= 10;
        // System.out.println("Vinte é menor ou igual a 10?: " + menorIgual); // Retornará false pois 20 é maior e não é igual a 10 (porque ele não cumpriu nenhuma das exigências (ser menor ou igual a 10))

        boolean igual = 20 == 10;
        // System.out.println("Vinte é igual a 10?: " + igual); // Retornará false 20 não é igual a 10

        boolean diferente = 20 != 10;
        // System.out.println("Vinte é diferente de 10?: " + diferente); // Retornará true pois 20 é diferente de 10

        // Operadores Lógicos

        int idade = 18;
        float salario = 1200;
        boolean teste = idade >= 18 && salario >= 1000;

        // System.out.println("O teste retornou que suas entradas são: " + teste); // Ele retornou true porque a proposição é verdadeira nos 2 casos

        int idade2 = 17;
        float salario2 = 1200;
        boolean teste2 = idade2 >= 18 && salario2 >= 1000;

        // System.out.println("O teste retornou que suas entradas são: " + teste2); // Ele retornou false porque a proposição é false em um ou nos 2 casos

        int idade3 = 17;
        float salario3 = 1200;
        boolean teste3 = idade3 >= 18 || salario3 >= 1000;

        // System.out.println("O teste retornou que suas entradas são: " + teste3); // Ele retornou true porque a uma das duas condições é verdadeira

        int idade4 = 17;
        float salario4 = 900;
        boolean teste4 = idade4 >= 18 || salario4 >= 1000;

        // System.out.println("O teste retornou que suas entradas são: " + teste4); // Ele retornou false porque as 2 condições da proposição são falsas

        int idade5 = 17;
        boolean testeIdade = idade5 < 18;

        // System.out.println("O teste retornou que suas entradas são: " + !testeIdade); // Ele retornou false porque nós invertemos o resultado que era pra ser true, idade5 < 18 é true, mas usando o operando NOT vira false

        int atr1 = 1; // Inicializando variável
        atr1 += 2; // Atribuindo novo valor a variável

        int atr2 = 1; // Inicializando variável
        atr2++; // Incrementando o valor da variável

        // System.out.println(atr1);
        // System.out.println(atr2);

        int a = 5;
        int b = ++a; // Primeiro incrementa (a = 6), depois atribui a b
        // System.out.println("a = " + a); // 6
        // System.out.println("b = " + b); // 6

        int c = 5;
        int d = c++; // Primeiro usa (d = 5), depois incrementa (c = 6)
        // System.out.println("c = " + c); // 6
        // System.out.println("d = " + d); // 5

        // Exercício

        for (long i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("For: " + i);
            }
        }

        long counter = 0;

        while (counter <= 1000000) {
                counter++;
            if (counter % 2 == 0) {
                System.out.println("While: " + counter);
            }
        }

        long counter2 = 0;

        do {
                counter2++;
            if (counter2 % 2 == 0) {
                System.out.println("Do while: " + counter2);
            }
        } while (counter2 <= 1000000);
    }
}
