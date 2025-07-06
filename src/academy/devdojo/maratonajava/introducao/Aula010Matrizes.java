package academy.devdojo.maratonajava.introducao;

public class Aula010Matrizes {
    public static void main(String[] args) {
        String frutas[][] = {
                {"Maçã1", "Pera1", "Banana1"},
                {"Maçã2", "Pera2", "Banana2"},
                {"Maçã3", "Pera3", "Banana3"}
        };

        int dias[][] = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        dias[2][0] = 7;
        dias[2][1] = 8;
        dias[2][2] = 9;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                // System.out.println(dias[i][j]);
            }
        }

        for (int i = 0; i < frutas.length; i++) {
            for (int x = 0; x < frutas[i].length; x++) {
                // System.out.println(frutas[i][x]);
            }
        }

        for (int[] arrayBase : dias) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
