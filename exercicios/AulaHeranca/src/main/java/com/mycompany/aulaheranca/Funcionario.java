package com.mycompany.aulaheranca;

import java.util.Date;

/**
 * @author Gustavo H Nava
 */

public class Funcionario extends Pessoa {
    public Funcionario (String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
    public double salario;
    public Date data_admissao;
    public String cargo;
}
