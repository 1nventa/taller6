package taller6.ejercicio2;

public class Moto extends Vehiculo {
    protected double cilindrada;

    public Moto(String tipo, String marca, double cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }
}