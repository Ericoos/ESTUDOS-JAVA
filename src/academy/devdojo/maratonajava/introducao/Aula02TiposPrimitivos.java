package academy.devdojo.maratonajava.introducao;

/**
 * byte, short, long, int, double, float, char, boolean <-- tipos primitivos
 */

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int number = 300000000;
        short number2 = 32767;
        long number3 = 300000000000l;
        byte number4 = 127;

        double number5 = 10.0d;
        float number6 = 10.0f;

        char characters = 5;

        boolean cases = true;

        System.out.println(characters);

        // casting

        int x = 5;
        double y = 20.3;

        int o = 6;
        double p = 20.5;

        // x = y; <-- dá erro
        
        System.out.println(y);
    }
}
