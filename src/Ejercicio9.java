import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio9 {

    public static Set<Character> obtenerLetras(String cadena) {
        Set<Character> letras = new HashSet<>();
        for (Character c : cadena.toCharArray()) {
            letras.add(c);
        }
        return letras;
    }

    public static Set<Character> obtenerVocales(String cadena){
        Set<Character> vocales = new HashSet<>();
        for (Character c : cadena.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales.add(c);
            }
        }
        return vocales;
    }

    public static Set<Character> obtenerConsonantesOrdenadas(String cadena){
        Set<Character> consonantes = new TreeSet<>();
        for(Character c : cadena.toCharArray()){
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != ' ') {
                consonantes.add(c);
            }
        }
        return consonantes;
    }

    public static void main(String[] args){
        String cadena = "hola ema como estas? aca estoy con flor";
        System.out.println(obtenerLetras(cadena));
        System.out.println(obtenerVocales(cadena));
        System.out.println(obtenerConsonantesOrdenadas(cadena));
    }
}
