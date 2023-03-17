package com.mycompany.cadastrodoguinho;

/**
 *
 * @author Gustavo H. Nava
 */
public class Doguinho {
    
    private String nome;
    private String cor;
    private int tipo;
    private int tamanho;
    private int passatempo;

    public Doguinho(String nome, String cor, int tipo, int tamanho, int passatempo) {
        this.nome = nome;
        this.cor = cor;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.passatempo = passatempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getPassatempo() {
        return passatempo;
    }

    public void setPassatempo(int passatempo) {
        this.passatempo = passatempo;
    }
    
    public void tipoDoguinho () {
        switch (this.tipo) {
                    case 1:
                        System.out.println("Tipo:\t\tDoge");
                        break;
                    case 2:
                        System.out.println("Tipo:\t\tSpecial Doggo");
                        break;
                    case 3:
                        System.out.println("Tipo:\t\tWrinkler");
                        break;
                    case 4:
                        System.out.println("Tipo:\t\tShoob");
                        break;    
                    case 5:
                        System.out.println("Tipo:\t\tLong Doggo");
                        break;
                    case 6:
                        System.out.println("Tipo:\t\tPuggo");
                        break;
        }
    }
    
    public void tamanhoDoguinho () {
        switch (this.tamanho) {
                    case 1:
                        System.out.println("Tamanho:\tYapper");
                        break;
                    case 2:
                        System.out.println("Tamanho:\tPupper");
                        break;
                    case 3:
                        System.out.println("Tamanho:\tDoggo");
                        break;
                    case 4:
                        System.out.println("Tamanho:\tWoofer");
                        break;    
                    case 5:
                        System.out.println("Tamanho:\tFloofer");
                        break;
        }
    }
    
    public void passatempoDoguinho () {
        switch (this.passatempo) {
                    case 1:
                        System.out.println("Passatempo:\tAqua Doggo");
                        break;
                    case 2:
                        System.out.println("Passatempo:\tBamboozled");
                        break;
                    case 3:
                        System.out.println("Passatempo:\tDoin Me a Frighten");
                        break;
                    case 4:
                        System.out.println("Passatempo:\tTrash Boye");
                        break;    
                    case 5:
                        System.out.println("Passatempo:\tVery Fast Doggo Running at Incredible High Speed");
                        break;
        }
    }
}
