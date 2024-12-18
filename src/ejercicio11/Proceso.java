package ejercicio11;

public class Proceso implements Comparable<Proceso> {

    //public static int ID_PROCESO;

    //private int id;
    private String nombre;
    private int tiempoLlegada;
    private int demoraEjecucion;
    private int prioridad;

    public Proceso(String nombre, int tiempoLlegada, int demoraEjecucion, int prioridad) throws Exception {
        if (prioridad <= 0 || prioridad > 5) {
            throw new Exception("La prioridad debe estar entre 1 y 5!");
        } else if (tiempoLlegada < 0 || demoraEjecucion < 0) {
            throw new Exception("Los tiempos deben ser positivos y distintos de cero!");
        } else {
            this.nombre = nombre;
            this.tiempoLlegada = tiempoLlegada;
            this.demoraEjecucion = demoraEjecucion;
            this.prioridad = prioridad;
            //this.id = Proceso.ID_PROCESO++;
        }
    }

    public void ejecutar() {
        System.out.printf("Ejecutando proceso %s -> Llegó a los %d seg. - Dura: %d seg. - Prioridad: %d\n", this.nombre, this.tiempoLlegada, this.demoraEjecucion, this.prioridad);
    }

    public int getTiempoTotal() {
        return this.tiempoLlegada + this.demoraEjecucion;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public int getDemoraEjecucion() {
        return demoraEjecucion;
    }

    public void setDemoraEjecucion(int demoraEjecucion) {
        this.demoraEjecucion = demoraEjecucion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre(){
        return this.nombre;
    }


    @Override
    public int compareTo(Proceso o) {
        if (this.prioridad > o.getPrioridad()) {
            return 1;
        } else if (this.prioridad < o.getPrioridad()) {
            return -1;
        } else {
            if (this.tiempoLlegada > o.getTiempoLlegada()) {
                return 1;
            } else if (this.tiempoLlegada < o.getTiempoLlegada()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
