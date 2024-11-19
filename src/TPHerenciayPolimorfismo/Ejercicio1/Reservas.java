package TPHerenciayPolimorfismo.Ejercicio1;

public class Reservas {
    private Vuelo[] vuelos;
    private int totalVuelos;

    public Reservas(int capacidad) {
        this.vuelos = new Vuelo[capacidad];
        this.totalVuelos = 0;
    }

    public void agregarVuelo(Vuelo vuelo) {
        if (totalVuelos < vuelos.length) {
            vuelos[totalVuelos] = vuelo;
            totalVuelos++;
        } else {
            System.out.println("No se pueden agregar más vuelos.");
        }
    }

    public double calcularTotalReservas() {
        double total = 0;
        for (int i = 0; i < totalVuelos; i++) {
            total += vuelos[i].calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones() {
        for (int i = 0; i < totalVuelos; i++) {
            if (vuelos[i] instanceof Promocionable) {
                ((Promocionable) vuelos[i]).aplicarPromocion();
            }
        }
    }

    public void mostrarDetallesVuelos() {
        for (int i = 0; i < totalVuelos; i++) {
            System.out.println(vuelos[i].getDetalles() + " - Precio: " + vuelos[i].calcularPrecio());
        }
    }
}
