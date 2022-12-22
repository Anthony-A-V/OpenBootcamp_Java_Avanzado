import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Coche coche = null;
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Ingrese el tipo de coche a crear: ");
            System.out.println("""
                    1 - Eléctrico
                    2 - De combustible
                    3 - Híbrido""");
            opcion = scanner.nextInt();
            if (opcion < 0 || opcion > 3) {
                System.out.println("Opción ingresada incorrecta");
            }
        } while (opcion < 0 || opcion > 3);

        switch (opcion) {
            case 1 -> coche = new CocheElectrico();
            case 2 -> coche = new CocheCombustible();
            case 3 -> coche = new CocheHibrido();
        }

        if (coche != null) {
            coche.arrancar();
            coche.frenar();
        }
    }
}