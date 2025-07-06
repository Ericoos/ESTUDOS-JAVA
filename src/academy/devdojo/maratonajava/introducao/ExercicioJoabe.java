package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class ExercicioJoabe {
    public static void main(String[] args) {
        int temperaturas[] = {20, 23, 30, 22, 25, 29, 30, 31, 21, 10, 23, 15};
        int menorTemp = temperaturas[0];
        int maiorTemp = temperaturas[0];

        for (int num : temperaturas) {
            if (num < menorTemp) {
                menorTemp = num;
            } else if (num > maiorTemp) {
                maiorTemp = num;
            }
        }

        System.out.println("A menor temperatura do ano foi: " + menorTemp);
        System.out.println("A maior temperatura do ano foi: " + maiorTemp);

        for (int i = 0; i < temperaturas.length; i++) {
            switch(i) {
                case 0:
                    System.out.println("Janeiro: " + temperaturas[0]);
                    break;
                case 1:
                    System.out.println("Fevereiro: " + temperaturas[1]);
                    break;
                case 2:
                    System.out.println("Março: " + temperaturas[2]);
                    break;
                case 3:
                    System.out.println("Abril: " + temperaturas[3]);
                    break;
                case 4:
                    System.out.println("Maio: " + temperaturas[4]);
                    break;
                case 5:
                    System.out.println("Junho: " + temperaturas[5]);
                    break;
                case 6:
                    System.out.println("Julho: " + temperaturas[6]);
                    break;
                case 7:
                    System.out.println("Agosto: " + temperaturas[7]);
                    break;
                case 8:
                    System.out.println("Setembro: " + temperaturas[8]);
                    break;
                case 9:
                    System.out.println("Outubro: " + temperaturas[9]);
                    break;
                case 10:
                    System.out.println("Novembro: " + temperaturas[10]);
                    break;
                case 11:
                    System.out.println("Dezembro: " + temperaturas[11]);
                    break;

                default:
                    System.out.println("Mês inválido.");
            }
        }

    }
}

