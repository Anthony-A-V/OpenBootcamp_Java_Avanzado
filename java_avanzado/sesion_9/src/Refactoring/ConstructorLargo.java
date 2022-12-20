package Refactoring;

public class ConstructorLargo {
    String marca;
    String modelo;
    String motor;
    int puertas;

    public ConstructorLargo(String marca, String modelo, String motor, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "ConstructorLargo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
