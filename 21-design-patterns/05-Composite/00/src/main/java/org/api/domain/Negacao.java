package org.api.domain;

public class Negacao implements Expressao {

    private final Expressao expressao;

    public Negacao(Expressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public double calcular() {
        return -expressao.calcular();
    }
}
