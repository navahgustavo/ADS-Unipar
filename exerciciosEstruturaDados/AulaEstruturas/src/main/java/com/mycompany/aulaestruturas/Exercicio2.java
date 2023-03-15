
package com.mycompany.aulaestruturas;

/**
 * 
 * 2. Imprima a soma de todos os números primos de 1 a 1000;
 * 
 * @author Gustavo H. Nava
 * 
 */
public class Exercicio2 {

    public static void main(String[] args) {
        
        int cont = 0;
        int soma = 0;
        
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%j == 0) {
                    cont++;
                }
            }
            if (cont == 2 || cont == 1) {
                soma+=i;
            }
            cont = 0;
        }
        System.out.println(soma);
    }
}
