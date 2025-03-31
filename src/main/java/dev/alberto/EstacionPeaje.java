package dev.alberto;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String ciudad;
    private double totalRecaudado;
    private List<Vehiculo> vehiculos;

    public EstacionPeaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalRecaudado = 0.0;
        this.vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        double peaje = vehiculo.calcularPeaje();
        this.totalRecaudado += peaje;
        this.vehiculos.add(vehiculo);
    }

    public double calcularTotalRecaudado() {
        return totalRecaudado;
    }

    public List<String> listarVehiculos() {
        List<String> placas = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            placas.add(vehiculo.getPlaca());
        }
        return placas;
    }
}
