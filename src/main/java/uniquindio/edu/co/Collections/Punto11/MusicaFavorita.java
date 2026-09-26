package uniquindio.edu.co.Collections.Punto11;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Canciones favoritas usando LinkedHashSet:
//conserva el orden de insercion y no permite duplicados.
public class MusicaFavorita {
    private Set<String> favoritas = new LinkedHashSet<>();

    public boolean marcarFavorita(String cancion) {
        boolean agregada = favoritas.add(cancion);
        System.out.println("Marcar '" + cancion + "' -> " + (agregada ? "agregada" : "ya estaba en favoritas"));
        return agregada;
    }

    public void mostrarFavorita() {
        System.out.print("Favoritas (orden de insercion): ");
        Iterator<String> iterador = favoritas.iterator();
        while (iterador.hasNext()) {
            System.out.print(iterador.next() + " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MusicaFavorita listas = new MusicaFavorita();
        listas.marcarFavorita("Bohemian Rhapsody");
        listas.marcarFavorita("Crossing field");
        listas.marcarFavorita("Smooth Criminal");
        listas.marcarFavorita("Bohemian Rhapsody"); //duplicado
        listas.mostrarFavorita();
    }
}