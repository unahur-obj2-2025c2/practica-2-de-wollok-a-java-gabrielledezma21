package me.gonzager.ex.sensores;

public class Sensor {
    private final Double capacidad;
    private final Double durabilidad;
    private final Boolean conMejoras;

    public Sensor(Double capacidad, Boolean conMejoras, Double durabilidad) {
        this.capacidad = capacidad;
        this.conMejoras = conMejoras;
        this.durabilidad = durabilidad;
    }



    public Double eficiencia() {
        return !conMejoras ? capacidad : capacidad * 2;
        // if(!conMejoras){
        //     return capacidad;
        // } else {
        //     return capacidad *2 ;
        // }
    }

    public Boolean esDuradero() {
        return durabilidad > ( capacidad * 2 );
    }

}
