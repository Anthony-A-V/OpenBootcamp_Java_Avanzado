package State;

public class Main {
    public static void main(String[] args) {
        Telefono tel1 = new Telefono();

      String desbloquear =  tel1.estado.desbloquear();
      String hacerFoto =  tel1.estado.hacerFoto();
      System.out.println(desbloquear);
      System.out.println(hacerFoto);
    }
}
