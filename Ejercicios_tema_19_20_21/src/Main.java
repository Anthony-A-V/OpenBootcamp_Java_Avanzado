import org.apache.commons.cli.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        final Options options = new Options();
        Option a1 = new Option("a1", "argumento1", true, "Argumento1 de prueba");
        a1.setRequired(true);
        Option a2 = new Option("a2", "argumento2", true, "Argumento2 de prueba");
        a2.setRequired(true);
        Option a3 = new Option("a3", "argumento3", true, "Argumento3 de prueba");
        a3.setRequired(false);

        options.addOption(a1);
        options.addOption(a2);
        options.addOption(a3);

        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd;

        try {
            cmd = parser.parse(options, args);

        } catch (ParseException e) {
            System.out.println("Unexpected exception:" + e.getMessage());
            formatter.printHelp("Argumentos: ", options);
            System.exit(1);
            return;
        }

        System.out.println(Arrays.toString(cmd.getOptions()));

        //Opciones requeridas
        System.out.println("Argumento1: " + cmd.getOptionValue("a1"));
        System.out.println("Argumento2: " + cmd.getOptionValue("a2"));

        //Opción no requerida. Si no tiene la opción, no lo imprime
        if (cmd.hasOption("a3")) {
            System.out.println("Argumento3: " + cmd.getOptionValue("a3"));
        }

        /*
        * La arquitectura limpia tiene como características principales que la estructura
        * del software se maneje por capas. Además, separa la lógica de la aplicación
        * de la lógica del negocio.
        *
        * Esta arquitectura se usaría, en mi opinión, en cualquier prouecto, porque de
        * esta manera se tendría un código mucho mejor organizado y facil de mantener a
        * largo plazo.
        *
        * Para aplicar la arquitectura limpia, lo haría tomando en cuenta los principios
        * S.O.L.I.D.
        * */
    }
}