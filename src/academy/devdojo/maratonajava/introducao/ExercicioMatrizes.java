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

        // System.out.println(soma);
        // System.out.println(pares);

        int num[][] = new int[4][];
        num[0] = new int[]{1,2,3};
        num[1] = new int[3];
        num[2] = new int[3];

        for (int[] linhas : num) {
            for (int elementos : linhas) {
                System.out.println(elementos);
            }
        }
    }
}
