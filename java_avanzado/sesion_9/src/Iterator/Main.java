package Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Usuarios usuarios = new Usuarios();
        usuarios.make(new Usuario("uno", 5));
        usuarios.make(new Usuario("dos", 15));
        usuarios.make(new Usuario("tres", 25));
        usuarios.make(new Usuario("cuatro", 35));
        usuarios.make(new Usuario("cinco", 45));
        while(usuarios.hasMore()){
            Usuario usuario = usuarios.next();
            System.out.println(usuario.getNombre() + " " + usuario.getEdad());
        }
        usuarios.reset();
        while(usuarios.hasMore()){
            Usuario usuario = usuarios.next();
            System.out.println(usuario.getNombre() + " " + usuario.getEdad());
        }

    }
}