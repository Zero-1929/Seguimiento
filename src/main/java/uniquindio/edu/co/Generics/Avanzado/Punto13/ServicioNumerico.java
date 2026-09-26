package uniquindio.edu.co.Generics.Avanzado.Punto13;

import java.util.ArrayList;
import java.util.List;

interface Servicio<T extends Number & Comparable<T>> {


    // Devuelve el menor elemento de una lista.
    T minimo(List<T> lista);


    // Devuelve el mayor elemento de una lista.
    T maximo(List<T> lista);
}

public class ServicioNumerico<T extends Number & Comparable<T>>
        implements Servicio<T> {


    // Busca y devuelve el menor elemento de la lista.
    @Override
    public T minimo(List<T> lista) {

        T menor = lista.get(0);

        for (T numero : lista) {

            if (numero.compareTo(menor) < 0) {
                menor = numero;
            }
        }

        return menor;
    }


    // Busca y devuelve el mayor elemento de la lista.
    @Override
    public T maximo(List<T> lista) {

        T mayor = lista.get(0);

        for (T numero : lista) {

            if (numero.compareTo(mayor) > 0) {
                mayor = numero;
            }
        }

        return mayor;
    }

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(50);
        numeros.add(20);
        numeros.add(5);
        numeros.add(30);

        ServicioNumerico<Integer> servicio = new ServicioNumerico<>();

        System.out.println("Mínimo: " + servicio.minimo(numeros));
        System.out.println("Máximo: " + servicio.maximo(numeros));
    }
}