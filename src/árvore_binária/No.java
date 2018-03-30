/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package árvore_binária;

/**
 *
 * @author Alex Alves
 */
public class No< T extends Comparable<T>> implements Comparable<T>{
    T valor;
    
    No<T> pai,esquerdo,direito;

    @Override
    public int compareTo(T o) {
       return valor.compareTo(o);
    }
    public No(T valor){
        this.valor =valor;
        pai=null;
        esquerdo=null;
        direito=null;
    }
    public No(T valor, No<T> p){
        this.valor =valor;
        pai=p;
        esquerdo=null;
        direito=null;
    }
    public void setPai(No<T> pai){
        this.pai=pai;
    }
    public void setDireito(No<T> direito){
        this.direito=direito;
    }
    public void setEsquerdo(No<T> esquerdo){
        this.esquerdo=esquerdo;
    }
    public void setvalor(T valor){
        this.valor =valor;
    }
    public No<T> getPai(){
        return pai;
    }
     public No<T> getDireito(){
        return direito;
    }
      public No<T> getEsquerdo(){
        return esquerdo;
    }
    public T getvalor(){
        return valor;
    }  
}
