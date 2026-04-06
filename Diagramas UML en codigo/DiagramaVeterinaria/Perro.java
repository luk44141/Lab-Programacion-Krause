public class Perro extends Animal {

    public Perro(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    public void ladrar() {
        System.out.println(nombre + ": Perro");
    }

    @Override
    public void atender() {
        super.atender();
        ladrar();
    }
}