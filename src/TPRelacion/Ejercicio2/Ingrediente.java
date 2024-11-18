package TPRelacion.Ejercicio2;

public class Ingrediente {
    private String nombre;
    private double cantidad;
    private String unidadDemedida;

    public Ingrediente(String nombre, double cantidad, String unidadDemedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadDemedida = unidadDemedida;
    }

    public String mostrarInfo() {
        return nombre + ": " + cantidad + " " + unidadDemedida;
    }
}
