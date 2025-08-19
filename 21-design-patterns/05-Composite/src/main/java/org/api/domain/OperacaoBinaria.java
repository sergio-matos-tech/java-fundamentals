package org.api.domain;

public abstract class OperacaoBinaria implements Expressao {

    protected final Expressao esquerda;
    protected final Expressao direita;

    public OperacaoBinaria(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public abstract double calcular();
}
