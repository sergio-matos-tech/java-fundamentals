package application;

import domain.Cliente;
import domain.TipoCliente;
import domain.TipoPagamento;

public class App {
    public static void main(String[] args) {

        Cliente cliente00 = new Cliente("Jocrineia", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente01 = new Cliente("Jubileu", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        String tipoCliente02 = "PESSOA_FISICA";
        String tipoPagamentoCliente02 = "DEBITO";
        Cliente cliente02 = new Cliente("Joaba", TipoCliente.valueOf(tipoCliente02),
                TipoPagamento.valueOf(tipoPagamentoCliente02));

        System.out.println(cliente00);
        System.out.println(cliente01);
        System.out.println(cliente02);

    }
}