package uniquindio.edu.co.Generics.Basicos.punto5;

public class Par<T> {

    private T valor1;
    private T valor2;

    public Par(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public boolean sonIguales() {
        return valor1.equals(valor2);
    }

    public static void main(String[] args) {

        Par<Integer> numeros = new Par<>(10, 10);

        System.out.println(numeros.sonIguales());

        Par<String> nombres = new Par<>("Juan", "Pedro");

        System.out.println(nombres.sonIguales());
    }
}