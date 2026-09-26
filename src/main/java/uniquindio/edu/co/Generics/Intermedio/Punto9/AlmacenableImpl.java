package uniquindio.edu.co.Generics.Intermedio.Punto9;

import java.util.ArrayList;

interface Almacenable<T extends Comparable<T>> {

    // Guarda un elemento.
    void guardar(T item);


    // Devuelve el elemento más grande almacenado.
    T maximo();
}

public class AlmacenableImpl<T extends Comparable<T>>
        implements Almacenable<T> {

    private ArrayList<T> elementos;

    public AlmacenableImpl() {
        elementos = new ArrayList<>();
    }


    // Agrega un elemento a la lista.
    @Override
    public void guardar(T item) {
        elementos.add(item);
    }


    // Busca y devuelve el elemento mayor de la lista.
    @Override
    public T maximo() {

        T mayor = elementos.get(0);

        for (T elemento : elementos) {

            if (elemento.compareTo(mayor) > 0) {
                mayor = elemento;
            }
        }

        return mayor;
    }

    public static void main(String[] args) {

        AlmacenableImpl<Integer> numeros = new AlmacenableImpl<>();

        numeros.guardar(10);
        numeros.guardar(50);
        numeros.guardar(20);
        numeros.guardar(80);
        numeros.guardar(30);

        System.out.println("Mayor: " + numeros.maximo());
    }
}