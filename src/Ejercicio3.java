import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio3 {

    /**
     * Genera una lista con 100 elementos con valores entre 0 y 100
     *
     * @return
     */
    public static List<Integer> generarLista() {
        List<Integer> lista = new ArrayList<>();
        int numRandom;
        int i = 0;
        while (i <= 99) {
            numRandom = (int) ((Math.random() * 100) + 1);
            lista.add(numRandom);
            i++;
        }
        return lista;
    }

    /**
     * Imprime por pantalla una lista de numeros sin mostrar elementos duplicados
     *
     * @param lista
     * @throws Exception
     */
    public static void listarSinDuplicados(List<Integer> lista) throws Exception {
        if (lista.isEmpty()) {
            throw new Exception("La lista esta vacia!");
        } else {
            Set<Integer> conjunto = new HashSet<>();
            for (Integer i : lista) {
                conjunto.add(i);
            }
            for (Integer i : conjunto) {
                System.out.print(i + " ");
            }
        }
    }

}
