public class Pago {
    protected int idPago;
    protected double monto;
    protected String metodo;
    protected String estado;

    public Pago(int idPago, double monto, String metodo, String estado) {
        this.idPago = idPago;
        this.monto = monto;
        this.metodo = metodo;
        this.estado = estado;
    }
}