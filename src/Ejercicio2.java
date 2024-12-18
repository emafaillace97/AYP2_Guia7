import java.util.*;

public class Ejercicio2 {

    /**
     * Eliminar los elementos duplicados de un arreglo
     */
    public static int[] eliminarDuplicados(int[] arreglo) throws Exception {
        if (arreglo.length == 0) {
            throw new Exception("El arreglo esta vacio");
        } else {
            Set<Integer> conjunto = new HashSet<>();
            for (Integer i : arreglo) {
                conjunto.add(i);
            }
            int[] arregloNuevo = new int[conjunto.size()];
            int indice = 0;
            for (Integer i : conjunto) {
                arregloNuevo[indice++] = i;
            }
            return arregloNuevo;
        }
    }

    /**
     * Convierte un arreglo en cadena para poder ser impreso por consola
     *
     * @param arreglo
     * @return
     */
    public static String arregloToString(int[] arreglo) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
