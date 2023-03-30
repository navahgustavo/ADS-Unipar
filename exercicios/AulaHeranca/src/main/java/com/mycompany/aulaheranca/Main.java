package com.mycompany.aulaheranca;

import java.util.Date;

/**
 *
 * @author Gustavo H. Nava
 */
public class Main {

    public static void main(String[] args) {
        Aluno i = new Aluno("José Francisco", "123.456.789-00", new Date());
        i.matricula = "123456";
        System.out.println("Veja como os atributos foram cadastrados\n\nNome: " + i.nome);
        System.out.println("CPF: "+ i.cpf);
        System.out.println("Data de Nascimento: " + i.data_nascimento);
        System.out.println("Matricula: " + i.matricula);
        
        System.out.println("");
        
        Professor p = new Professor("Jorge Amado", "321.654.987-00", new Date());
        p.disciplina = "Fisica";
        p.salario = 8654.65;
        System.out.println("Nome: " + p.nome);
        System.out.println("CPF: " + p.cpf);
        System.out.println("Data de Nascimento: " + p.data_nascimento);
        System.out.println("Disciplina: " + p.disciplina);
        System.out.println("Salario: " + p.salario);
        
        System.out.println("");
        
        Funcionario f = new Funcionario("William Boner", "987.654.321-00", new Date());
        f.data_admissao = new Date();
        f.cargo = "Secretário";
        f.salario = 2315.36;
        System.out.println("Nome: " + f.nome);
        System.out.println("CPF: " + f.cpf);
        System.out.println("Data de Nascimento: " + f.data_nascimento);
        System.out.println("Data de Admissao: " + f.data_admissao);
        System.out.println("Cargo: " + f.cargo);
        System.out.println("Salario: " + f.salario);
        
        System.out.println("");
        
        Zelador z = new Zelador("Guilhermo del Toro", "147.258.369-00", new Date(), "B1");
        z.data_admissao = new Date();
        z.salario = 2946.21;
        System.out.println("Nome: " + z.nome);
        System.out.println("CPF: " + z.cpf);
        System.out.println("Data de Nascimento: " + z.data_nascimento);
        System.out.println("Data de Admissao: " + z.data_admissao);
        System.out.println("Cargo: " + z.cargo);
        System.out.println("Salario: " + z.salario);
        System.out.println("Setor: " + z.setor);
    }
    
}
