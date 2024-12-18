import java.util.HashMap;
import java.util.Map;

public class Ejercicio6 {

    public static String traducir(String texto, Map<String, String> diccionario) {
        StringBuilder traduccion = new StringBuilder();
        for (String palabra : texto.split(" ")) {
            String palabraTraducida = diccionario.get(palabra);
            if (palabraTraducida == null) {
                traduccion.append("<error>");
            } else {
                traduccion.append(palabraTraducida);
            }
            traduccion.append(" ");
        }
        return traduccion.toString();
    }

}
