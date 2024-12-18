package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Empleado implements Comparable<Empleado> {

    private static int ID_EMPLEADO = 0;

    private List<Juguete> juguetes;
    private String nombre, apellido;
    private boolean tieneEntrada;
    private int id;

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.juguetes = new ArrayList<>();
        this.id = ID_EMPLEADO;
        ID_EMPLEADO++;
    }

    /**
     * Agrega un juguete al empleado
     *
     * @param juguetes
     */
    public void agregarJuguete(Juguete... juguetes) {
        for (Juguete juguete : juguetes) {
            this.juguetes.add(juguete);
        }
    }

    /**
     * Lista todos los juguetes que tiene el empleado
     *
     * @return
     */
    public String listarJuguetes() {
        StringBuilder sb = new StringBuilder();
        int cantJuguetes = this.juguetes.size();
        for (int i = 0; i < cantJuguetes; i++) {
            sb.append(this.juguetes.get(i));
            if (i < cantJuguetes - 1) {
                sb.append(" - ");
            }
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Empleado o) {
        return Integer.compare(this.id, o.getId());
    }

    public String toString() {
        return String.format("ID: %d - Nombre: %s - Apellido: %s - Juguetes: %s - Tiene entrada? %b", this.id, this.nombre, this.apellido, this.listarJuguetes(), this.tieneEntrada);
    }

    public List<Juguete> getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(List<Juguete> juguetes) {
        this.juguetes = juguetes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isTieneEntrada() {
        return tieneEntrada;
    }

    public void setTieneEntrada(boolean tieneEntrada) {
        this.tieneEntrada = tieneEntrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
