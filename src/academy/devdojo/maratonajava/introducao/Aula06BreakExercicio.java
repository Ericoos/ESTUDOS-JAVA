package academy.devdojo.maratonajava.introducao;

public class Aula06BreakExercicio {
    public static void main(String[] args) {

        // Exemplo de uso do Break

        int i = 0;
        int limite = 50;

        while (true) {
            i++;
            if (i == (limite/2)) {
                // System.out.println("O contador chegou em " + i);
                break;
            } else {
                // System.out.println("O contador está em: " + i);
            }
        }

        // Exercício

        int valor = 30000;
        int valorParcela = 0;

        for (int parcela = 1; parcela <= 30000; parcela++) {
                valorParcela = valor / parcela;

                if (valorParcela < 1000) {
                    break;
                }

                System.out.println("O carro pode ser feito em até: " + parcela + " vezes de: " + valorParcela + " sem juros.");
        }



    }
}
