import java.util.ArrayList;

public class Escuela {

    private ArrayList<Alumno> alumnos;

    public Escuela() {
        alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    // Consigna 1
    public void consultarAlumno(int posicion) {

        try {

            System.out.println(alumnos.get(posicion));

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Error: la posicion ingresada no existe.");

        } finally {

            System.out.println("Consulta finalizada.\n");

        }

    }

    // Consigna 2
    public void registrarInasistencias(int posicion, String cantidad) {

        try {

            int nuevas = Integer.parseInt(cantidad);

            Alumno alumno = alumnos.get(posicion);

            alumno.setInasistencias(alumno.getInasistencias() + nuevas);

            System.out.println("Inasistencias registradas correctamente.");

        } catch (NumberFormatException e) {

            System.out.println("Error: debe ingresar un numero.");

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Error: el alumno no existe.");

        } finally {

            System.out.println("Operacion finalizada.\n");

        }

    }

    // Consigna 3
    public void mostrarTutor(int posicion) {

        try {

            Tutor tutor = alumnos.get(posicion).getTutor();

            System.out.println(tutor.toString());

        } catch (NullPointerException e) {

            System.out.println("El alumno no tiene tutor registrado.");

        } catch (IndexOutOfBoundsException e) {

            System.out.println("La posicion ingresada no existe.");

        } finally {

            System.out.println("Consulta del tutor finalizada.\n");

        }

    }

}