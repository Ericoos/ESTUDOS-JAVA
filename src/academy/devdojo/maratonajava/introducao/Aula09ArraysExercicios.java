package academy.devdojo.maratonajava.introducao;

public class Aula09ArraysExercicios {
    public static void main(String[] args) {
        // Exercício 1 (Soma dos números)

        int numeros[] = {1, 2, 3, 4, 5};
        int somaNumeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            somaNumeros = somaNumeros + numeros[i];
        }

        // System.out.println("A soma de todos os números no array é: " + somaNumeros);

        // Exercício 2 (Média dos valores)

        int maior = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
        }

        // System.out.println("O menor número é: " + menor + " E o maior número é: " + maior);

        // Exercício 3 (Média dos valores)


    }
}
