package com.mycompany.triangulo;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        int base, altura, area;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o valor da base: ");
        base = ler.nextInt();
        System.out.println("Informe o valor da altura: ");
        altura = ler.nextInt();
        
        area = (base*altura)/2;
        
        System.out.println("A área do triângulo é: "+area);
    }
}