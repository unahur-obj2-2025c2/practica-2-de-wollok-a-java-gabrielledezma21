package me.gonzager.ex.zonas;

import me.gonzager.ex.operaciones.Escuadron;

public class Zona {

    private Double tamanioTotal;
    private Double cantidadDeOperaciones;

    public Zona(Double tamanioTotal, Double cantidadDeOperaciones) {
        this.tamanioTotal = tamanioTotal;
        this.cantidadDeOperaciones = cantidadDeOperaciones;
    }

    public Double getTamanioTotal() {
        return tamanioTotal;
    }

    public Double getCantidadDeOperaciones() {
        return cantidadDeOperaciones;
    }

    public void operarPorEscuadron(Escuadron escuadron){
        if(escuadron.puedeOperarEn(this)){
            cantidadDeOperaciones += 1;
            escuadron.getDrones().stream().forEach(d -> d.setAutonomia(d.getAutonomia() - 2));
        }
    }

}
/*
 Operar una zona por el escuadrón: Si el escuadrón puede operar la zona entonces sucede lo siguiente
la zona registra que recibió una operacion
Cada dron que compone el escuadrón disminuye su autonomía en 2 unidades
 */