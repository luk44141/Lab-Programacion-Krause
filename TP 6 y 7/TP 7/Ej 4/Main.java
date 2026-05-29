public class Main {

    public static void main(String[] args) {

        String[][] datos = {
            // Argentina 
{"Emiliano Martinez", "Arquero", "33", "Aston Villa", "true"}, 
{"Cristian Romero", "Defensor", "28", "Tottenham", "true"}, 
{"Nicolas Otamendi", "Defensor", "38", "Benfica", "true"}, 
{"Nahuel Molina", "Defensor", "28", "Atletico Madrid", "true"}, 
{"Enzo Fernandez", "Mediocampista", "25", "Chelsea", "true"}, 
{"Rodrigo De Paul", "Mediocampista", "32", "Inter Miami", "true"}, 
{"Alexis Mac Allister", "Mediocampista", "27", "Liverpool", "true"}, 
{"Lionel Messi", "Delantero", "39", "Inter Miami", "true"}, 
{"Julian Alvarez", "Delantero", "26", "Atletico Madrid", "true"}, 
{"Lautaro Martinez", "Delantero", "29", "Inter Milan", "true"}, 
{"Paulo Dybala", "Delantero", "33", "Roma", "false"}, 
// Francia 
{"Mike Maignan", "Arquero", "31", "Milan", "true"}, 
{"William Saliba", "Defensor", "25", "Arsenal", "true"}, 
{"Theo Hernandez", "Defensor", "29", "Milan", "true"}, 
{"Jules Kounde", "Defensor", "28", "Barcelona", "true"}, 
{"Aurelien Tchouameni", "Mediocampista", "26", "Real Madrid", "true"}, 
{"Eduardo Camavinga", "Mediocampista", "24", "Real Madrid", "true"}, 
{"Adrien Rabiot", "Mediocampista", "31", "Marseille", "true"}, 
{"Kylian Mbappe", "Delantero", "28", "Real Madrid", "true"}, 
{"Ousmane Dembele", "Delantero", "29", "PSG", "true"}, 
{"Marcus Thuram", "Delantero", "29", "Inter Milan", "true"}, 
{"Antoine Griezmann", "Delantero", "35", "Atletico Madrid", "false"} 

        };

        Jugador[] plantel = new Jugador[datos.length];

        for (int i = 0; i < datos.length; i++) {

            String nombre = datos[i][0];
            String posicion = datos[i][1];
            int edad = Integer.parseInt(datos[i][2]);
            String equipo = datos[i][3];
            boolean convocado = Boolean.parseBoolean(datos[i][4]);

            plantel[i] = new Jugador(
                    nombre,
                    posicion,
                    edad,
                    equipo,
                    convocado
            );
        }

        Seleccion seleccion = new Seleccion();

        for (Jugador j : plantel) {
            seleccion.agregarJugador(j);
        }

        System.out.println("=== CONVOCADOS ===");
        seleccion.mostrarConvocados();

        System.out.println("\n=== NO CONVOCADOS ===");
        seleccion.mostrarNoConvocados();

        System.out.println("\n=== DEFENSORES ===");
        seleccion.buscarPorPosicion("Defensor");

        System.out.println("\n=== JUGADORES DEL REAL MADRID ===");
        seleccion.buscarPorEquipo("Real Madrid");

        System.out.println("\n=== MAS JOVEN ===");
        System.out.println(seleccion.jugadorMasJoven());

        System.out.println("\n=== MAS VETERANO ===");
        System.out.println(seleccion.jugadorMasVeterano());

        System.out.println("\n=== PROMEDIO DE EDAD ===");
        System.out.println(seleccion.promedioEdad());

        System.out.println("\n=== CANTIDAD POR POSICION ===");
        seleccion.contarPorPosicion();

        System.out.println("\n=== ESTA CONVOCADO MESSI? ===");
        System.out.println(seleccion.estaConvocado("Lionel Messi"));

        System.out.println("\n=== ORDENADOS POR EDAD ===");
        seleccion.ordenarPorEdad();
        seleccion.mostrarConvocados();
    }
}