package com.mycompany.cadastrodoguinho;

import java.util.Scanner;

/**
 *
 * @author Gustavo H. Nava
 */
public class CadastroDoguinho {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Doguinho [] doge = new Doguinho[5];
        
        String nome;
        String cor;
        int tipo = 0;
        int tamanho = 0;
        int passatempo = 0;
        
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Qual o nome do doguinho: ");
            nome = ler.next();
            System.out.println("Qual a cor: ");
            cor = ler.next();
            System.out.println("Que tipo de doguinho ele é: ");
            int escolha = -1;
            while (escolha == -1) {
                System.out.println(" 1 - Doge\n 2 - Special Doggo\n 3 - Wrinkler\n 4 - Shoob\n 5 - Long Doggo\n 6 - Puggo");
                escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        tipo = 1;
                        break;
                    case 2:
                        tipo = 2;
                        break;
                    case 3:
                        tipo = 3;
                        break;
                    case 4:
                        tipo = 4;
                        break;    
                    case 5:
                        tipo = 5;
                        break;
                    case 6:
                        tipo = 6;
                        break;
                    default:
                        System.out.println("Doguinho inválido.");
                        escolha = -1;
                        break;
                }
            }
            System.out.println("Qual o tamanho do doguinho: ");
            escolha = -1;
            while (escolha == -1) {
                System.out.println(" 1 - Yapper\n 2 - Pupper\n 3 - Doggo\n 4 - Woofer\n 5 - Floofer");
                escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        tamanho = 1;
                        break;
                    case 2:
                        tamanho = 2;
                        break;
                    case 3:
                        tamanho = 3;
                        break;
                    case 4:
                        tamanho = 4;
                        break;    
                    case 5:
                        tamanho = 5;
                        break;
                    default:
                        System.out.println("Tamanho inválido.");
                        escolha = -1;
                        break;
                }
            }
            System.out.println("Qual o passatempo preferido do doguinho: ");
            escolha = -1;
            while (escolha == -1) {
                System.out.println(" 1 - Aqua Doggo\n 2 - Bamboozled\n 3 - Doin Me a Frighten\n 4 - Trash Boye\n 5 - Very Fast Doggo Running at Incredible High Speed");
                escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        passatempo = 1;
                        break;
                    case 2:
                        passatempo = 2;
                        break;
                    case 3:
                        passatempo = 3;
                        break;
                    case 4:
                        passatempo = 4;
                        break;    
                    case 5:
                        passatempo = 5;
                        break;
                    default:
                        System.out.println("Passatempo inválido.");
                        escolha = -1;
                        break;
                }
            }
            doge[i] = new Doguinho(nome, cor, tipo, tamanho, passatempo);
            System.out.println("---------------------------------------------------------");
        }
        
        System.out.println("");
        System.out.println("||--|| Lista Doguinhos ||--||");
        for (int i = 0; i < 5; i++) {
            System.out.println("---------------------------------------------------------");
            System.out.println("Nome:\t\t"+doge[i].getNome());
            System.out.println("Cor:\t\t"+doge[i].getCor());
            doge[i].tipoDoguinho();
            doge[i].tamanhoDoguinho();
            doge[i].passatempoDoguinho();
        }
        System.out.println("---------------------------------------------------------");
    }
}
