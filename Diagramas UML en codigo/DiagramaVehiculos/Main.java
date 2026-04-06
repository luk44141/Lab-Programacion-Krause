public class Main {
    public static void main(String[] args) {

        Vehiculo v1 = new Auto("AAA111", "Toyota");
        Vehiculo v2 = new Auto("BBB222", "Ford");
        Vehiculo v3 = new Auto("CCC333", "Chevrolet");
        Vehiculo v4 = new Auto("DDD444", "Peugeot");
        Vehiculo v5 = new Auto("EEE555", "Fiat");

        Vehiculo v6 = new Moto("FFF666", "Yamaha");
        Vehiculo v7 = new Moto("GGG777", "Honda");
        Vehiculo v8 = new Moto("HHH888", "Suzuki");
        Vehiculo v9 = new Moto("III999", "Kawasaki");
        Vehiculo v10 = new Moto("JJJ000", "Ducati");

        Vendedor vA = new Vendedor("Luca");
        Vendedor vB = new Vendedor("Ana");
        Vendedor vC = new Vendedor("Pedro");

        vA.agregarVehiculo(v1);
        vA.agregarVehiculo(v2);
        vA.agregarVehiculo(v6);

        vB.agregarVehiculo(v3);
        vB.agregarVehiculo(v4);
        vB.agregarVehiculo(v7);
        vB.agregarVehiculo(v8);

        vC.agregarVehiculo(v5);
        vC.agregarVehiculo(v9);
        vC.agregarVehiculo(v10);

        vA.mostrar();
        vB.mostrar();
        vC.mostrar();
    }
}