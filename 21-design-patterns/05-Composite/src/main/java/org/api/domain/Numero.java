package org.api.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Numero implements Expressao {

    private final double valor;

    public Numero(double valor) {
        this.valor = valor;
    }


    @Override
    public double calcular() {
        return this.valor;
    }
}
