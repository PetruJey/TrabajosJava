package TPRelacion.Ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    private ArrayList<Plato> platosMenu;
    private Scanner scanner;

    public MenuRestaurant() {
        platosMenu = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void agregarPlato() {
        System.out.print("Ingrese el nombre del plato: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("¿Es bebida? true(verdadero)/false(falso): ");
        boolean esBebida = scanner.nextBoolean();
        scanner.nextLine();

        Plato plato = new Plato(nombre, precio, esBebida);

        if (!esBebida) {
            while (true) {
                System.out.print("Ingrese el nombre del ingrediente (o 'fin' para terminar): ");
                String nombreIngrediente = scanner.nextLine();
                if (nombreIngrediente.equalsIgnoreCase("fin") && !plato.isEsBebida()) {
                    break;
                }
                System.out.print("Ingrese la cantidad: ");
                double cantidad = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Ingrese la unidad de medida: ");
                String unidadMedida = scanner.nextLine();
                plato.agregarIngrediente(new Ingrediente(nombreIngrediente, cantidad, unidadMedida));
            }
        }

        platosMenu.add(plato);
    }

    public void mostrarMenu() {
        for (Plato plato : platosMenu) {
            System.out.println(plato.mostrarInfo());
        }
    }

    public static void main(String[] args) {
        MenuRestaurant menu = new MenuRestaurant();
        System.out.print("¿Cuántos platos desea ingresar? ");
        int n = menu.scanner.nextInt();
        menu.scanner.nextLine();

        for (int i = 0; i < n; i++) {
            menu.agregarPlato();
        }

        menu.mostrarMenu();
        menu.scanner.close();
    }
}
