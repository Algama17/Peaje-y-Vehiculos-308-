package dev.alberto;

public class EstacionPeaje {
    private double totalRecaudado;

    public EstacionPeaje(String nombre, String ciudad) {
        this.totalRecaudado = 0.0;
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        double peaje = vehiculo.calcularPeaje();
        this.totalRecaudado += peaje;
    }

    public double calcularTotalRecaudado() {
        return totalRecaudado;
    }
}
