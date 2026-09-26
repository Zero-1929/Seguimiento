package uniquindio.edu.co.Generics.Enunciado.Enunciado6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class PilaGenerica<T> {

    private LinkedList<T> pila;

    public PilaGenerica() {
        pila = new LinkedList<>();
    }

    public void agregar(T elemento) {
        pila.add(elemento);
    }


    public List<T> extraerSi(Predicate<T> p, int max) {

        List<T> resultado = new ArrayList<>();

        Iterator<T> iterator = pila.iterator();

        while (iterator.hasNext() && resultado.size() < max) {

            T elemento = iterator.next();

            if (p.test(elemento)) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }


    public static void main(String[] args) {

        PilaGenerica<Integer> pila = new PilaGenerica<>();

        pila.agregar(10);
        pila.agregar(20);
        pila.agregar(15);
        pila.agregar(30);
        pila.agregar(5);

        List<Integer> resultado =
                pila.extraerSi(numero -> numero > 10, 2);

        System.out.println(resultado);
    }
}
