public class Main{
    public static void main(String[] args) {

        Imprimible certificado = new Certificado("CERT-001", "Ana Torres");
        Imprimible acta = new ActaNotas("Desarrollo de Software", 9.2);
        Imprimible horario = new HorarioAcademico("2026-1", "Matutina");

        certificado.imprimir();
        System.out.println();

        acta.imprimir();
        System.out.println();

        horario.imprimir();
    }
}
