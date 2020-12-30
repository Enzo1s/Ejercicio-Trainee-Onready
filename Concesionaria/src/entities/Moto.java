package entities;

import java.text.DecimalFormat;

public class Moto extends Vehiculo {

    private String cilindrada;

    public Moto(){}

    public Moto(String marca, String modelo, String cilindrada, float precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Marca: "+ this.getMarca()
                + " // Modelo: " + this.getModelo()
                + " // Cilindrada: " + this.cilindrada
                + " // Precio: $" + df.format(this.getPrecio());
    }
}
