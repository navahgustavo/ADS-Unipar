
package com.mycompany.areacirculo;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double raio, area;
        
        System.out.println("Informe o raio do círculo: ");
        raio = ler.nextDouble();
        
        area = (raio*raio)*Math.PI; //tentei usar pi valendo 22/7, mas o java arredonda
        
        System.out.printf("A area do círculo é igual a: %.4f",area);
           
    }
}
