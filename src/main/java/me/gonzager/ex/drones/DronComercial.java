package me.gonzager.ex.drones;

import me.gonzager.ex.misiones.Mision;

public class DronComercial extends Dron{

    public DronComercial(Double autonomia, Double nivelDeProcesamiento ) {
        super(autonomia, nivelDeProcesamiento);
    }

    public DronComercial(Double autonomia, Double nivelDeProcesamiento, Mision mision) {
        super(autonomia, nivelDeProcesamiento, mision);
    }

    @Override
    public Double eficienciaOperativa() {
        return super.eficienciaOperativa() + 15.0;
    }

    @Override
    public Boolean esAvanzadoSegunDron() {
        return Boolean.FALSE;
    }

}