package entities;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Vehiculo {

    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo(){}

   public Vehiculo(String marca) {
       this.marca = marca;
   }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static String mayorPrecio(List<Vehiculo> vehiculos) {

        int mayor=0;
        int indMayor=0;
        for (Vehiculo vehiculo:vehiculos) {
            if( vehiculo.precio>mayor){
                indMayor=vehiculos.indexOf(vehiculo);
            }
        }
        return "Vehículo más caro: " + vehiculos.get(indMayor).marca + " " +vehiculos.get(indMayor).modelo;

    }

    public static String menorPrecio(List<Vehiculo> vehiculos) {

        int menor=0;
        int indMenor=0;
        for (Vehiculo vehiculo:vehiculos) {
            if( vehiculo.precio<menor){
                indMenor=vehiculos.indexOf(vehiculo);
            }
        }
        return "Vehículo más barato: " + vehiculos.get(indMenor).marca + " " +vehiculos.get(indMenor).modelo;
    }

    public static String buscador(List<Vehiculo> vehiculos, String parametro) {

        String busqueda="";
        DecimalFormat df = new DecimalFormat("#,###.00");
        for (Vehiculo vehiculo:vehiculos) {
            if( vehiculo.modelo.indexOf(parametro.toLowerCase())!=-1 || vehiculo.modelo.indexOf(parametro.toUpperCase())!=-1) {
                return  "Vehículo que contiene en el modelo la letra ‘"+parametro+"’: " + vehiculo.marca + " " + vehiculo.modelo + " $" +
                        "" + df.format(vehiculo.precio);

            } else {
                busqueda = "Vehículo que contiene en el modelo la letra ‘"+ parametro +"’: No se ha encontrado";
            }
        }
        return busqueda;
    }

    public static void ordenar(List<Vehiculo> vehiculos) {

        vehiculos.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());

        for (Vehiculo vehiculo:vehiculos) {
            System.out.println(vehiculo.marca + " " + vehiculo.modelo);
        }
    }
}
