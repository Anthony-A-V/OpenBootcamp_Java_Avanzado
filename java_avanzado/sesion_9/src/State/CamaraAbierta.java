package State;

public class CamaraAbierta extends Estado {

        public CamaraAbierta(Telefono telefono) {
            super(telefono);
        }

        @Override
        public String desbloquear() {
            return null;
        }

        @Override
        public String abrirCamara() {
            return null;
        }

        @Override
        public String hacerFoto() {
            return null;
        }


}
