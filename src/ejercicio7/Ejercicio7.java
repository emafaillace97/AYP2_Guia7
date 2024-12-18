package ejercicio7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio7 {

    public static Map<String, Integer> getFrecuencia(String nombreArchivo) {
        FileReader fr = null;
        BufferedReader br = null;
        Map<String, Integer> frecuencias = new HashMap<>();
        try {
            fr = new FileReader(nombreArchivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                for (String palabra : linea.split(" ")) {
                    if (!frecuencias.containsKey(palabra)) {
                        frecuencias.put(palabra, 1);
                    } else {
                        frecuencias.put(palabra, frecuencias.get(palabra) + 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return frecuencias;
    }

    public static void mostrarMapa(Map<String, Integer> mapa) {
        for (String s : mapa.keySet()) {
            System.out.println(s + " -> " + mapa.get(s));
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> mapa = getFrecuencia("src/ejercicio7/lineas.txt");
        mostrarMapa(mapa);
    }
}
