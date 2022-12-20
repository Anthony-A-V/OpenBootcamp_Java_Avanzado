package State;

public class EstadoBloqueado extends Estado {
    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono) );
        return "Movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "La camara esta bloqueada";
    }

    @Override
    public String hacerFoto() {
        return "La camara esta bloqueada";
    }
}
