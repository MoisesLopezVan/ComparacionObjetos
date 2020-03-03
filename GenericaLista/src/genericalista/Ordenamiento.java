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

          for(int i= ( a.size() - 1 ); i > 0; i--){
               
               for(int j = 0; j < i; j++){
               
                    Node<T> nodoSiguiente = a.getNodo(j + 1);
                    Node<T> nodoActual = a.getNodo(j);
                    
                    T datoSiguiente = nodoSiguiente.getData();
                    T datoActual = nodoActual.getData();
               
                    if(datoSiguiente.compareTo(datoActual) < 0) {
                         
                         nodoActual.setData(datoSiguiente);
                         nodoSiguiente.setData(datoActual);
                    }
               }

          }
          return a;
     }
}
