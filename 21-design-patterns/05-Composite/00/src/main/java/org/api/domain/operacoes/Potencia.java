package org.api.domain.operacoes;


import org.api.domain.Expressao;
import org.api.domain.OperacaoBinaria;

public class Potencia extends OperacaoBinaria {

    public Potencia(Expressao esquerda, Expressao direita) {
        super(esquerda, direita);
    }

    @Override
    public double calcular() {
        return Math.pow(esquerda.calcular(), direita.calcular());
    }
}
