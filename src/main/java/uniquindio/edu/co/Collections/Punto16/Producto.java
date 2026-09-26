package uniquindio.edu.co.Collections.Punto16;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //Dos productos con el mismo nombre son el mismo producto,
    //asi el mapa no crea entradas duplicadas al escanearlo otra vez.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Producto)) {
            return false;
        }
        return nombre.equals(((Producto) obj).nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}
