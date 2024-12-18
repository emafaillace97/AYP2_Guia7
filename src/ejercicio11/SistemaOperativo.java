package ejercicio11;

import java.util.PriorityQueue;
import java.util.Queue;

public class SistemaOperativo {

    Queue<Proceso> colaPrioridades;

    public SistemaOperativo() {
        this.colaPrioridades = new PriorityQueue<>();
    }

    public void agregarProcesos(Proceso... procesos) {
        for (Proceso p : procesos) {
            this.colaPrioridades.add(p);
        }
    }

    public void ejecutarProcesos() {
        System.out.println("Ejecutando procesos...");
        while (!this.colaPrioridades.isEmpty()) {
            this.colaPrioridades.poll().ejecutar();
        }
    }

    public void calcularTiempoDeEspera() {
        int tiempoEspera = 0;
        Proceso procesoReciclado = this.colaPrioridades.poll();
        System.out.printf("El proceso %s debe esperar %d seg. en ejecutarse\n", procesoReciclado.getNombre(), tiempoEspera);
        while (!this.colaPrioridades.isEmpty()) {
            procesoReciclado = this.colaPrioridades.poll();
            tiempoEspera += procesoReciclado.getTiempoTotal() + 1;
            System.out.printf("El proceso %s debe esperar %d seg. en ejecutarse\n", procesoReciclado.getNombre(), tiempoEspera);
        }
    }

    public static void main(String[] args) {
        try {
            SistemaOperativo so = new SistemaOperativo();
            Proceso p1 = new Proceso("P0", 0, 5, 4);
            Proceso p2 = new Proceso("P1", 1, 3, 2);
            Proceso p3 = new Proceso("P2", 2, 8, 5);
            Proceso p4 = new Proceso("P3", 3, 2, 1);
            Proceso p5 = new Proceso("P4", 4, 3, 2);
            so.agregarProcesos(p1, p2, p3, p4, p5);
            so.ejecutarProcesos();
            so.agregarProcesos(p1, p2, p3, p4, p5);
            so.calcularTiempoDeEspera();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
