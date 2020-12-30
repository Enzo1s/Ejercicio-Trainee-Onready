package entities;

import java.text.DecimalFormat;

public class Auto extends Vehiculo{

    private int puertas;

    public Auto(int puertas) {
        this.puertas = puertas;
    }

    public Auto(String marca, int puertas) {
        super(marca);
        this.puertas = puertas;
    }

    public Auto(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    public Auto(String marca, String modelo, int puertas, float precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
// Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Marca: "+ this.getMarca()
                + " // Modelo: " + this.getModelo()
                + " // Puertas: " + this.puertas
                + " // Precio: $" + df.format(this.getPrecio());
    }
}
