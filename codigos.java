import java.util.Scanner;

public class codigos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alumnosIngresados = 0;
        int nota = 0;
        double sumaNotas = 0;
        double promedio = 0;

        System.out.println("Cuantos alumnos desea calificar?: ");
        alumnosIngresados = sc.nextInt();

        for (int i = 1; i <= alumnosIngresados; i++) {

            System.out.println("Ingrese la nota del alumno " + i + " (1-10): ");
            nota = sc.nextInt();

            while (nota < 1 || nota > 10) {
                System.out.println("Nota invalida. Ingrese una nota entre 1 y 10: ");
                nota = sc.nextInt();
            }

            sumaNotas += nota;

            if (nota >= 1 && nota <= 3) {
                System.out.println("Calificacion: Insuficiente");
            } else if (nota >= 4 && nota <= 5) {
                System.out.println("Calificacion: Regular");
            } else if (nota >= 6 && nota <= 7) {
                System.out.println("Calificacion: Bueno");
            } else if (nota >= 8 && nota <= 9) {
                System.out.println("Calificacion: Muy Bueno");
            } else if (nota == 10) {
                System.out.println("Calificacion: Excelente");
            }
        }

        promedio = sumaNotas / alumnosIngresados;
        System.out.println("Promedio general del curso: " + promedio);

        sc.close();
    }
}