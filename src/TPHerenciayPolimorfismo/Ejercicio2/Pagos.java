package TPHerenciayPolimorfismo.Ejercicio2;
import java.util.ArrayList;

public class Pagos {
    private ArrayList<MetodoPago> metodosPagos;

    public Pagos() {
        metodosPagos = new ArrayList<>();
    }

    public void agregarMetodo(MetodoPago metodo) {
        metodosPagos.add(metodo);
    }

    public void realizarPagos() {
        for (MetodoPago metodo : metodosPagos) {
            metodo.realizarPago();
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodo : metodosPagos) {
            if (metodo instanceof Cancelable) {
                ((Cancelable) metodo).cancelarPago();
            }
        }
    }

    public void mostrarPagos() {
        for (MetodoPago metodo : metodosPagos) {
            System.out.println(metodo.getInformacion());
        }
    }
}
