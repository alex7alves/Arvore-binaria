/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package árvore_binária;

import java.util.ArrayList;

/**
 *
 * @author Alex Alves
 */
public class ÁrvoreBinária {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cria arvore 
        Arvore<Integer> arvore = new Arvore<>(1);
        arvore.Inserir(2);
        arvore.Inserir(3);
        arvore.Inserir(4);
        arvore.Inserir(5);
        arvore.Inserir(7);
        
        System.out.println(arvore.toString());
    }
    
}
