package TPRelacion.Ejercicio2;
import java.util.ArrayList;

public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public String mostrarInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Plato: " + nombreCompleto + ", Precio: " + precio + ", Es Bebida: " + esBebida + "\nIngredientes:\n");
        for (Ingrediente ing : ingredientes) {
            info.append(" - " + ing.mostrarInfo() + "\n");
        }
        return info.toString();
    }
}
