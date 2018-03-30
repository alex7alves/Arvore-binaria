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
public class Arvore< T extends Comparable<T>>{
    private No<T> raiz;
    
    public Arvore(){
        raiz =null;
    }
    public void setRaiz(No<T> raiz){
        this.raiz = raiz;
    }
    
    public No<T> getRaiz(){
        return raiz;
    }
    public No<T> Inserir(T valor){
        No<T> no = new No(valor);
        
        if(raiz == null){
            raiz = no;
            return raiz;
        }else {
            return InserirNo(no, raiz);
        }
    }
    private No<T> InserirNo(No<T> no,No<T> subarvore){
        // Menor que a raiz
        if(subarvore.compareTo(no.getvalor())>=0){
            No<T> esq = subarvore.getEsquerdo();
            if(esq==null){
                subarvore.setEsquerdo(esq);
                no.setPai(subarvore);
            }else {
                // Se ja tem no e eh menor continua recursivamente pra esquerda
                return InserirNo(no,esq);
            }
        }else {
            // Maior que a raiz
             No<T> dir = subarvore.getDireito();
            if(dir==null){
                subarvore.setDireito(dir);
                no.setPai(subarvore);
            }else {
                // Se ja tem no e eh maior continua recursivamente pra direita
                return InserirNo(no,dir);
            }
        }
        return no;
    }
    public No<T> Buscar(T valor){
        if(raiz ==null){
            return null;
        }else{
            return Buscar(valor,raiz);
        }
    }
    private No<T> Buscar(T valor,No<T> subarvore){
        
        int compara = subarvore.compareTo(valor);
        if(compara ==0){
            return subarvore;
        }else if(compara >0){
            return Buscar(valor,subarvore.getEsquerdo());
        }else if(compara <0){
            return Buscar(valor,subarvore.getDireito());
        }
        return subarvore;
    }
    
}
