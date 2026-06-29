import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Escuela escuela = new Escuela();

        Tutor tutor1 = new Tutor("Juan Perez", "1122334455", "Padre");
        Tutor tutor2 = new Tutor("Maria Gomez", "1166778899", "Madre");

        try {

            Alumno alumno1 = new Alumno("45111222", "Lucas Diaz", "5A", 5, "Regular", tutor1);
            Alumno alumno2 = new Alumno("44222333", "Martin Lopez", "5B", 10, "Regular", tutor2);
            Alumno alumno3 = new Alumno("43333444", "Sofia Martinez", "6A", 25, "Regular", null);

            escuela.agregarAlumno(alumno1);
            escuela.agregarAlumno(alumno2);
            escuela.agregarAlumno(alumno3);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

        System.out.println("----- CONSIGNA 1 -----");
        System.out.print("Ingrese una posicion: ");
        int posicion = teclado.nextInt();

        escuela.consultarAlumno(posicion);

        teclado.nextLine();

        System.out.println("\n----- CONSIGNA 2 -----");
        System.out.print("Ingrese la posicion del alumno: ");
        int pos = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Ingrese nuevas inasistencias: ");
        String cantidad = teclado.nextLine();

        escuela.registrarInasistencias(pos, cantidad);

        System.out.println("\n----- CONSIGNA 3 -----");
        System.out.print("Ingrese una posicion: ");
        int posTutor = teclado.nextInt();

        escuela.mostrarTutor(posTutor);

        System.out.println("\n----- CONSIGNA 5 -----");

        try {

            Alumno alumnoLibre = new Alumno(
                    "43333444",
                    "Sofia Martinez",
                    "6A",
                    25,
                    "Regular",
                    null
            );

            alumnoLibre.operacionEspecial();

        } catch (AlumnoLibreException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Operacion finalizada.");

        }

        teclado.close();
    }

}