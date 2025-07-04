package academy.devdojo.maratonajava.introducao;

/**
 * Arrays e Índices
 */

public class Aula07Arrays {
    public static void main(String[] args) {
        int idades[] = {2, 7, 5, 11, 15};

        for (int i = 0; i < idades.length; i++) {
            for (int j = i + 1; j < idades.length; j++) {
            //    System.out.println("Variável I: " + idades[i] + " " + "Varíavel J: " + idades[j]);
            }
        }

        String idades2[] = new String[3];
        // System.out.println(idades2[1]);

        String[] nomes = new String[3]; // Criando o array
        nomes[0] = "Erick";
        nomes[1] = "Joana";
        nomes[2] = "Vitor";

        String[] nomesAntigos = nomes; // Atribuindo os nomes antigos a uma nova array
        nomes = new String[5]; // Aumentando o tamanho da array antiga

        for (int i=0; i < nomes.length; i++) {
            if (i < nomesAntigos.length) {
                nomes[i] = nomesAntigos[i];
            } else if (i == 3) {
                nomes[3] = "Leo";
            } else if (i == 4) {
                nomes[4] = "Kauã";
            }
        }

        for (int i = 0; i < nomes.length; i++) {
            // System.out.println(nomes[i]);
        }

    }
}
