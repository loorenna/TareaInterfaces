public class PagoEfectivo implements Pagable {

    @Override
    public void procesarPago(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor a cero.");
            return;
        }

        System.out.println("Pago en efectivo realizado correctamente.");
        System.out.println("Monto pagado: $" + monto);
    }
}