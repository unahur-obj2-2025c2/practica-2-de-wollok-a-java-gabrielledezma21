package me.gonzager.ex.drones;

import me.gonzager.ex.misiones.Mision;

public abstract class Dron {
    protected Double autonomia;
    protected Double nivelDeProcesamiento;
    protected Mision mision;

    public Dron(Double autonomia, Double nivelDeProcesamiento) {
        this.autonomia = autonomia;
        this.nivelDeProcesamiento = nivelDeProcesamiento;
    }

    public Dron(Double autonomia, Double nivelDeProcesamiento, Mision mision) {
        this.autonomia = autonomia;
        this.nivelDeProcesamiento = nivelDeProcesamiento;
        this.mision = mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public Double eficienciaOperativa(){
        return autonomia * 10 + mision.eficienciaOperativa();
    }

    public Boolean esAvanzado(){
        return esAvanzadoSegunDron() || esAvanzadoSegunMision();
    };

    public abstract Boolean esAvanzadoSegunDron();

    public Boolean esAvanzadoSegunMision(){
        return mision.esAvanzada(this);
    }

    public Double getAutonomia() {
        return autonomia;
    }

    public Double getNivelDeProcesamiento() {
        return nivelDeProcesamiento;
    }

    public Mision getMision() {
        return mision;
    }

    public void setAutonomia(Double autonomia) {
        if (autonomia < 0) {
            throw new RuntimeException("No se puede registrar una autonomia menor a cero.");
        }
        this.autonomia = autonomia;
    }

    public void setNivelDeProcesamiento(Double nivelDeProcesamiento) {
        this.nivelDeProcesamiento = nivelDeProcesamiento;
    }
    
}
