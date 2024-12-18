package ejercicio10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {

    private Map<Palabra, List<String>> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    public void agregarPalabra(Palabra palabra, String... definiciones) {
        if (!this.diccionario.containsKey(palabra)) {
            this.diccionario.put(palabra, new ArrayList<>());

        }
        for (String def : definiciones) {
            this.diccionario.get(palabra).add(def);
        }
    }

    public String buscarDefinicion(String palabra) {
        List<String> sinonimos;
        for (Palabra p : this.diccionario.keySet()) {
            sinonimos = p.getSinonimos();
            if (sinonimos.contains(palabra)) {
                return this.diccionario.get(p).toString();
            }
        }
        return "Sin definicion...";
    }

    public static void main(String[] args) {
        Diccionario dic = new Diccionario();
        Palabra p1 = new Palabra("coger");
        p1.agregarSinonimo("tomar", "agarrar");
        dic.agregarPalabra(p1, "tomar algo", "tener seso");
        dic.agregarPalabra(new Palabra("coger"), "tener sexo");
        dic.agregarPalabra(new Palabra("automatico"), "que hace todo solo");
        dic.agregarPalabra(new Palabra("saludar"), "expresion gestual hacia alguien");
        System.out.println("coger" + " -> " + dic.buscarDefinicion("coger"));
        System.out.println("tomar" + " -> " + dic.buscarDefinicion("tomar"));
        System.out.println("tomar" + " -> " + dic.buscarDefinicion("beber"));
    }
}
