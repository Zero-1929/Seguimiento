package uniquindio.edu.co.Collections.Punto16;

import java.util.LinkedHashMap;
import java.util.Map;

//Factura de un supermercado usando LinkedHashMap.
//Los productos se guardan en el mismo orden en que fueron escaneados
//y el total se calcula multiplicando precio por cantidad.
public class FacturaSupermercado {
    private final Map<Producto, Integer> compras = new LinkedHashMap<>();

    //Registra un producto escaneado, sumando su cantidad
    public void escanear(Producto producto) {
        Integer cantidad = compras.get(producto);
        compras.put(producto, cantidad == null ? 1 : cantidad + 1);
        System.out.println("Escaneado: " + producto + " -> " + compras.get(producto) + " unidad(es)");
    }

    //Suma precio por cantidad respetando el orden de escaneo
    public double calcularTotal() {
        double total = 0;
        for (Map.Entry<Producto, Integer> entrada : compras.entrySet()) {
            total += entrada.getKey().getPrecio() * entrada.getValue();
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("\n--- FACTURA ---");
        for (Map.Entry<Producto, Integer> entrada : compras.entrySet()) {
            Producto producto = entrada.getKey();
            int cantidad = entrada.getValue();
            double subtotal = producto.getPrecio() * cantidad;
            System.out.println(producto.getNombre() + " x" + cantidad + " = $" + subtotal);
        }
        System.out.println("TOTAL: $" + calcularTotal());
    }

    public static void main(String[] args) {
        Producto leche = new Producto("Leche", 4200);
        Producto pan = new Producto("Pan", 3800);
        Producto huevos = new Producto("Huevos", 11500);
        Producto cafe = new Producto("Cafe", 12500);

        FacturaSupermercado factura = new FacturaSupermercado();
        factura.escanear(leche);
        factura.escanear(pan);
        factura.escanear(leche);
        factura.escanear(huevos);
        factura.escanear(cafe);
        factura.escanear(pan);

        factura.mostrarFactura();
    }
}
