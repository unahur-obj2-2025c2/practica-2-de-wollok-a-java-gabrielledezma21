package me.gonzager.ex.misiones;

import java.util.List;

import me.gonzager.ex.drones.Dron;
import me.gonzager.ex.sensores.Sensor;

public class MisionDeVigilancia implements Mision{

    List<Sensor> sensores;

    @Override
    public Double eficienciaOperativa() {
        return sensores.stream().mapToDouble(s -> s.eficiencia()).sum();
    }

    @Override
    public Boolean esAvanzada(Dron dron) {
        return sensores.stream().allMatch(s -> s.esDuradero());
    }

}