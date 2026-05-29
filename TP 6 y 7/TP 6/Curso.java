import java.util.ArrayList;

public class Curso {

    private String nombre;
    private ArrayList<Estudiante> alumnos;

    // Constructor
    public Curso(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
    }

    // Inscribir alumno
    public void inscribir(Estudiante e) {
        alumnos.add(e);
    }

    // Dar de baja alumno
    public void darDeBaja(int indice) {
        alumnos.remove(indice);
    }

    // Listar alumnos
    public void listarAlumnos() {

        System.out.println("Curso: " + nombre);

        for (Estudiante e : alumnos) {
            e.mostrarFicha();
        }
    }

    // Cantidad de alumnos
    public int cantidadAlumnos() {
        return alumnos.size();
    }
}