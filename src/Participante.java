import java.util.Scanner;

public class Participante {
    private String nombre;
    private int[] calificaciones;

    public Participante(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    public char obtenerCalificacionFinal() {
        double promedio = calcularPromedio();

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

    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        double promedio = calcularPromedio();
        System.out.println("Promedio: " + promedio);
        char calificacionFinal = obtenerCalificacionFinal();
        System.out.println("Calificación: " + calificacionFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        int[] calificaciones = new int[5];
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        Participante participante = new Participante(nombre, calificaciones);
        participante.imprimirResultados();

        scanner.close();
    }
}
