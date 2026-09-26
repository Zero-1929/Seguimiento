package uniquindio.edu.co.Collections.Punto7;

import java.util.LinkedList;
import java.util.Queue;

//Gestion de turnos de un banco usando LinkedList.
public class BancoTurnos {
    private Queue<String> colaEspera = new LinkedList<>();

    //Agrega un cliente a la cola de espera
    public void agregarCliente(String cliente) {
        colaEspera.add(cliente);
        System.out.println("Cliente agregado: " + cliente);
    }

    //Atiende al primer cliente de la cola
    public String atenderCliente() {
        return colaEspera.poll();
    }

    //Inserta un cliente urgente al inicio de la cola
    public void insertarClienteUrgente(String cliente) {
        LinkedList<String> cola = (LinkedList<String>) colaEspera;
        cola.addFirst(cliente);
        System.out.println("Cliente urgente insertado al inicio: " + cliente);
    }

    public boolean estaVacia() {
        return colaEspera.isEmpty();
    }

    public static void main(String[] args) {
        BancoTurnos banco = new BancoTurnos();
        banco.agregarCliente("Ana");
        banco.agregarCliente("Luis");
        banco.agregarCliente("Carmen");

        banco.insertarClienteUrgente("URGENTE: Doc. Gomez");

        System.out.println("\nAtendiendo:");
        while (!banco.estaVacia()) {
            System.out.println("Atendiendo a: " + banco.atenderCliente());
        }
    }
}
