package Strategy;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int tipo = 0;
        UsuariosFicheros usuarios = new UsuariosFicheros();

//        if(tipo == 0){
//            UsuariosFicheros usuarios = new UsuariosFicheros();
//        }else {
//            UsuariosMemoria usuarios = new UsuariosMemoria();
//        }
        crear(usuarios,"antonio");
        crear(usuarios,"maria");
        crear(usuarios,"ana");
        crear(usuarios,"andrea");
        for (String usuario : usuarios.list()){
            System.out.println(usuario);
        }
    }
    public static void crear(Usuarios usuario, String nombre){
        usuario.crear(nombre);
    }
    public static ArrayList<String> list(Usuarios usuario){
        return usuario.list();
    }
}
