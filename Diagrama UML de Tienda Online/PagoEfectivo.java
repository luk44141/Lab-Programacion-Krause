public class PagoEfectivo extends Pago {

    public PagoEfectivo(int idPago, double monto, String estado) {
        super(idPago, monto, "Efectivo", estado);
    }
}