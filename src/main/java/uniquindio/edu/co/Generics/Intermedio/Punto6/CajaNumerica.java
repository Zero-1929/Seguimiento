package uniquindio.edu.co.Generics.Intermedio.Punto6;

public class CajaNumerica<T extends Number> {

    private T numero;

    public CajaNumerica(T numero) {
        this.numero = numero;
    }

    // Devuelve el doble del número almacenado.
    public double doble() {
        return numero.doubleValue() * 2;
    }


    public static void main(String[] args) {

        CajaNumerica<Integer> numero1 = new CajaNumerica<>(10);

        System.out.println(numero1.doble());


        CajaNumerica<Double> numero2 = new CajaNumerica<>(5.5);

        System.out.println(numero2.doble());
    }
}
