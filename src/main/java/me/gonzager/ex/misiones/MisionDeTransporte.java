package me.gonzager.ex.misiones;

import me.gonzager.ex.drones.Dron;

public class MisionDeTransporte implements Mision{

    @Override
    public Double eficienciaOperativa() {
        return 100.0;
    }

    @Override
    public Boolean esAvanzada(Dron dron) {
        return dron.getAutonomia() > 50;
    }

}
