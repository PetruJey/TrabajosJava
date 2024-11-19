package TPHerenciayPolimorfismo.Ejercicio2;
import java.util.Scanner;

public class SistemaDePagos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pagos pagos = new Pagos();

        while (true) {
            System.out.println("Ingrese el tipo de metodo de pago (1: Tarjeta de Credito, 2: PayPal, 0: Salir): ");
            int tipoMetodo = scanner.nextInt();
            if (tipoMetodo == 0) {
                break;
            }

            System.out.println("Ingrese el titular: ");
            String titular = scanner.next();
            System.out.println("Ingrese el numero: ");
            int numero = scanner.nextInt();

            if (tipoMetodo == 1) {
                System.out.println("Ingrese la fecha de expiacion (MM/AA): ");
                String fechaExpiracion = scanner.next();
                System.out.println("Ingrese el codigo de seguridad: ");
                int codigoSeguridad = scanner.nextInt();
                TarjetaCredito tarjeta = new TarjetaCredito(titular, numero, fechaExpiracion, codigoSeguridad);
                pagos.agregarMetodo(tarjeta);
            } else if (tipoMetodo == 2) {
                System.out.println("Ingrese el correo electronico: ");
                String correoElectronico = scanner.next();
                PayPal paypal = new PayPal(titular, numero, correoElectronico);
                pagos.agregarMetodo(paypal);
            } else {
                System.out.println("Tipo de metodo de pago no valido.");
            }
        }

        System.out.println("\nInformacion de los metodos de pago:");
        pagos.mostrarPagos();

        System.out.println("\nRealizando pagos:");
        pagos.realizarPagos();

        System.out.println("\nCancelando pagos:");
        pagos.cancelarPagos();

        scanner.close();
    }
}
