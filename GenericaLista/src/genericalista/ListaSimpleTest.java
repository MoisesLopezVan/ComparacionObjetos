/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

import java.util.Scanner;

/**
 *
 * @author MoisesDario
 */
public class ListaSimpleTest {
    
    public static void main(String [] args){

      Scanner sc = new Scanner(System.in);
                       
        Lista<Automovil> listaAutomovil = new Lista<>();
        int elementos = 0;
        String marca;
        String color;
        int anio;
        Automovil auto = null;
        
        //Primer Impelementacion
        System.out.println("Cantidad de Automoviles a ingresar: ");
        elementos = sc.nextInt();
        
        for( int i=0; i < elementos; i++){
        	
        	sc.nextLine();
            System.out.print("\nIngrese una marca: ");
            marca = sc.nextLine();
            
            System.out.print("\nIngrese un color: ");
            color = sc.nextLine();
            
            System.out.print("\nIngrese el anio del Automoviles: ");
            anio = sc.nextInt();
            
            auto = new Automovil(marca,color,anio);
            System.out.println("\nSe anadio el Automovi: " + listaAutomovil.add(auto));
            
        }
        
        // Por defecto cada que añadimos un automovil ( add(T obj) ) la lista se auto-ordena
        System.out.println("\nLista Automoviles ordenada: \n" + listaAutomovil);
        
        listaAutomovil.remove(0);
        System.out.println("\nLista Automoviles, sin el primer Automovil: \n" + listaAutomovil);
        
        Automovil buscarAutomovil = new Automovil("honda", "cafe", 2012);
        
        System.out.println(
        		"\nSi existe un vehiculo anio 2012, se muestra: \n"
        		+ listaAutomovil.existeObj(buscarAutomovil)
        );
       
        listaAutomovil.clear();
        System.out.println("\nLista Automoviles que deberia estar vacia: \n" + listaAutomovil);
    }
}
