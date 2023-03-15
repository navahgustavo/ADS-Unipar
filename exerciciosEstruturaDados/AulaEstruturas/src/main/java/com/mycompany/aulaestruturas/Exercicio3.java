
package com.mycompany.aulaestruturas;

import java.math.BigDecimal;

/**
 * 
 * 3. Calcule e imprima o fatorial de 20;
 * 
 * @author Gustavo H. Nava
 * 
 */
public class Exercicio3 {

    public static void main(String[] args) {
        
        double fator = 1;
        
        for (int i = 20; i > 0; i--) {
            fator = i*fator;
        }
        
        BigDecimal bigFator = new BigDecimal(fator);
        System.out.println(bigFator);
        
    }
    
}
