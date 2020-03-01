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
public class Ordenamiento<T extends Comparable<T>> {
    
    public Lista<T> orden(Lista<T>a){      
       int iter=0;

       for(int i=1; i < a.size()-1; i++){
            T menor = a.get(i);
            int menorcito = i;
           for(int j = (i+1); j < a.size(); i++){
                T b = a.get(j);
                if(b.compareTo(menor) < 0){
                    menor = a.get(j);
                    menorcito = j;
                    /*if(d)
                         System.out.println("Iteraciones: " + iter);
                    return i;*/
                }  
           }    
           T temporal = a.get(i);
           a.ObjectPosicion(menor,i);
           a.ObjectPosicion(temporal,menorcito);
           /*if(d)
                iter++;*/
       }  
       return a;
    }
}
