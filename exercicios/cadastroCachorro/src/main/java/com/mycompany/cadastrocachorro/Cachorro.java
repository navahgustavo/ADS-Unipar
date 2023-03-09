package com.mycompany.cadastrocachorro;

/**
 *
 * @author Gustavo H. Nava
 */
public class Cachorro {
 
    private String nome;
    private String raca;
    private int idade;
    private int peso;
    private int tamanho;
    private boolean sexo;

    public Cachorro(String nome, String raca, int idade, int peso, int tamanho, boolean sexo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.tamanho = tamanho;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    public void latir () {
        System.out.println("\n"+this.nome+" late ");
        if (this.tamanho > 59) {
            System.out.print("Woof Woof\n");
        } else if (this.tamanho > 14) {
            System.out.print("Ruff Ruff\n");
        } else {
            System.out.print("Yipi Yipi\n");
        }
    }
    
}
