package com.mycompany.cadastrocachorro;

import java.util.Scanner;
/**
 * @author Gustavo H. Nava
 */
public class CadastroCachorro {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Cachorro [] cao = new Cachorro[5];
        
        String nome;
        String raca;
        int idade;
        int peso;
        int tamanho;
        boolean sexo = true;
        
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do cachorro: ");
            nome = ler.next();
            System.out.println("Informe a raça do cachorro: ");
            raca = ler.next();
            System.out.println("Informe a idade do cachorro: ");
            idade = ler.nextInt();
            System.out.println("Informe o peso do cachorro (em g):");
            peso = ler.nextInt();
            System.out.println("Informe o tamanho do cachorro (em cm):");
            tamanho = ler.nextInt();
            int escolha = -1;
            while (escolha == -1) {
                System.out.println("Informe '0' se o cachorro for macho ou '1' se for fêmea: ");
                escolha = ler.nextInt();
                switch (escolha) {
                    case 0:
                        sexo = true;
                        break;
                    case 1:
                        sexo = false;
                        break;
                    default:
                        escolha = -1;
                        break;
                }
            }
            cao[i] = new Cachorro(nome, raca, idade, peso, tamanho, sexo);
            System.out.println("---------------------------------------------------------");
        }
        
        System.out.println("");
        System.out.println("||--|| Lista Cachorros ||--||");
        for (int i = 0; i < 5; i++) {
            System.out.println("---------------------------------------------------------");
            System.out.println("Nome:\t"+cao[i].getNome());
            System.out.println("Raça:\t"+cao[i].getRaca());
            System.out.println("Idade:\t"+cao[i].getIdade());
            System.out.println("Peso:\t"+cao[i].getPeso()+"g");
            System.out.println("Tam.:\t"+cao[i].getTamanho()+"cm");
            if (cao[i].isSexo() == true) {
                System.out.println("Sexo:\tMacho");
            } else {
                System.out.println("Sexo:\tFêmea");
            }
            cao[i].latir();
        }
        
    }
}
