package com.mycompany.aulaheranca;

import java.util.Date;

/**
 *
 * @author Gustavo H. Nava
 */
public class Zelador extends Funcionario{
    String setor;
    public Zelador  (String _nome, String _cpf, Date _data, String _setor) {
        super(_nome, _cpf, _data);
        setor = _setor;
        cargo = "Zelador";
    }
}
