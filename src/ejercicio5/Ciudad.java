package ejercicio5;

public class Ciudad {

    private String pais, nombre;

    public Ciudad(String pais, String nombre) {
        this.pais = pais;
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return String.format("%s - %s", this.pais.toUpperCase(), this.nombre);
    }

}
