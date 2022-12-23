public class Coche implements Vehiculo {
    private String placa;
    private String marca;
    private String color;
    private String modelo;

    public Coche() {
    }

    public Coche(String placa, String marca, String color, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public void arrancar() { System.out.println("Un coche arrancando...");
    }

    @Override
    public void frenar() {
        System.out.println("Un coche frenando...");
    }

    @Override
    public String toString() {
        return "Coche{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
