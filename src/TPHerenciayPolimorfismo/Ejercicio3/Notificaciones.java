package TPHerenciayPolimorfismo.Ejercicio3;
import java.util.ArrayList;

public class Notificaciones {
    private ArrayList<CanalNotificacion> canales;

    public Notificaciones() {
        canales = new ArrayList<>();
    }

    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
        }
    }

    public void personalizarMensajes() {
        for (CanalNotificacion canal : canales) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje();
            }
        }
    }

    public void mostrarInformacionCanales() {
        System.out.println("Información de los canales de notificación:");
        for (CanalNotificacion canal : canales) {
            System.out.println(canal.obtenerInformacion());
        }
    }
}