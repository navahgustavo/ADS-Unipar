package com.mycompany.aulaheranca;

import java.util.Date;

/**
 * @author Gustavo H Nava
 */

public class Aluno extends Pessoa {
    public Aluno (String _nome, String _cpf, Date _data) {
        super (_nome, _cpf, _data);
    }
    public String matricula;    
}