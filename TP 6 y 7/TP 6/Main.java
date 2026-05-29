public class Main {

    public static void main(String[] args) {

        // Crear curso
        Curso curso = new Curso("5°2°");

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Juan", "12345678", 4.0);
        Estudiante e2 = new Estudiante("Nacho", "87654321", 9.0);
        Estudiante e3 = new Estudiante("Luca", "45678912", 7.8);

        // Inscribir estudiantes
        curso.inscribir(e1);
        curso.inscribir(e2);
        curso.inscribir(e3);

        // Mostrar cantidad
        System.out.println("Cantidad de alumnos: " + curso.cantidadAlumnos());

        // Eliminar segundo alumno
        curso.darDeBaja(1);

        // Listar alumnos restantes
        curso.listarAlumnos();
    }
}