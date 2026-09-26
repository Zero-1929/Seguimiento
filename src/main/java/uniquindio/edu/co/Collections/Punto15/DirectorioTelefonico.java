package uniquindio.edu.co.Collections.Punto15;

import java.util.HashMap;
import java.util.Map;

//Directorio telefonico usando HashMap:
//Asocia cada nombre con su numero, permite busquedas rapidas y evita duplicados.
public class DirectorioTelefonico {
    private Map<String, String> directorio = new HashMap<>();

    public void agregarContacto(String nombre, String telefono) {
        directorio.put(nombre, telefono);
        System.out.println("Contacto agregado: " + nombre + " -> " + telefono);
    }

    //Busqueda eficiente por nombre
    public String buscarTelefono(String nombre) {
        return directorio.get(nombre);
    }

    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();
        directorio.agregarContacto("Juan", "311-389-7733");
        directorio.agregarContacto("Luis", "311-316-6612");
        directorio.agregarContacto("Felipe", "311-555-0103");
        directorio.agregarContacto("Juan", "313-746-7474"); //reemplaza, no duplica

        System.out.println("\nTelefono de Juan: " + directorio.buscarTelefono("Juan"));
        System.out.println("Telefono de Felipe: " + directorio.buscarTelefono("Felipe"));
        System.out.println("Telefono de alguien inexistente: " + directorio.buscarTelefono("Pedro"));
    }
}
