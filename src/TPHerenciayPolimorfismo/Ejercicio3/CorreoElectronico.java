package TPHerenciayPolimorfismo.Ejercicio3;

public class CorreoElectronico extends CanalNotificacion implements Personalizable {
    private String direccionCorreo;

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando correo a " + direccionCorreo + " con el mensaje: " + mensaje);
    }

    @Override
    public String obtenerInformacion() {
        return "Correo Electrónico - Usuario: " + usuario + ", Dirección: " + direccionCorreo + ", Mensaje: " + mensaje;
    }

    @Override
    public void personalizarMensaje() {
        mensaje = "Personalizado: " + mensaje;
    }
}