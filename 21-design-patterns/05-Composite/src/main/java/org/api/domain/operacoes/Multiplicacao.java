package org.api.domain.operacoes;


import org.api.domain.Expressao;
import org.api.domain.OperacaoBinaria;

public class Multiplicacao extends OperacaoBinaria {

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        super(esquerda, direita);
    }

    @Override
    public double calcular() {
        return esquerda.calcular() * direita.calcular();
    }
}
