package me.gonzager.ex.operaciones;

import java.util.List;

import me.gonzager.ex.drones.Dron;
import me.gonzager.ex.zonas.Zona;

public class Escuadron {

    private List<Dron> drones;
    private static Integer limiteDeDrones = 10;

    public static Integer getLimiteDeDrones() {
        return limiteDeDrones;
    }
    
    public List<Dron> getDrones() {
        return drones;
    }

    public static void setLimiteDeDrones(Integer limiteDeDrones) {
        Escuadron.limiteDeDrones = limiteDeDrones;
    }

    public void agregarDron(Dron dron){
        if (drones.size() == limiteDeDrones) {
            throw new RuntimeException("Supera la cantidad máxima definida por la ciudad");
        } 
        drones.add(dron);
    }

    public Boolean puedeOperarEn(Zona zona){
        return drones.stream().anyMatch(d -> d.esAvanzado()) && capacidadOperativa() > 2 * zona.getTamanioTotal();
    }

    public Double capacidadOperativa(){
        return drones.stream().mapToDouble(d -> d.eficienciaOperativa()).sum();
    }
    

    //Un escuadrón puede operar sobre una zona determinada si lleva al menos 1 dron avanzado y si la capacidad operativa del escuadrón supera al doble tamaño total de la de la zona.

    /*
    esto es un comentario
 */

    

}
