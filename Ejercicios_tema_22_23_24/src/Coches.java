import java.util.ArrayList;

public class Coches {

    CochesDB cochesDB;

    private Coches() {
    }

    public Coches(CochesDB cochesDB) {
        this.cochesDB = cochesDB;
    }

    public ArrayList<Coche> listarCoches() {
        return cochesDB.listar();
    }

    public void crearCoche(Coche coche) {
        if (cochesDB.buscar(coche) != null) {
            return;
        }

        cochesDB.crear(coche);
    }

    public Coche buscarCoche(String placa) {
        Coche coche = new Coche();
        coche.setPlaca(placa);

        return cochesDB.buscar(coche);
    }

    public void eliminarCoche(String placa) {
        Coche coche = new Coche();
        coche.setPlaca(placa);

        cochesDB.eliminar(coche);
    }
}
