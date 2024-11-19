package TPHerenciayPolimorfismo.Ejercicio3;

public class MensajeTexto extends CanalNotificacion implements Personalizable {
    private String numeroTelefono;

    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando mensaje a " + numeroTelefono + " con el mensaje: " + mensaje);
    }

    @Override
    public String obtenerInformacion() {
        return "Mensaje de Texto - Usuario: " + usuario + ", Número: " + numeroTelefono + ", Mensaje: " + mensaje;
    }

    @Override
    public void personalizarMensaje() {
        mensaje = "Personalizado: " + mensaje;
    }
}