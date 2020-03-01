/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericalista;

import java.util.Scanner;

/**
 *
 * @author MoisesDario
 */
public class ListaSimpleTest {
    
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
                       
        Lista<Automovil> listaAutomovil = new Lista<>();
        Ordenamiento<Automovil> buscaAutomovil = new Ordenamiento<>();
        int elementos;
        
        //Primer Impelementacion
        //System.out.println("Cuantos elementos desee ingresar: ");
        //elementos = sc.nextInt();
        
        System.out.print("Ingrese una marca: ");
        String marca = sc.nextLine();
        System.out.print("Ingrese un color: ");
        String color = sc.nextLine();
        Automovil buscar = new Automovil(marca,color);
        listaAutomovil.add(buscar);
        System.out.println("Resultado: "+marca.compareTo(color));
        int S = marca.compareTo(color);

        if(S < 0){
            System.out.println(marca + " es mas alto que " + color);
        }else{
           if(S == 0){
                System.out.println(marca + " es igual que " + color);
           }else{
               if(S < 0){
                    System.out.println(marca + " es menor que " + color);
               }
           }
        } 
        System.out.println("Lista de Automovil Actual: " + listaAutomovil);
        System.out.println("Elementos: " + listaAutomovil.size()); 
        System.out.println("Posicion encontrado: " + buscaAutomovil.orden(listaAutomovil,buscar, true));
     
        
        //Segunda Impelementacion
       /* Automovil f1= new Automovil("Nisann" , "verde");
        Automovil f2= new Automovil("Toyota" , "blanco");
        Automovil f3= new Automovil("Pastrana" , "blanco");
        Automovil f4= new Automovil("Dodge" , "blanco");
        Automovil f5= new Automovil("Chevrolet" , "verde");
        
        listaAutomovil.add(f1);
        listaAutomovil.add(f3);
        listaAutomovil.add(f4);
        listaAutomovil.add(f2);
        listaAutomovil.add(f5);*/
        
        //System.out.println("sList.remove(2) - remove 2nd element: " + listaAutomovil.remove(2));
        //System.out.println("Lista de Automovil Reciente: " + listaAutomovil);
        /*System.out.println("Resultado: "+f1.compareTo(f2));
        
        int S = f1.compareTo(f2);
        
        if(S < 0){
            System.out.println(f1 + " es mas alto que " + f2);
        }else{
           if(S == 0){
                System.out.println(f1 + " es igual que " + f2);
           }else{
               if(S < 0){
                    System.out.println(f1 + " es menor que " + f2);
               }
           }
        }*/

 
       
    }
}
