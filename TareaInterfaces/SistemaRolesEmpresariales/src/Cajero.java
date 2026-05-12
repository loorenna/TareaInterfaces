public class Cajero extends UsuarioEmpresa implements Autenticable, Gestionable {

    public Cajero(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return getUsuario().equals(usuario) && getClave().equals(clave);
    }

    @Override
    public void gestionarDatos() {
        System.out.println("El cajero gestiona datos de ventas y pagos de clientes.");
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Cajero");
    }
}