package uniquindio.edu.co.Generics.Avanzado.Punto14;

import java.util.ArrayList;
import java.util.List;

public class Ordenador<T extends Comparable<T>> {

    public void ordenar(List<T> lista) {

        for (int i = 0; i < lista.size() - 1; i++) {

            for (int j = 0; j < lista.size() - 1 - i; j++) {

                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {

                    T temporal = lista.get(j);

                    lista.set(j, lista.get(j + 1));

                    lista.set(j + 1, temporal);
                }
            }
        }
    }


    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(40);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);

        Ordenador<Integer> ordenador = new Ordenador<>();

        ordenador.ordenar(numeros);

        System.out.println(numeros);
    }
}
