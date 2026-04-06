public class HerramientaElectrica extends Herramienta {
    private int voltaje;

    public HerramientaElectrica(int codigo, String marca, int voltaje) {
        super(codigo, marca);
        this.voltaje = voltaje;
    }

    public void conectar() {
        System.out.println("Conectando a " + voltaje + "V");
    }

    @Override
    public void operar() {
        usar();
        conectar();
        System.out.println("Voltaje: " + voltaje);
        devolver();
    }
}