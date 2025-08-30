package me.gonzager.ex.misiones;

import me.gonzager.ex.drones.Dron;

public class MisionDeExploracion implements Mision{

    @Override
    public Double eficienciaOperativa() {
        return 0.0;
    }

    @Override
    public Boolean esAvanzada(Dron dron) {
        return dron.eficienciaOperativa() % 2 == 0;
    }

}
