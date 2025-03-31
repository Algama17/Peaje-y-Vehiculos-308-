package dev.alberto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
        void testRegistrarCamion() {
        EstacionPeaje estacionPeaje = new EstacionPeaje("Peaje", "Ciudad");
        Vehiculo camion = new Camion("Camionion", 3);
        estacionPeaje.registrarVehiculo(camion);
        assertEquals(150.0, estacionPeaje.calcularTotalRecaudado());
    }

        
    @Test
    
    void testListarVehiculos() {    
        EstacionPeaje estacionPeaje = new EstacionPeaje("Peaje", "Ciudad");
        Vehiculo coche = new Coche("asdf1234");
        Vehiculo moto = new Moto("motoPedrosa");
        Vehiculo camion = new Camion("Camionion", 3);
        estacionPeaje.registrarVehiculo(coche);
        estacionPeaje.registrarVehiculo(moto);
        estacionPeaje.registrarVehiculo(camion);
        assertTrue(estacionPeaje.listarVehiculos().contains("asdf1234"));
        assertTrue(estacionPeaje.listarVehiculos().contains("motoPedrosa"));
        assertTrue(estacionPeaje.listarVehiculos().contains("Camionion"));
    }
}
