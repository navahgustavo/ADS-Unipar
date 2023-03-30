package com.mycompany.aulaheranca;

import java.util.Date;

/**
 * @author Gustavo H Nava
 */

public class Pessoa {
    public String nome;
    public String cpf;
    public Date data_nascimento;

    public Pessoa(String _nome, String _cpf, Date _data) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
    }
}