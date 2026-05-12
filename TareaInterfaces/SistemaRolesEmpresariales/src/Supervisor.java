public class Supervisor extends UsuarioEmpresa implements Autenticable, Reportable {

    public Supervisor(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return getUsuario().equals(usuario) && getClave().equals(clave);
    }

    @Override
    public void generarReporte() {
        System.out.println("El supervisor genera reportes de control y seguimiento.");
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Supervisor");
    }
}