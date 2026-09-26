package uniquindio.edu.co.Collections.Punto17;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

//Agenda de eventos con TreeMap:
//las fechas se mantienen ordenadas cronologicamente (Por medio del valor de la clave).
public class AgendaEventos {
    private TreeMap<LocalDate, String> eventos = new TreeMap<>();

    public void agregarEvento(LocalDate fecha, String nombre) {
        eventos.put(fecha, nombre);
        System.out.println("Evento agregado: " + fecha + " -> " + nombre);
    }

    //Accede al evento mas proximo (la clave mas pequena del TreeMap)
    public String eventoMasProximo() {
        return eventos.firstEntry().getValue() + " (" + eventos.firstEntry().getKey() + ")";
    }

    public void mostrarAgenda() {
        System.out.println("\nAgenda ordenada cronologicamente:");
        for (Map.Entry<LocalDate, String> entrada : eventos.entrySet()) {
            System.out.println(" - " + entrada.getKey() + ": " + entrada.getValue());
        }
        System.out.println("\nProximo evento: " + eventoMasProximo());
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.agregarEvento(LocalDate.of(2026, 12, 1), "Entrega parcial");
        agenda.agregarEvento(LocalDate.of(2026, 10, 15), "Parcial 1");
        agenda.agregarEvento(LocalDate.of(2026, 11, 20), "Sustentacion");
        agenda.mostrarAgenda();
    }
}