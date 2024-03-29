package Sesion23.Codigo.Final;

public class UsuariosDBEstadisticas extends UsuariosDB{
    private int totalInserciones = 0;
    private int totalEliminaciones = 0;

    public UsuariosDBEstadisticas(String ficheroDatos) {
        super(ficheroDatos);
    }

    public int contarTotal() {
        return obtener().size();
    }

    @Override
    public void insertar(Usuario usuario) {
        super.insertar(usuario);
        totalInserciones++;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        return super.buscar(usuario);
    }

    @Override
    public void borrar(Usuario usuario) {
        super.borrar(usuario);
        totalEliminaciones++;
    }

    public int getTotalInserciones() {
        return totalInserciones;
    }

    public int getTotalEliminaciones() {
        return totalEliminaciones;
    }
}
