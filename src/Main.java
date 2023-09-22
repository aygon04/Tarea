// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {

    public static class PromedioAlumno {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = scanner.nextLine();

            double[] calificaciones = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese la calificación " + (i + 1) + ": ");
                calificaciones[i] = scanner.nextDouble();
            }

            double promedio = calcularPromedio(calificaciones);
            char calificacionFinal = asignarCalificacionFinal(promedio);

            imprimirResultados(nombre, calificaciones, promedio, calificacionFinal);

            scanner.close();
        }

        // Método para calcular el promedio
        public static double calcularPromedio(double[] calificaciones) {
            double suma = 0;
            for (double calificacion : calificaciones) {
                suma += calificacion;
            }
            return suma / calificaciones.length;
        }

        // Método para asignar la calificación final
        public static char asignarCalificacionFinal(double promedio) {
            if (promedio <= 50) {
                return 'F';
            } else if (promedio <= 60) {
                return 'E';
            } else if (promedio <= 70) {
                return 'D';
            } else if (promedio <= 80) {
                return 'C';
            } else if (promedio <= 90) {
                return 'B';
            } else {
                return 'A';
            }
        }

        // Método para imprimir los resultados
        public static void imprimirResultados(String nombre, double[] calificaciones, double promedio, char calificacionFinal) {
            System.out.println("Nombre del estudiante: " + nombre);
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
            }
            System.out.println("Promedio: " + promedio);
            System.out.println("Calificación: " + calificacionFinal);
        }
    }
}