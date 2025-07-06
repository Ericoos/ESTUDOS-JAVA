package academy.devdojo.maratonajava.introducao;

public class ExercicioSwitch {
    public static void main(String[] args) {
        // Exercício 1 (Dias da Semana)

        String diasSemana[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        int entradaDia = 4;

            switch (entradaDia - 1) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println(diasSemana[entradaDia - 1]);
                    break;
            }

        }
    }

