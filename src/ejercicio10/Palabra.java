package ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Palabra {

    private String texto;
    private List<String> sinonimos;

    public Palabra(String texto) {
        this.texto = texto.toLowerCase();
        this.sinonimos = new ArrayList<>();
        this.agregarSinonimo(texto);
    }

    public void agregarSinonimo(String... sinonimos) {
        for (String sinonimo : sinonimos) {
            this.sinonimos.add(sinonimo);
        }
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setSinonimos(List<String> sinonimos) {
        this.sinonimos = sinonimos;
    }

    public String getTexto() {
        return texto;
    }

    public List<String> getSinonimos() {
        return sinonimos;
    }

    public String toString() {
        return "[" + this.texto + " => " + this.sinonimos + "]";
    }

}
