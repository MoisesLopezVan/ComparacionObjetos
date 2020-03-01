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
    
    public Automovil(String m, String c) {
        marca = m;
        color = c;
    }

   @Override
    public int compareTo(Automovil a) {
        //return this.marca-a.marca;
        return getMarca().compareTo(a.getMarca());
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString(){
        return marca + " - " + color;
    }
    
    
}
