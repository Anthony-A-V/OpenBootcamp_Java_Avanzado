import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
//asd
public class Main {
    public static int[] listaEnteros = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        try {
            dividirPorCero(5);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            iterarLista();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            accederFichero();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void dividirPorCero(int numero) throws ArithmeticException {

        try {
            double resultado = numero / 0;
        } catch (Exception e) {
            throw new ArithmeticException("No se puede eliminar por cero -> " + e.getMessage());
        }
    }

    public static void iterarLista() throws ArrayIndexOutOfBoundsException {

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(listaEnteros[i]);
            }
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("Fuera del índice del Array -> " + e.getMessage());
        }
    }

    public static void accederFichero() throws FileNotFoundException {

        try {
            InputStream is = new FileInputStream("/documento.txt");
        } catch (Exception e) {
            throw new FileNotFoundException("Archivo no encontrado -> " + e.getMessage());
        }

    }
}