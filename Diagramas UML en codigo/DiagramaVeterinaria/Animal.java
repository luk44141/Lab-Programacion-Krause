public class Animal {
    protected String nombre;
    protected String fechaNacimiento;

    public Animal(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void atender() {
        System.out.println("Animal: " + nombre + " | Nacimiento: " + fechaNacimiento);
    }
}