public class Administrador extends UsuarioEmpresa implements Autenticable, Reportable, Gestionable {

    public Administrador(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return getUsuario().equals(usuario) && getClave().equals(clave);
    }

    @Override
    public void generarReporte() {
        System.out.println("El administrador genera reportes generales de la empresa.");
    }

    @Override
    public void gestionarDatos() {
        System.out.println("El administrador gestiona usuarios, productos y datos importantes.");
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Administrador");
    }
}