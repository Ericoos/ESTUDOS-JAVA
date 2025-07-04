package academy.devdojo.maratonajava.introducao;

public class Aula08ForEach {
    public static void main(String[] args) {
        // Exercício 1 (Nome dos Alunos)

        String nomesAlunos[] = {"Erick", "João", "Vitor", "Kauã", "Thimoty"};

        for(String nomes : nomesAlunos) {
            // System.out.println(nomes);
        }

        // Exercício 2 (Soma de valores)

        int numerosInteiros[] = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int num : numerosInteiros) {
            soma = soma + num;
        }

        // System.out.println(soma);

        // Exercício 3 (Contar quantos números pares tem no array)

        int numeros2[] = {1, 2, 3, 4, 5, 6};
        int somaPares = 0;

        for (int num : numeros2) {
            if (num % 2 == 0) {
                somaPares++;
                // System.out.println("É numero par: " + num);
            }
        }

        // System.out.println("Existe um total de " + somaPares + " números pares");

        // Exercício 4 (Transformar nomes)

        String nomes[] = {"josé", "ana", "cláudio"};

        for (String nome : nomes) {
            // System.out.println(nome.toUpperCase());
        }

        // Exercício 5 (Encontrar número)

        int numeros3[] = {4, 2, 3, 9, 15, 10};

        for (int num : numeros3) {
            if (num == 10) {
                System.out.println("O número encontrado foi: " + num);
            }
        }
    }
}
