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
    
    public int orden(Lista<T>a, T b, boolean d){      
       int iter=0;

       for(int i=1; i <= a.size()-1; i++){
            a = (Lista<T>) a.get(i);
            int menorcito = i;
           for(int j = (i+1); i < a.size(); i++){
                b = a.get(j);
                if(b.compareTo(a.get(i)) == 0){
                    a = (Lista<T>) a.get(j);
                    menorcito = j;
                    if(d)
                         System.out.println("Iteraciones: " + iter);
                    return i;
                }  
           }          
           /*if(d)
                iter++;*/
       }  
       if(d)
            System.out.println("Iteraciones: " + iter);
       return -1;
    }
}
