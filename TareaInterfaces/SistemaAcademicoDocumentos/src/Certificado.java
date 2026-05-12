public class Certificado implements Imprimible {

    private String numeroDocumento;
    private String nombreEstudiante;

    public Certificado(String numeroDocumento, String nombreEstudiante) {
        this.numeroDocumento = numeroDocumento;
        this.nombreEstudiante = nombreEstudiante;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo certificado académico");
        System.out.println("Número de documento: " + numeroDocumento);
        System.out.println("Estudiante: " + nombreEstudiante);
    }
}