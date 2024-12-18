package ejercicio8;

import java.util.Comparator;

public class ComparadorPalabras implements Comparator<Palabra> {

    @Override
    public int compare(Palabra o1, Palabra o2) {
        return Integer.compare(o1.getTexto().length(), o2.getTexto().length());
    }

}
