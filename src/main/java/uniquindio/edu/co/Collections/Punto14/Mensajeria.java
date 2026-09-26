package uniquindio.edu.co.Collections.Punto14;

import java.util.ArrayDeque;
import java.util.Deque;

//Historial de mensajes usando ArrayDeque.
//Agrega mensajes al final y recupera los ultimos 10 enviados.
public class Mensajeria {
    private final Deque<String> historial = new ArrayDeque<>();

    public void enviarMensaje(String mensaje) {
        historial.addLast(mensaje);
        System.out.println("Enviado: " + mensaje);
    }

    //Recupera los ultimos 10 mensajes enviados
    public String[] ultimosMensajes() {
        int cantidad = Math.min(10, historial.size());
        String[] ultimos = new String[cantidad];
        Deque<String> copia = new ArrayDeque<>(historial);
        int indice = 0;
        //Salta los mas antiguos y deja solo los ultimos `cantidad`
        int aSaltar = copia.size() - cantidad;
        while (aSaltar > 0) {
            copia.pollFirst();
            aSaltar--;
        }
        while (!copia.isEmpty()) {
            ultimos[indice] = copia.pollFirst();
            indice++;
        }
        return ultimos;
    }

    public static void main(String[] args) {
        Mensajeria app = new Mensajeria();
        for (int i = 1; i <= 15; i++) {
            app.enviarMensaje("Mensaje " + i);
        }

        System.out.println("\nUltimos 10 mensajes:");
        for (String m : app.ultimosMensajes()) {
            System.out.println(m);
        }
    }
}