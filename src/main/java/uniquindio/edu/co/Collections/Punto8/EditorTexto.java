package uniquindio.edu.co.Collections.Punto8;

import java.util.Iterator;
import java.util.Vector;

//Editor de texto que registra los cambios recientes en un Vector
//Permite deshacer el ultimo cambio.
public class EditorTexto {
    private Vector<String> historial = new Vector<>();

    public void realizarCambio(String cambio) {
        historial.add(cambio);
        System.out.println("Cambio realizado: " + cambio);
    }

    //Deshace el ultimo cambio realizado
    public String deshacer() {
        if (historial.isEmpty()) {
            return null;
        }
        return historial.remove(historial.size() - 1);
    }

    public void mostrarHistorial() {
        System.out.print("Historial: ");
        Iterator<String> iterador = historial.iterator();
        while (iterador.hasNext()) {
            System.out.print(iterador.next() + " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        editor.realizarCambio("Escribir 'Hola'");
        editor.realizarCambio("Cambiar a 'Hola mundo'");
        editor.realizarCambio("Poner en negrita");
        editor.mostrarHistorial();

        System.out.println("Deshacer -> " + editor.deshacer());
        System.out.println("Deshacer -> " + editor.deshacer());
        editor.mostrarHistorial();
    }
}