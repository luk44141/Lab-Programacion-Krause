public class Gato extends Animal {

    public Gato(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    public void maullar() {
        System.out.println(nombre + ": Gato");
    }

    @Override
    public void atender() {
        super.atender();
        maullar();
    }
}