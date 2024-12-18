package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Programa {

    private Map<Integer, List<Ciudad>> pobCiudades;

    public Programa() {
        this.pobCiudades = new TreeMap<>();
    }

    /**
     * Agrega una ciudad con su poblacion
     *
     * @param pob
     * @param c
     */
    public void agregarPoblacionCiudad(int pob, Ciudad c) {
        if (!this.pobCiudades.containsKey(pob)) {
            this.pobCiudades.put(pob, new ArrayList<>());

        }
        this.pobCiudades.get(pob).add(c);
    }

    /**
     * Agrega una ciudad con su poblacion
     *
     * @param pob
     * @param pais
     * @param nombre
     */
    public void agregarPoblacionCiudad(int pob, String pais, String nombre) {
        Ciudad c = new Ciudad(pais, nombre);
        if (!this.pobCiudades.containsKey(pob)) {
            this.pobCiudades.put(pob, new ArrayList<>());
        }
        this.pobCiudades.get(pob).add(c);
    }

    /**
     * Transforma en una cadena la lista de ciudades
     *
     * @param ciudades
     * @return
     */
    public String stringListaCiudades(List<Ciudad> ciudades) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < ciudades.size(); i++) {
            sb.append(ciudades.get(i).toString());
            if (i < ciudades.size() - 1) {
                sb.append(" -- ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Imprime por consola todas las poblaciones con sus respectivas ciudades
     */
    public void listar() {
        for (Integer pob : this.pobCiudades.keySet()) {
            System.out.println(pob + " habs. -> " + this.stringListaCiudades(this.pobCiudades.get(pob)));
        }
    }

    /**
     * Busca una ciudad o varias segun una cantidad de habitantes
     *
     * @param poblacion
     * @return
     */
    public List<Ciudad> buscarCiudades(int poblacion) {
        return this.pobCiudades.get(poblacion);
    }

    public static void main(String[] args) {
        Programa p = new Programa();
        p.agregarPoblacionCiudad(1000, new Ciudad("Argentina", "Formosa"));
        p.agregarPoblacionCiudad(1000, new Ciudad("Argentina", "Resistencia"));
        p.agregarPoblacionCiudad(2000, new Ciudad("Colombia", "Bogota"));
        p.agregarPoblacionCiudad(2100, new Ciudad("Colombia", "Medellin"));
        p.agregarPoblacionCiudad(2100, new Ciudad("Ecuador", "Quito"));
        p.agregarPoblacionCiudad(3000, new Ciudad("Venezuela", "Caracas"));
        p.agregarPoblacionCiudad(4000, new Ciudad("Paraguay", "Asuncion"));
        p.listar();
        System.out.println(p.buscarCiudades(1000));
    }

}
