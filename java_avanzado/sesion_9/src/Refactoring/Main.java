package Refactoring;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num[] = {12, 44, 5, 64};
        imprimeMayor(num);
        ConstructorLargoBuilder cosas = new ConstructorLargoBuilder("chebrolet")
                .conModelo("modelo")
                .conMotor("motor")
                .conPuertas(4);
        System.out.println(cosas);
    }
//    public boolean hoyEsdomingo(int numero){
//        boolean isDomingo = (numero == 7 ? true : false);
//        if(isDomingo){
//            System.out.println(isDomingo);
//        }
//    }

    public static void imprimeMayor(int []num){
        int mayor = Arrays.stream(num)
                .reduce(0, (a, b) -> a > b ? a : b);
        int menor = Arrays.stream(num)
                .reduce(num[0], (a, b) -> a < b ? a : b);

//        int mayor = 0;
//        int menor = num[0];
//        for (int i : num){
////            operador ternario
//            mayor = mayor < i ? i : mayor;
//            menor = menor > i ? i : menor;
//        }
        System.out.println("mayor " + mayor + " menor " + menor);
    }
    public static int ifAnifado(){
        int valor1 = 10;
        int valor2 = 20;
        if (valor1 > valor2){
            return valor1;
        }
            return valor2;

    }
}
