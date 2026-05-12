public class Transferencia implements Pagable {

    private double comision;

    public Transferencia(double comision) {
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

        System.out.println("Transferencia bancaria realizada correctamente.");
        System.out.println("Monto base: $" + monto);
        System.out.println("Comisión: $" + valorComision);
        System.out.println("Total transferido: $" + total);
    }
}