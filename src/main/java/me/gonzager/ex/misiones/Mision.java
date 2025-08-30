package me.gonzager.ex.misiones;

import me.gonzager.ex.drones.Dron;

public interface Mision {

    Double eficienciaOperativa();

    Boolean esAvanzada(Dron dron);

}
