package org.api.teste;


import org.api.domain.Expressao;
import org.api.domain.Negacao;
import org.api.domain.Numero;
import org.api.domain.operacoes.*;

public class Teste {
    public static void main(String[] args) {
        System.out.println("Tarefa 07 - Composite");
        System.out.println("=======================");

        // a) 0
        Expressao expA = new Numero(0);
        System.out.println("a) Resultado de '0': " + expA.calcular());

        // b) 1+2
        Expressao expB = new Soma(new Numero(1), new Numero(2));
        System.out.println("b) Resultado de '1 + 2': " + expB.calcular());

        // c) 1 * (2 + 3)
        Expressao expC = new Multiplicacao(
                new Numero(1),
                new Soma(new Numero(2), new Numero(3))
        );
        System.out.println("c) Resultado de '1 * (2 + 3)': " + expC.calcular());

        // d) (2 * 3) + (4 / (5 - 3))
        Expressao expD = new Soma(
                new Multiplicacao(new Numero(2), new Numero(3)),
                new Divisao(
                        new Numero(4),
                        new Subtracao(new Numero(5), new Numero(3))
                )
        );
        System.out.println("d) Resultado de '(2 * 3) + (4 / (5 - 3))': " + expD.calcular());

        // e) (-1 * 2) ^ 5
        Expressao expE = new Potencia(
                new Multiplicacao(new Negacao(new Numero(1)), new Numero(2)),
                new Numero(5)
        );
        System.out.println("e) Resultado de '(-1 * 2) ^ 5': " + expE.calcular());
    }
}
