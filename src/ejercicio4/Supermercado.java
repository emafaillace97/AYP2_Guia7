package ejercicio4;

import java.util.PriorityQueue;
import java.util.Queue;

public class Supermercado {

    private Queue<Cliente> clientes;

    public Supermercado() {
        this.clientes = new PriorityQueue<>();
    }

    public void encolar(Cliente... clientes) {
        for (Cliente c : clientes) {
            this.clientes.add(c);
        }
    }

    public void atender() {
        while (!this.clientes.isEmpty()) {
            Cliente c = this.clientes.poll();
            if (c.getPrioridad() == null) {
                System.out.println("Se atendio a una persona que no tiene prioridad");
            } else {
                System.out.println("Se atendio una persona con discapacidad: " + c.getPrioridad());
            }
        }
    }
}
