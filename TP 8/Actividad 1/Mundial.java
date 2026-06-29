import java.util.ArrayList;

public class Mundial {

    private ArrayList<Seleccion> selecciones;

    public Mundial() {
        selecciones = new ArrayList<>();
    }

    public void agregarSeleccion(Seleccion seleccion) {
        selecciones.add(seleccion);
    }

    // Consigna 1
    public void consultarSeleccion(int posicion) {

        try {
            System.out.println(selecciones.get(posicion));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: esa posicion no existe.");
        } finally {
            System.out.println("Consulta finalizada.\n");
        }

    }

    // Consigna 2
    public void actualizarPuntos(int posicion, String puntosIngresados) {

        try {

            int puntos = Integer.parseInt(puntosIngresados);
            selecciones.get(posicion).setPuntos(puntos);

            System.out.println("Puntos actualizados correctamente.");

        } catch (NumberFormatException e) {

            System.out.println("Error: debe ingresar un numero.");

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Error: la seleccion no existe.");

        } finally {

            System.out.println("Actualizacion finalizada.\n");

        }

    }

    // Consigna 3
    public void mostrarDirectorTecnico(int posicion) {

        try {

            String dt = selecciones.get(posicion).getDirectorTecnico();

            System.out.println(dt.toString());

        } catch (NullPointerException e) {

            System.out.println("La seleccion no tiene Director Tecnico asignado.");

        } catch (IndexOutOfBoundsException e) {

            System.out.println("La posicion ingresada no existe.");

        } finally {

            System.out.println("Consulta del DT finalizada.\n");

        }

    }

}