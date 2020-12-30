import entities.*;

import java.util.ArrayList;
import java.util.List;

/*
Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
Marca: Honda // Modelo: Titan // Cilindrada: 125cc // Precio: $60.000,00
Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
Marca: Yamaha // Modelo: YBR // Cilindrada: 160cc // Precio: $80.500,50
=============================
Vehículo más caro: Peugeot 208
Vehículo más barato: Honda Titan
Vehículo que contiene en el modelo la letra ‘Y’: Yamaha YBR $80.500,50
=============================
Vehículos ordenados por precio de mayor a menor:
Peugeot 208
Peugeot 206
Yamaha YBR
Honda Titan

*/
public class Concesionaria {

    public static void main (String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(new Auto("Peugeot","206",4,200000.00f));
        vehiculos.add(new Moto("Honda", "Titan","125cc",60000.00f));
        vehiculos.add(new Auto("Peugeot", "208", 5, 250000.00f));
        vehiculos.add(new Moto("Yamaha", "YBR", "160cc", 80500.50f));

        for (Vehiculo vehiculo:vehiculos) {
            System.out.println(vehiculo.toString());
        }

        System.out.println("=============================");
        System.out.println(Vehiculo.mayorPrecio(vehiculos));
        System.out.println(Vehiculo.menorPrecio(vehiculos));
        System.out.println(Vehiculo.buscador(vehiculos, "Y"));
        System.out.println("=============================");
        Vehiculo.ordenar(vehiculos);

    }
}
