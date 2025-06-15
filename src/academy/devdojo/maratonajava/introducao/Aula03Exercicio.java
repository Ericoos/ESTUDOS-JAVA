package academy.devdojo.maratonajava.introducao;

/**
 * Crie variáveis para os campos descritos abaixo entre ** e imprima a seguinte mensagem:
 * Eu *nome*, morando no endereço *endereço*, confirmo que recebi o salário de *salario*, na data *data*.
 */


public class Aula03Exercicio {
    public static void main(String[] args) {
        String nome = "Erick";
        int endereco = 467;
        double salario = 2200.00d;
        String data = "03/06/2025";

        System.out.println("Eu " + nome + "," + " morando no endereço" + " " + endereco + "," + " confirmo que recebi o salário de: " + salario + " na data: " + data);
    }
}
