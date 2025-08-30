package me.gonzager.ex.misiones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import me.gonzager.ex.drones.Dron;
import me.gonzager.ex.drones.DronComercial;

public class MisionTest {

    Dron dron;

    @Test
    void testEficienciaOperativaMisionDeExploracion() {
        Mision mision = new MisionDeExploracion();

        assertEquals(0.0, mision.eficienciaOperativa());
    }

    @Test
    void testEsAvanzada() {
        dron = new DronComercial(10.0, 15.0);
        Mision mision = new MisionDeExploracion();

        assertTrue(mision.esAvanzada(dron));

    }
}
