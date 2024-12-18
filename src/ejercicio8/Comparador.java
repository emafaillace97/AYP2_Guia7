package ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Comparador {

    private Queue<Palabra> palabras;

    public Comparador() {
        this.palabras = new PriorityQueue<>(new ComparadorPalabras());
    }

    /**
     * Agrega palabras a la cola
     *
     * @param palabras
     */
    public void agregar(Palabra... palabras) {
        for (Palabra p : palabras) {
            this.palabras.add(p);
        }
    }

    /**
     * Ordena las palabras por longitud usando una lista de prioridad
     *
     * @return
     */
    public List<Palabra> ordenar() {
        List<Palabra> palabrasOrdenadas = new ArrayList<>();
        while (!this.palabras.isEmpty()) {
            palabrasOrdenadas.add(this.palabras.poll());
        }
        return palabrasOrdenadas;
    }

    public static void main(String[] args) {
        Comparador c = new Comparador();
        Palabra p1 = new Palabra("corta");
        Palabra p2 = new Palabra("cadena muy larga");
        Palabra p3 = new Palabra("media");
        Palabra p4 = new Palabra("cortisima");
        Palabra p5 = new Palabra("cadena muuuuy larga");
        Palabra p6 = new Palabra("me");
        c.agregar(p1, p2, p3, p4, p5, p6);
        System.out.println(c.ordenar());
    }
}
