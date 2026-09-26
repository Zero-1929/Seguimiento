package uniquindio.edu.co.Collections.Punto10;

import java.util.HashSet;
import java.util.Set;

//Control de acceso de un edificio usando HashSet.
//Cada ID de empleado es unico: no se permiten duplicados.
public class ControlAcceso {
    private Set<Integer> idsEmpleados = new HashSet<>();

    public boolean registrarEmpleado(int id) {
        boolean agregado = idsEmpleados.add(id);
        System.out.println("Registrar ID " + id + (agregado ? " -> aceptado" : " -> rechazado (ya existe)"));
        return agregado;
    }

    //Verifica el ID antes de permitir la entrada
    public boolean permitirIngreso(int id) {
        boolean autorizado = idsEmpleados.contains(id);
        System.out.println("Ingreso con ID " + id + " -> " + (autorizado ? "PERMITIDO" : "DENEGADO"));
        return autorizado;
    }

    public static void main(String[] args) {
        ControlAcceso edificio = new ControlAcceso();
        edificio.registrarEmpleado(101);
        edificio.registrarEmpleado(102);
        edificio.registrarEmpleado(101); //duplicado

        System.out.println();
        edificio.permitirIngreso(102);
        edificio.permitirIngreso(999);
    }
}