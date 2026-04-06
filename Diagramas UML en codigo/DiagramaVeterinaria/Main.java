public class Main {
    public static void main(String[] args) {

        Veterinario v1 = new Veterinario("Carlos");
        Veterinario v2 = new Veterinario("Ana");
        Veterinario v3 = new Veterinario("Pedro");

        Animal a1 = new Perro("Firulais", "2020");
        Animal a2 = new Gato("Michi", "2021");
        Animal a3 = new Perro("Rex", "2019");
        Animal a4 = new Gato("Luna", "2022");
        Animal a5 = new Perro("Rocky", "2018");


        v1.agregarAnimal(a1); 
        v1.agregarAnimal(a2);
        v1.agregarAnimal(a3);

        v2.agregarAnimal(a1);
        v2.agregarAnimal(a4);
        v2.agregarAnimal(a5);

        v3.agregarAnimal(a1); 
        v3.agregarAnimal(a2);
        v3.agregarAnimal(a3);

        v1.atenderAnimales();
        v2.atenderAnimales();
        v3.atenderAnimales();
    }
}