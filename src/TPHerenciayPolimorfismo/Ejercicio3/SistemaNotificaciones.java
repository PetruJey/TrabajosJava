package TPHerenciayPolimorfismo.Ejercicio3;
import java.util.Scanner;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione el tipo de canal de notificación:");
            System.out.println("1. Correo Electrónico");
            System.out.println("2. Mensaje de Texto");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            if (opcion == 3) {
                break;
            }

            System.out.print("Ingrese el usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Ingrese el mensaje: ");
            String mensaje = scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese la dirección de correo electrónico: ");
                String direccionCorreo = scanner.nextLine();
                CorreoElectronico email = new CorreoElectronico(usuario, mensaje, direccionCorreo);
                notificaciones.agregarCanal(email);
            } else if (opcion == 2) {
                System.out.print("Ingrese el número de teléfono: ");
                String numeroTelefono = scanner.nextLine();
                MensajeTexto mensajeTexto = new MensajeTexto(usuario, mensaje, numeroTelefono);
                notificaciones.agregarCanal(mensajeTexto);
            } else {
                System.out.println("Opción no válida.");
            }
        }

        notificaciones.personalizarMensajes();
        notificaciones.enviarNotificaciones();
        notificaciones.mostrarInformacionCanales();

        scanner.close();
    }
}
