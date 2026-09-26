package uniquindio.edu.co.Collections.Punto12;

import java.util.TreeSet;

//Nombres de estudiantes mantenidos ordenados alfabeticamente con TreeSet.
public class Estudiantes {
    private TreeSet<String> nombres = new TreeSet<>();

    public void agregarEstudiante(String nombre) {
        nombres.add(nombre);
        System.out.println("Agregado: " + nombre);
    }

    public String primerNombre() {
        return nombres.first();
    }

    public String ultimoNombre() {
        return nombres.last();
    }

    public void mostrarOrdenados() {
        System.out.println("Estudiantes ordenados: " + nombres);
        System.out.println("Primer nombre: " + primerNombre());
        System.out.println("Ultimo nombre: " + ultimoNombre());
    }

    public static void main(String[] args) {
        Estudiantes universidad = new Estudiantes();
        universidad.agregarEstudiante("Maria");
        universidad.agregarEstudiante("Juan");
        universidad.agregarEstudiante("Ana");
        universidad.agregarEstudiante("Carlos");
        System.out.println();
        universidad.mostrarOrdenados();
    }
}