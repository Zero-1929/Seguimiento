package uniquindio.edu.co.Collections.Punto13;

public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int gravedad;

    public Paciente(String nombre, int gravedad) {
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    //A mayor gravedad, se atiende primero
    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(otro.gravedad, this.gravedad);
    }

    @Override
    public String toString() {
        return "{ nombre='" + nombre + "', gravedad=" + gravedad + " }\n";
    }
}
