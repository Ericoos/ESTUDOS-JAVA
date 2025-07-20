package academy.devdojo.maratonajava.introducao;

public class Exercicios {
    public static void main(String[] args) {

        // Matrizes (Soma dos itens)
        int num[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int soma = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                soma += num[i][j];
                // System.out.println(soma);
            }
        }

        // Matrizes (

        int num2[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i][i]);
        }

    }
}
