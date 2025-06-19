package academy.devdojo.maratonajava.introducao;

/**
 * Estruturas Condicionais <br>
 * If, Else, Else If, Operadores Ternários e Switch/Switch Case
 */

public class Aula05Condicionais {
    public static void main(String[] args) {

        // Primeiro Exemplo sem uso do ELSE

        int idade = 15;
        boolean eDeMaior = idade >= 18;

        if (eDeMaior) {
            System.out.println("Usuário de maior!");
        }

        if(!eDeMaior) { // Poderia ser eDeMaior == False
            System.out.println("Usuário de Menor!");
        }

        // Segundo Exemplo com o uso do ELSE

        int idade2 = 15;
        boolean eDeMaior2 = idade2 >= 18;

        if (eDeMaior2) {
            System.out.println("Usuário de maior!");
        } else {
            System.out.println("Usuário de Menor!");
        }

        // Terceiro Exemplo com ELSE IF

        int idade3 = 14;

        if (idade3 < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade3 >= 15 && idade3 <= 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
    }
}

