package Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFicheros implements Usuarios {
    private String ficheroUsuario = "usuario.txt";
    private PrintStream fichero;

    public UsuariosFicheros(){
        try{
            fichero = new PrintStream(ficheroUsuario);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    @Override
    public void crear(String nombre){
        fichero.println(nombre);
    }
    @Override
    public ArrayList<String> list(){
        ArrayList<String> usuarios = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File(ficheroUsuario));

            while(scanner.hasNext()){
                usuarios.add(scanner.next());
            }
            scanner.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return usuarios;
    }
}
