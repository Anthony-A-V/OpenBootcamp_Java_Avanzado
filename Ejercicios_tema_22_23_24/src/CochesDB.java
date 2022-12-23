import java.util.ArrayList;

public interface CochesDB {

    public ArrayList<Coche> listar();

    public void crear(Coche coche);

    public Coche buscar(Coche coche);

    public void eliminar(Coche coche);
}
