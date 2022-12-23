public class Main {
    public static void main(String[] args) {

        Coche coche1 = new CocheElectrico("AAAAAA", "Nissan", "Azul", "Patrol");
        Coche coche2 = new CocheCombustible("BBBBBB", "Toyota", "Negro", "Yaris");
        Coche coche3 = new CocheHibrido("CCCCCC", "Lambrogini", "Gris", "Aventator");

        CochesDB cochesDB = new CochesDBFichero();
        Coches coches = new Coches(cochesDB);
        coches.crearCoche(coche1);
        coches.crearCoche(coche2);
        coches.crearCoche(coche3);

        for (Coche cocheActual : coches.listarCoches()) {
            System.out.println(cocheActual.toString());
            System.out.println();
        }
    }
}