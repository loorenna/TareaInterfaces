public class Main {
    public static void main(String[] args) {

        Pagable efectivo = new PagoEfectivo();
        Pagable tarjeta = new PagoTarjeta(0.05);
        Pagable transferencia = new Transferencia(0.02);

        efectivo.procesarPago(100);
        System.out.println();

        tarjeta.procesarPago(200);
        System.out.println();

        transferencia.procesarPago(300);
        System.out.println();

        efectivo.procesarPago(-50);
    }
}
