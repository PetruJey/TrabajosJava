package TPHerenciayPolimorfismo.Ejercicio1;

public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioBase;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBase) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecio() {
        return precioBase * numeroAsientos;
    }

    @Override
    public void aplicarPromocion() {
        precioBase *= 0.9;
    }
}
