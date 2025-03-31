package dev.alberto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EstacionPeajeTest {

    @Test
    void testRegistrarCoche(){
        EstacionPeaje estacionPeaje = new EstacionPeaje("Peaje", "Ciudad");
        Vehiculo coche = new Coche("asdf1234");
        estacionPeaje.registrarVehiculo(coche);
        assertEquals(100.0, estacionPeaje.calcularTotalRecaudado());
    }


    @Test
    void testRegistrarMoto() {
        EstacionPeaje estacionPeaje = new EstacionPeaje("Peaje", "Ciudad");
        Vehiculo moto = new Moto("motoPedrosa");
        estacionPeaje.registrarVehiculo(moto);
        assertEquals(50.0, estacionPeaje.calcularTotalRecaudado());
}
}
