package uniquindio.edu.co.Generics.Enunciado.Enunciado8;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaTareas<T extends Comparable<T>>
        implements Iterable<T> {

    private ArrayList<T> lista;

    public ListaTareas() {
        lista = new ArrayList<>();
    }


    // Agrega un elemento a la lista.
    public void agregar(T elemento) {
        lista.add(elemento);
    }



    // Devuelve un iterador que recorre la lista normalmente.
    @Override
    public Iterator<T> iterator() {

        return lista.iterator();
    }



    // Devuelve un iterador que recorre la lista de atrás hacia adelante.
    public Iterator<T> iteratorInverso() {

        return new IteratorInverso();
    }


    private class IteratorInverso implements Iterator<T> {

        private int indice;

        public IteratorInverso() {
            indice = lista.size() - 1;
        }



        // Indica si quedan elementos por recorrer.
        @Override
        public boolean hasNext() {

            return indice >= 0;
        }



        // Devuelve el siguiente elemento recorriendo hacia atrás.
        @Override
        public T next() {

            T elemento = lista.get(indice);

            indice--;

            return elemento;
        }
    }



    // Devuelve los elementos que están dentro del rango indicado.
    public ArrayList<T> entre(T min, T max) {

        ArrayList<T> resultado = new ArrayList<>();

        Iterator<T> iterator = iteratorInverso();

        while (iterator.hasNext()) {

            T elemento = iterator.next();

            if (elemento.compareTo(min) >= 0 &&
                    elemento.compareTo(max) <= 0) {

                resultado.add(elemento);
            }
        }

        return resultado;
    }


    public static void main(String[] args) {

        ListaTareas<Integer> tareas = new ListaTareas<>();

        tareas.agregar(10);
        tareas.agregar(20);
        tareas.agregar(30);
        tareas.agregar(40);
        tareas.agregar(50);


        System.out.println("Orden normal:");

        Iterator<Integer> normal = tareas.iterator();

        while (normal.hasNext()) {

            System.out.println(normal.next());
        }


        System.out.println("\nOrden inverso:");

        Iterator<Integer> inverso = tareas.iteratorInverso();

        while (inverso.hasNext()) {

            System.out.println(inverso.next());
        }


        System.out.println("\nEntre 20 y 40:");

        System.out.println(tareas.entre(20, 40));
    }
}