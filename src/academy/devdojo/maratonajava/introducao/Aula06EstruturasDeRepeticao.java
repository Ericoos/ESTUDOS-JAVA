package academy.devdojo.maratonajava.introducao;

/**
 * While, do While e For
 */

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        int count1 = 9;
        while (count1 < 10) {
            System.out.println("While: " + count1);
            count1++;
        }

        int count2 = 11;
        do {
            System.out.println("Do While: " + count2);
            count2++;
        } while (count2 < 10);

        for (int count3 = 1; count3 < 10; count3++) {
            System.out.println("For (Dentro): " + count3);
        }

        int contador = 0;

        for(; contador < 10; contador++) { // ; no lugar da inicialização pois o contador foi declarado fora do for
            System.out.println("For (Fora): " + contador);
        }
    }
}
