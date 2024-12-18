package ejercicio4;

public class Cliente implements Comparable<Cliente> {

    private Prioridades prioridad;
    private boolean tienePrioridad;

    public Cliente(Prioridades prioridad) {
        this.prioridad = prioridad;
        this.tienePrioridad = true;
    }

    public Cliente() {
        this.tienePrioridad = false;
    }

    public Prioridades getPrioridad() {
        return prioridad;
    }


    public boolean isTienePrioridad() {
        return tienePrioridad;
    }

    @Override
    public int compareTo(Cliente o) {
        return -Boolean.compare(this.tienePrioridad, o.isTienePrioridad());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prioridad: ");
        if (this.tienePrioridad) {
            sb.append(this.prioridad.toString());
        } else {
            sb.append("Ninguna");
        }
        return sb.toString();
    }
}
