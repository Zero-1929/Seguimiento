package uniquindio.edu.co.Collections.Punto13;

import java.util.PriorityQueue;
import java.util.Queue;

//Atencion de pacientes segun la gravedad con PriorityQueue.
public class Hospital {
    private final Queue<Paciente> salaUrgencias = new PriorityQueue<>();

    public void ingresarPaciente(Paciente paciente) {
        salaUrgencias.add(paciente);
        System.out.println("Ingresa paciente: " + paciente);
    }

    public Paciente atenderSiguiente() {
        return salaUrgencias.poll();
    }

    public boolean estaVacia() {
        return salaUrgencias.isEmpty();
    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.ingresarPaciente(new Paciente("Mateo", 3));
        hospital.ingresarPaciente(new Paciente("Emanuel", 5));
        hospital.ingresarPaciente(new Paciente("Sofia", 2));
        hospital.ingresarPaciente(new Paciente("Mauricio", 5));

        System.out.println("\nOrden de atencion por urgencia:");
        while (!hospital.estaVacia()) {
            System.out.println("Atendiendo: " + hospital.atenderSiguiente());
        }
    }
}