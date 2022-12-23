import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CochesDBFichero implements CochesDB {
    public String ficheroDatos = "coches.txt";

    @Override
    public ArrayList<Coche> listar() {

        ArrayList<Coche> coches = new ArrayList<>();
        Scanner scanner;

        try {

            scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String cocheActual = scanner.next();
                String[] partes = cocheActual.split(",");

                Coche coche = new Coche();
                coche.setPlaca(partes[0]);
                coche.setMarca(partes[1]);
                coche.setColor(partes[2]);
                coche.setModelo(partes[3]);

                coches.add(coche);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        return coches;
    }

    @Override
    public void crear(Coche coche) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(ficheroDatos, true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(separarCochePorComas(coche));
            printStream.flush();
            printStream.close();

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    @Override
    public Coche buscar(Coche coche) {

        ArrayList<Coche> coches = listar();

        for (Coche cocheActual : coches) {

            if (cocheActual.getPlaca().equalsIgnoreCase(coche.getPlaca())) {
                return cocheActual;
            }
        }

        return null;
    }

    @Override
    public void eliminar(Coche coche) {
        ArrayList<Coche> coches = listar();

        coches.removeIf(cocheActual -> cocheActual.getPlaca().equalsIgnoreCase(coche.getPlaca()));

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);
            for (Coche cocheActual : coches) {
                String cocheComas = separarCochePorComas(cocheActual);
                printStream.println(cocheComas);
            }

            printStream.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    private String separarCochePorComas(Coche coche) {
        return coche.getPlaca() + ","
                + coche.getMarca() + ","
                + coche.getColor() + ","
                + coche.getModelo();
    }
}
