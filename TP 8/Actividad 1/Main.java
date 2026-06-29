import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Mundial mundial = new Mundial();

        DirectorTecnico dt1 = new DirectorTecnico("Lionel Scaloni", 48, "Argentina");
        DirectorTecnico dt2 = new DirectorTecnico("Didier Deschamps", 56, "Francia");

        try {

            Seleccion argentina = new Seleccion("Argentina", "America", 6, 26, "Clasificada", dt1);
            Seleccion francia = new Seleccion("Francia", "Europa", 4, 24, "Clasificada", dt2);
            Seleccion brasil = new Seleccion("Brasil", "America", 3, 10, "En competencia", null);

            mundial.agregarSeleccion(argentina);
            mundial.agregarSeleccion(francia);
            mundial.agregarSeleccion(brasil);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

        System.out.println("----- CONSIGNA 1 -----");
        System.out.print("Ingrese una posicion del ArrayList: ");
        int posicion = teclado.nextInt();

        mundial.consultarSeleccion(posicion);

        teclado.nextLine();

        System.out.println("----- CONSIGNA 2 -----");
        System.out.print("Ingrese la posicion de la seleccion: ");
        int pos = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Ingrese los nuevos puntos: ");
        String puntos = teclado.nextLine();

        mundial.actualizarPuntos(pos, puntos);

        System.out.println("----- CONSIGNA 3 -----");
        System.out.print("Ingrese la posicion para ver el Director Tecnico: ");
        int posDT = teclado.nextInt();

        mundial.mostrarDirectorTecnico(posDT);

        System.out.println("----- CONSIGNA 5 -----");

        try {

            Seleccion brasil = new Seleccion("Brasil", "America", 3, 10, "En competencia", null);

            brasil.disputarPartido();

        } catch (JugadoresInsuficientesException e) {

            System.out.println(e.getMessage());

        }

        teclado.close();

    }

}