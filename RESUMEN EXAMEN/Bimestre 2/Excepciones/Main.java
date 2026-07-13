public static void main(String[] args) {

Colectivo c1 = new Colectivo("Linea 1", 2, 0, 100);
Colectivo c2 = new Colectivo("Linea 2", 1, 0, 50);
Colectivo c3 = new Colectivo("Linea 3", 3, 0, 80);

Pasajero p1 = new Pasajero("Ana", "general", 200);
Pasajero p2 = new Pasajero("Bruno", "estudiante", 60);
Pasajero p3 = new Pasajero("Caro", "general", 30);
Pasajero p4 = new Pasajero("Dani", "jubilado", 150);

try {
    p1.subirAlColectivo(c1);
    System.out.println("Ascenso OK p1");
    System.out.println(p1);
    System.out.println(c1);
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
try {
    p2.subirAlColectivo(c1);
    System.out.println("Ascenso OK p2 estudiante");
    System.out.println(p2);
    System.out.println(c1);
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
try {
    p3.subirAlColectivo(c2);
    System.out.println("Ascenso OK p3");
    System.out.println(p3);
    System.out.println(c2);
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
try {
    p4.subirAlColectivo(c2);
    System.out.println("Ascenso OK p4");
    System.out.println(p4);
    System.out.println(c2);
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
Pasajero p5 = new Pasajero("Ema", "estudiante", 20);
try {
    p5.subirAlColectivo(c3);
    System.out.println("Ascenso OK p5");
    System.out.println(p5);
    System.out.println(c3);
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
try {
    p4.subirAlColectivo(c3);
    System.out.println("Ascenso OK jubilado");
    System.out.println(p4);
    System.out.println(c3);
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
}
