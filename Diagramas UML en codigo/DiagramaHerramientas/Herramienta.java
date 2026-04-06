public class Herramienta {
    protected int codigo;
    protected String marca;

    public Herramienta(int codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
    }

    public void usar() {
        System.out.println("Usando herramienta");
    }

    public void devolver() {
        System.out.println("Devolviendo herramienta");
    }

    public void operar() {
        usar();
        devolver();
    }
}