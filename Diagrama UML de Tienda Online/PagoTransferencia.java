public class PagoTransferencia extends Pago {

    public PagoTransferencia(int idPago, double monto, String estado) {
        super(idPago, monto, "Transferencia", estado);
    }
}