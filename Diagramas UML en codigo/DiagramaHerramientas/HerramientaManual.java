public class HerramientaManual extends Herramienta {
    private String tipoEmpuñadura;

    public HerramientaManual(int codigo, String marca, String tipoEmpuñadura) {
        super(codigo, marca);
        this.tipoEmpuñadura = tipoEmpuñadura;
    }

    @Override
    public void operar() {
        usar();
        System.out.println("Empuñadura: " + tipoEmpuñadura);
        devolver();
    }
}