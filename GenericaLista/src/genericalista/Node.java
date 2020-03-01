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

public class Node<T>{
    Node<T> next;
    T data;

    public Node(T dataValue){
        next = null;
        data = dataValue;
    }

    public Node (T dataValue, Node<T> nextValue){
        next =  nextValue;
        data = dataValue;
    }

    public T getData(){
        return data;
    }

    public void setData(T dataValue){
        data = dataValue;
    }

    public Node<T> getNext(){
        return next;
    }

    public void setNext(Node<T> nextValue){
        next =  nextValue;
    }
}