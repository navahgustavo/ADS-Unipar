package com.mycompany.aluno;

import java.util.Scanner;

/**
 *
 * @author Gustavo H. Nava
 */
public class Aluno {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        char sexo;
        
        System.out.println("Informe o nome do aluno: ");
        nome = ler.next();
        System.out.println("Informe o sexo do aluno: ");
        sexo = ler.next().charAt(0);
        sexo = Character.toUpperCase(sexo);
        
        System.out.println("");
        switch (sexo) {
            case 'F':
                System.out.println("Aluno: "+nome+"\nSexo: Feminino");
                break;
            case 'M':
                System.out.println("Aluno: "+nome+"\nSexo: Masculino");
                break;
            default:
                System.out.println("Aluno: "+nome+"\nSexo: Programador");
                break;
        }
    }
}
