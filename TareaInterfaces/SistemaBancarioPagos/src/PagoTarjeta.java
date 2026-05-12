public class PagoTarjeta implements Pagable {

    private double comision;

    public PagoTarjeta(double comision) {
        this.comision = comision;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor a cero.");
            return;
        }

        double valorComision = monto * comision;
        double total = monto + valorComision;

        System.out.println("Pago con tarjeta realizado correctamente.");
        System.out.println("Monto base: $" + monto);
        System.out.println("Comisión: $" + valorComision);
        System.out.println("Total a pagar: $" + total);
    }
}