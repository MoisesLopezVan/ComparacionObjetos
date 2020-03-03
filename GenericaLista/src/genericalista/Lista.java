   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author MoisesDario
 */
public class Lista<T extends Comparable<T>> {
    private Node<T> head;
    private int listCount;
    
    public Lista(){
        head = new Node<>(null);
        listCount= 0;
    }
   
    public boolean add(T data){
    	
        try {
			Node<T> temp = new Node<>(data);
			Node<T> current = head;
			
			while(current.getNext() != null){
			    current = current.getNext();
			    //System.out.println("recorriendo: " + Current.data);
			}
			current.setNext(temp);
			listCount++;
			
			this.ordenarLista(); // Para que siempre se este ordenando automaticamente.
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
        
    }
    
    public T existeObj(T obj) {

    	Node<T> current = head;
    	while(current.getNext() != null){
    		
    		if (current.getNext().getData().compareTo(obj) == 0) {
				return current.getNext().getData();
			}
    		
            current = current.getNext();
        }
    	
    	return null;
    	
    }
    
    public void ordenarLista() {
    	
    	for(int i= ( size() - 1 ); i > 0; i--){
				
            for(int j = 0; j < i; j++){
         	   
         	   Node<T> nodoSiguiente = this.getNodo(j + 1);
         	   Node<T> nodoActual = this.getNodo(j);
         	   
         	   T datoSiguiente = nodoSiguiente.getData();
         	   T datoActual = nodoActual.getData();
         	  
                if(datoSiguiente.compareTo(datoActual) < 0) {
             	   
             	   nodoActual.setData(datoSiguiente);
             	   nodoSiguiente.setData(datoActual);
                }
            }
    	}
    }
    
    public T get(int index){
        if(index < 0 || index > (listCount -1) ){
            return null;
        }
        Node<T> Current = head.getNext();
        for(int i = 0; i<index; i++){
            if(Current.getNext() == null){
                return null;
            }
            Current = Current.getNext();          
        }
        return Current.getData();
    } 
    
    public Node<T> getNodo(int index){
        if(index < 0 || index > (listCount -1) ){
            return null;
        }
        Node<T> Current = head.getNext();
        for(int i = 0; i<index; i++){
            if(Current.getNext() == null){
                return null;
            }
            Current = Current.getNext();          
        }
        return Current;
    } 
    
    public boolean remove(int index)
    // remueve el elemento en la posiciï¿½n indicada
    {
        // 
        if (index < 0 || index > (size() - 1) )
            return false;
        
        Node<T> Current = head;
        for (int i = 0; i < index; i++) {
            if (Current.getNext() == null)
                return false;
             Current = Current.getNext();
        }
        Current.setNext(Current.getNext().getNext());
        listCount--; // disminuimos el contador de nodos
        return true;
    }
 
    // returns the number of elements in this list.
      public int size() {
        return this.listCount;
    }
      
   public boolean clear() {
	   head.setNext(null);
	   
	   if (head.getNext() == null) 
		   return true;
	   
	   return false;
   }
 
    public String toString() {
        Node<T> Current = head.getNext();
        String output = "";
        while (Current != null) {
            output += "[" + Current.getData().toString() + "]";
            Current = Current.getNext();
        }
        return output;
    }

}
