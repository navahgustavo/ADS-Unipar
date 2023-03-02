package com.mycompany.triangulo;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o valor da base em cm: ");
        base = ler.nextInt();
        System.out.println("Informe o valor da altura em cm: ");
        altura = ler.nextInt();
        
        area = (base*altura)/2;
        
        System.out.println("A área do triângulo em cm²: "+area);
        System.out.println("A área do triângulo em m²: "+area*0.01);
    }
}