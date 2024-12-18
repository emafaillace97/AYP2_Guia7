package ejercicio1;

import java.util.*;

public class Jugueteria {

    private String nombre;
    private List<Empleado> empleados;
    private Set<String> nombresEmpleados;
    private List<Juguete> juguetes;

    public Jugueteria(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.nombresEmpleados = new HashSet<>();
        this.juguetes = new ArrayList<>();
    }

    /**
     * Agrega un empleado a la jugueteria
     *
     * @param empleados
     */
    public void agregarEmpleado(Empleado... empleados) {
        for (Empleado empleado : empleados) {
            this.empleados.add(empleado);
            this.nombresEmpleados.add(empleado.getNombre());
        }
    }

    /**
     * Lista todos los posibles nombres que pueden tener los juguetes entrantes
     */
    public void listarPosiblesNombresJuguetes() {
        if (this.nombresEmpleados.isEmpty()) {
            System.out.println("[NO HAY EMPLEADOS REGISTRADOS]");
        } else {
            for (String nombre : this.nombresEmpleados) {
                System.out.println(nombre);
            }
        }
    }

    /**
     * Agrega un juguete al stock
     *
     * @param nombre
     */
    public void agregarJuguete(String nombre) {
        if (!this.nombresEmpleados.contains(nombre)) {
            this.juguetes.add(new Juguete(nombre));
        }
    }

    /**
     * Lista todos los empleados de la jugueteria
     */
    public void listarEmpleados() {
        for (Empleado empleado : this.empleados) {
            System.out.println(empleado);
        }
    }

    /**
     * Sortea aleatoriamente un juguete entre los empleados
     *
     * @param nombreJuguete
     */
    public void sortearJuguete(String nombreJuguete) {
        int cantEmpleados = this.empleados.size();
        int i = (int) (Math.random() * cantEmpleados);
        Juguete juguete = new Juguete(nombreJuguete);
        this.empleados.get(i).agregarJuguete(juguete);
    }

    /**
     * Se le da una entrada a cada empleado segun su ID
     */
    public void sortearEntradas() {
        PriorityQueue<Empleado> empleadosCola = new PriorityQueue<>();
        this.anotarEmpleados(empleadosCola);
        while (!empleadosCola.isEmpty()) {
            empleadosCola.poll().setTieneEntrada(true);
        }
    }

    /**
     * Anota a los empleado en una lista de espera
     *
     * @param empleadosCola
     */
    private void anotarEmpleados(PriorityQueue<Empleado> empleadosCola) {
        for (Empleado emp : this.empleados) {
            empleadosCola.add(emp);
        }
    }

}
