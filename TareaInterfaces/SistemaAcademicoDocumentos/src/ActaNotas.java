public class ActaNotas implements Imprimible {

    private String carrera;
    private double promedio;

    public ActaNotas(String carrera, double promedio) {
        this.carrera = carrera;
        this.promedio = promedio;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo acta de notas");
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio final: " + promedio);
    }
}