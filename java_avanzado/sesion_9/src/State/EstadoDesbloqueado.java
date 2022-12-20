package State;

public class EstadoDesbloqueado extends Estado{
        public EstadoDesbloqueado(Telefono telefono) {
            super(telefono);
        }

        @Override
        public String desbloquear() {
            return "Desbloqueado";
        }

        @Override
        public String abrirCamara() {

            return "camara abierta";
        }

        @Override
        public String hacerFoto() {
            return "hago foto";
        }


}
