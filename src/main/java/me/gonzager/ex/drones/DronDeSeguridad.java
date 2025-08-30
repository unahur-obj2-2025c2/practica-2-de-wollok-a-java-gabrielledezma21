package me.gonzager.ex.drones;

import me.gonzager.ex.misiones.Mision;

public class DronDeSeguridad extends Dron{

    public DronDeSeguridad(Double autonomia, Double nivelDeProcesamiento ) {
        super(autonomia, nivelDeProcesamiento );
    }

    public DronDeSeguridad(Double autonomia, Double nivelDeProcesamiento, Mision mision) {
        super(autonomia, nivelDeProcesamiento, mision);
    }

    @Override
    public Boolean esAvanzadoSegunDron() {
        return nivelDeProcesamiento > 50;
    }

}
