import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cajero cajero = new Cajero("Ana López", "cajero", "1234");
        Administrador administrador = new Administrador("Carlos Pérez", "admin", "admin123");
        Supervisor supervisor = new Supervisor("María Torres", "supervisor", "super123");

        System.out.println("===== SISTEMA DE ROLES EMPRESARIALES =====");
        System.out.println("1. Cajero");
        System.out.println("2. Administrador");
        System.out.println("3. Supervisor");
        System.out.print("Seleccione un rol: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        UsuarioEmpresa usuarioSeleccionado = null;

        switch (opcion) {
            case 1:
                usuarioSeleccionado = cajero;
                break;
            case 2:
                usuarioSeleccionado = administrador;
                break;
            case 3:
                usuarioSeleccionado = supervisor;
                break;
            default:
                System.out.println("Opción inválida.");
                scanner.close();
                return;
        }

        System.out.print("Ingrese usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese clave: ");
        String clave = scanner.nextLine();

        Autenticable autenticable = (Autenticable) usuarioSeleccionado;

        if (autenticable.iniciarSesion(usuario, clave)) {
            System.out.println("\nInicio de sesión exitoso.");
            usuarioSeleccionado.mostrarRol();
            System.out.println("Nombre: " + usuarioSeleccionado.getNombre());

            if (usuarioSeleccionado instanceof Gestionable) {
                Gestionable gestionable = (Gestionable) usuarioSeleccionado;
                gestionable.gestionarDatos();
            }

            if (usuarioSeleccionado instanceof Reportable) {
                Reportable reportable = (Reportable) usuarioSeleccionado;
                reportable.generarReporte();
            }

        } else {
            System.out.println("Usuario o clave incorrectos.");
        }

        scanner.close();
    }
}