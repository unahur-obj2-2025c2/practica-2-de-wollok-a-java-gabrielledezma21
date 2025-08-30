package me.gonzager.ex.drones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DronTest {
    @Test
    void queSePuedaInstanciarUnDronComercial() {
        Dron dronC = new DronComercial(15.0, 20.0);
        assertEquals(DronComercial.class, dronC.getClass());
    }

    @Test
    void queSePuedaInstanciarUnDronDeSeguridad() {
        Dron dronDS = new DronDeSeguridad(15.0, 20.0);
        assertEquals(DronDeSeguridad.class, dronDS.getClass());
    }

}
