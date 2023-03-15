package com.mycompany.aulaestruturas;

/**
 * 
 * 1.Imprima a soma de todos os números pares de 1 a 1000;
 * 
 * @author Gustavo H. Nava
 * 
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
        
        int soma = 0;
        
        for (int i = 1; i <= 1000; i++) {
            if (i%2 == 0) {
                soma+=i;
            }
        }
        
        System.out.println(soma);
    }
}
