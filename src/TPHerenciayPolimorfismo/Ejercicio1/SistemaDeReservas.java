package TPHerenciayPolimorfismo.Ejercicio1;
import java.util.Scanner;

public class SistemaDeReservas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservas reservas = new Reservas(10);

        while (true) {
            System.out.println("Ingrese el tipo de vuelo (1: Regular, 2: Charter, 0: Salir): ");
            int tipoVuelo = scanner.nextInt();
            if (tipoVuelo == 0) {
                break;
            }

            System.out.println("Ingrese el número de vuelo: ");
            int numeroVuelo = scanner.nextInt();
            System.out.println("Ingrese el origen: ");
            String origen = scanner.next();
            System.out.println("Ingrese el destino: ");
            String destino = scanner.next();
            System.out.println("Ingrese la fecha (YYYY-MM-DD): ");
            String fecha = scanner.next();

            if (tipoVuelo == 1) {
                System.out.println("Ingrese el número de asientos: ");
                int numeroAsientos = scanner.nextInt();
                System.out.println("Ingrese el precio base por asiento: ");
                double precioBase = scanner.nextDouble();
                VueloRegular vueloRegular = new VueloRegular(numeroVuelo, origen, destino, fecha, numeroAsientos, precioBase);
                reservas.agregarVuelo(vueloRegular);
            } else if (tipoVuelo == 2) {
                System.out.println("Ingrese el precio total: ");
                double precioTotal = scanner.nextDouble();
                VueloCharter vueloCharter = new VueloCharter(numeroVuelo, origen, destino, fecha, precioTotal);
                reservas.agregarVuelo(vueloCharter);
            } else {
                System.out.println("Tipo de vuelo no válido.");
            }
        }

        System.out.println("\nDetalles de vuelos antes de aplicar promociones:");
        reservas.mostrarDetallesVuelos();

        reservas.aplicarPromociones();

        System.out.println("\nDetalles de vuelos después de aplicar promociones:");
        reservas.mostrarDetallesVuelos();

        System.out.println("\nTotal de reservas: " + reservas.calcularTotalReservas());

        scanner.close();
    }
}
