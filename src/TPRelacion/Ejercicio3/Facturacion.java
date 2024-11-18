package TPRelacion.Ejercicio3;
import java.util.Scanner;

public class Facturacion {
    private static final String[][] articulos = {
            {"101", "Leche", "25"},
            {"102", "Gaseosa", "30"},
            {"103", "Fideos", "15"},
            {"104", "Arroz", "28"},
            {"105", "Vino", "120"},
            {"106", "Manteca", "20"},
            {"107", "Lavandina", "18"},
            {"108", "Detergente", "46"},
            {"109", "Jabón en Polvo", "96"},
            {"110", "Galletas", "60"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factura factura = new Factura();

        System.out.print("Ingrese la fecha de la factura: ");
        factura.setFechaFactura(scanner.nextLine());

        System.out.print("Ingrese el número de factura: ");
        factura.setNumeroFactura(scanner.nextLong());

        scanner.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        factura.setCliente(scanner.nextLine());

        while (true) {
            System.out.print("Ingrese el código del artículo a facturar: ");
            String codigo = scanner.nextLine();
            DetalleFactura detalle = new DetalleFactura();

            boolean encontrado = false;
            for (String[] articulo : articulos) {
                if (articulo[0].equals(codigo)) {
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();

                    detalle.setCodigoArticulo(articulo[0]);
                    detalle.setNombreArticulo(articulo[1]);
                    detalle.setPrecioUnitario(Double.parseDouble(articulo[2]));
                    detalle.setCantidad(cantidad);
                    detalle.calcularSubtotal();
                    factura.agregarDetalle(detalle);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("El código ingresado no existe, intente nuevamente.");
            }

            System.out.print("¿Desea agregar otro artículo? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Fecha de la factura: " + factura.getFechaFactura());
        System.out.println("Número de factura: " + factura.getNumeroFactura());
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println("\nCódigo Artículo | Nombre Artículo | Cantidad | Precio Unitario | Descuento | Subtotal");
        for (DetalleFactura detalle : factura.getDetallesFactura()) {
            System.out.printf("%s | %s | %d | %.2f | %.2f | %.2f\n",
                    detalle.getCodigoArticulo(),
                    detalle.getNombreArticulo(),
                    detalle.getCantidad(),
                    detalle.getPrecioUnitario(),
                    detalle.getDescuentoItem(),
                    detalle.getSubTotal());
        }
        System.out.printf("\nTotal de la factura: %.2f\n", factura.getTotalCalculadoFactura());
        scanner.close();
    }
}
