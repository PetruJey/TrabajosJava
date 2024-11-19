package TPHerenciayPolimorfismo.Ejercicio2;

public class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private int codigoSeguridad;

    public TarjetaCredito(String titular, int numero, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pagando con tarjeta de credito: " + titular);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Pago cancelado con tarjeta de credito.");
    }

    @Override
    public String getInformacion() {
        return "Tarjeta de Credito: " + titular + ", Numero: " + numero + ", Fecha de Expiracion: " + fechaExpiracion;
    }
}
