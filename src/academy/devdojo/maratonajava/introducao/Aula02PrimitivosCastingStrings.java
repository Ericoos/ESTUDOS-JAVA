package academy.devdojo.maratonajava.introducao;

/**
 * byte, short, long, int, double, float, char, boolean <-- tipos primitivos
 * Casting
 * Strings
 */

public class Aula02PrimitivosCastingStrings {
    public static void main(String[] args) {

        // tipos primitivos

        int number = 300000000;
        short number2 = 32767;
        long number3 = 300000000000l;
        byte number4 = 127;

        double number5 = 10d;
        float number6 = 10f;

        char characters = 5;

        boolean cases = true;

        // casting

        // casting implícito com widening

        int x = 5;
        long y = x;

        // casting explicito com narrowing

        double o = 20.3;
        int p = (int) o;

        System.out.println(x);
        System.out.println(p);

        // string

        String nome = "José";

        System.out.println(nome);
    }
}
