public abstract class UsuarioEmpresa {

    private String nombre;
    private String usuario;
    private String clave;

    public UsuarioEmpresa(String nombre, String usuario, String clave) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public abstract void mostrarRol();
}