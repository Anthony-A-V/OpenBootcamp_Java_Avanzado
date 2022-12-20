import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * Lista del tipo Integer que se usa para agregar e iterar sus valores
     */
    public static List<Integer> listaEnteros = new ArrayList<>();

    /**
     * Función principal de la clase Main
     * @param args Valores de los argumentos
     */
    public static void main(String[] args) {
        agregarLista(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        iterarLista();
    }

    /**
     * Función que agrega una cantidad variable de valores Integer a la lista listaEnteros
     * @param enteros Valores Integers que se le agrega a la lista listaEnteros
     */
    public static void agregarLista(Integer... enteros) {
        listaEnteros.addAll(Arrays.asList(enteros));
    }

    /**
     * Función que itera la lista listaEnteros e imprime sus valores
     */
    public static void iterarLista() {
        for (int entero : listaEnteros) {
            System.out.println(entero);
        }
    }
}