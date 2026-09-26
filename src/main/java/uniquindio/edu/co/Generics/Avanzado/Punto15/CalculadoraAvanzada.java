package uniquindio.edu.co.Generics.Avanzado.Punto15;

public class CalculadoraAvanzada<T extends Number & Comparable<T>> {


    // Suma dos valores y devuelve el resultado como double.
    public double sumar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }


    // Resta el segundo valor al primero.
    public double restar(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }


    // Devuelve el mayor de los dos valores.
    public T maximo(T a, T b) {

        if (a.compareTo(b) > 0) {
            return a;
        }

        return b;
    }


    // Devuelve el menor de los dos valores.
    public T minimo(T a, T b) {

        if (a.compareTo(b) < 0) {
            return a;
        }

        return b;
    }

    public static void main(String[] args) {

        CalculadoraAvanzada<Integer> calculadora =
                new CalculadoraAvanzada<>();

        System.out.println("Suma: " + calculadora.sumar(10, 20));

        System.out.println("Resta: " + calculadora.restar(20, 10));

        System.out.println("Máximo: " + calculadora.maximo(10, 20));

        System.out.println("Mínimo: " + calculadora.minimo(10, 20));
    }
}