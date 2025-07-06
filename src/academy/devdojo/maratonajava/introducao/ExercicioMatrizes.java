package academy.devdojo.maratonajava.introducao;

public class ExercicioMatrizes {
    public static void main(String[] args) {
        int numeros[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int soma = 0;
        int pares = 0;

        for (int[] numArrays : numeros) {
            for (int num : numArrays) {
                soma = soma + num;
            }
        }

        for (int[] numArrays : numeros) {
            for (int num : numArrays) {
                if (num % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println(soma);
        System.out.println(pares);
    }
}
