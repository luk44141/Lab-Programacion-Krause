import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Seleccion {

    private ArrayList<Jugador> jugadores;

    public Seleccion() {
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador j) {
        jugadores.add(j);
    }

    public void eliminarJugador(String nombre) {

        for (int i = 0; i < jugadores.size(); i++) {

            if (jugadores.get(i).getNombre()
                    .equalsIgnoreCase(nombre)) {

                jugadores.remove(i);
                return;
            }
        }
    }

    public void mostrarConvocados() {

        for (Jugador j : jugadores) {

            if (j.isConvocado()) {
                System.out.println(j);
            }
        }
    }

    public void mostrarNoConvocados() {

        for (Jugador j : jugadores) {

            if (!j.isConvocado()) {
                System.out.println(j);
            }
        }
    }

    public void buscarPorPosicion(String posicion) {

        for (Jugador j : jugadores) {

            if (j.getPosicion()
                    .equalsIgnoreCase(posicion)) {

                System.out.println(j);
            }
        }
    }

    public void buscarPorEquipo(String equipo) {

        for (Jugador j : jugadores) {

            if (j.getEquipo()
                    .equalsIgnoreCase(equipo)) {

                System.out.println(j);
            }
        }
    }

    public Jugador jugadorMasJoven() {

        Jugador menor = jugadores.get(0);

        for (Jugador j : jugadores) {

            if (j.getEdad() < menor.getEdad()) {
                menor = j;
            }
        }

        return menor;
    }

    public Jugador jugadorMasVeterano() {

        Jugador mayor = jugadores.get(0);

        for (Jugador j : jugadores) {

            if (j.getEdad() > mayor.getEdad()) {
                mayor = j;
            }
        }

        return mayor;
    }

    public double promedioEdad() {

        int suma = 0;

        for (Jugador j : jugadores) {
            suma += j.getEdad();
        }

        return (double) suma / jugadores.size();
    }

    public void contarPorPosicion() {

        int arquero = 0;
        int defensor = 0;
        int mediocampista = 0;
        int delantero = 0;

        for (Jugador j : jugadores) {

            switch (j.getPosicion().toLowerCase()) {

                case "arquero":
                    arquero++;
                    break;

                case "defensor":
                    defensor++;
                    break;

                case "mediocampista":
                    mediocampista++;
                    break;

                case "delantero":
                    delantero++;
                    break;
            }
        }

        System.out.println("Arqueros: " + arquero);
        System.out.println("Defensores: " + defensor);
        System.out.println("Mediocampistas: " + mediocampista);
        System.out.println("Delanteros: " + delantero);
    }

    public boolean estaConvocado(String nombre) {

        for (Jugador j : jugadores) {

            if (j.getNombre()
                    .equalsIgnoreCase(nombre)) {

                return j.isConvocado();
            }
        }

        return false;
    }

    public void ordenarPorEdad() {

        Collections.sort(
                jugadores,
                Comparator.comparingInt(Jugador::getEdad)
        );
    }
}