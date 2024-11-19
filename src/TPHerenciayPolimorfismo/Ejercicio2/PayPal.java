package TPHerenciayPolimorfismo.Ejercicio2;

public class PayPal extends MetodoPago {
    private String correoElectronico;

    public PayPal(String titular, int numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pagando con PayPal: " + titular);
    }

    @Override
    public String getInformacion() {
        return "PayPal: " + titular + ", Correo Electronico: " + correoElectronico;
    }
}
