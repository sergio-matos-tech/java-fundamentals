package org.api.domain.operacoes;

import org.api.domain.Expressao;
import org.api.domain.OperacaoBinaria;


public class Divisao extends OperacaoBinaria {

    public Divisao(Expressao esquerda, Expressao direita) {
        super(esquerda, direita);
    }

    @Override
    public double calcular() {
        double divisor = direita.calcular();
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return esquerda.calcular() / divisor;
    }
}
