/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericalista;

/**
 *
 * @author MoisesDario
 */
public class Automovil implements Comparable<Automovil>{
    
    private String marca;
    private String color;
    private int anioVehiculo;
    
    public Automovil(String m, String c, int v) {
        marca = m;
        color = c;
        anioVehiculo = v;
    }

   @Override
    public int compareTo(Automovil a) {
        //return getMarca().compareTo(a.getMarca());
        return this.anioVehiculo - a.getanioVehiculo();
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getanioVehiculo() {
        return anioVehiculo;
    }

    public void setanioVehiculo(int anioVehiculo) {
        this.anioVehiculo = anioVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString(){
        return marca + " - " + color + " - " + anioVehiculo;
    }
    
   
}
