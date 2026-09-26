package uniquindio.edu.co.Generics.Basicos.punto4;

public class Intercambiar {

    public static <T> void intercambiar(T[] arreglo, int posicion1, int posicion2) {

        T temporal = arreglo[posicion1];

        arreglo[posicion1] = arreglo[posicion2];

        arreglo[posicion2] = temporal;
    }

    public static void main(String[] args) {

        Integer[] numeros = {10, 20, 30, 40};

        System.out.println("Antes:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        intercambiar(numeros, 0, 2);

        System.out.println("Después:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}