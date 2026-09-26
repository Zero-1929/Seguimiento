package uniquindio.edu.co.Generics.Intermedio.Punto8;

public class Comparador<T extends Comparable<T>> {


    // Devuelve el mayor de los dos valores recibidos.
    public T mayor(T a, T b) {

        if (a.compareTo(b) > 0) {
            return a;
        }

        return b;
    }


    public static void main(String[] args) {

        Comparador<Integer> comparadorNumeros = new Comparador<>();

        System.out.println(comparadorNumeros.mayor(10, 20));


        Comparador<String> comparadorTexto = new Comparador<>();

        System.out.println(comparadorTexto.mayor("Pedro", "Juan"));
    }
}
