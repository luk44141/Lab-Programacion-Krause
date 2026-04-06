public class Main {
    public static void main(String[] args) {

        Herramienta[] herramientas = new Herramienta[5];

        herramientas[0] = new HerramientaElectrica(1, "Bosch", 220);
        herramientas[1] = new HerramientaElectrica(2, "Makita", 220);
        herramientas[2] = new HerramientaManual(3, "Stanley", "Goma");
        herramientas[3] = new HerramientaManual(4, "Philips", "Plástico");
        herramientas[4] = new HerramientaManual(5, "Tramontina", "Metal");

        for (int i = 0; i < herramientas.length; i++) {
            System.out.println("\n--- HERRAMIENTA " + (i + 1) + " ---");
            herramientas[i].operar();
        }
    }
}