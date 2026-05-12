public class HorarioAcademico implements Imprimible {

    private String periodoAcademico;
    private String jornada;

    public HorarioAcademico(String periodoAcademico, String jornada) {
        this.periodoAcademico = periodoAcademico;
        this.jornada = jornada;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo horario académico");
        System.out.println("Período académico: " + periodoAcademico);
        System.out.println("Jornada: " + jornada);
    }
}
