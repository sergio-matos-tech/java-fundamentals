package clientes;

import bebidas.Bebida;
import comidas.Comida;
import fabricas.DeliveryFactory;

public class Cliente {

    private final DeliveryFactory factory;

    public Cliente(DeliveryFactory factory) {
        this.factory = factory;
    }

    public void criaPedido(String ingrediente) {
        Comida comida = factory.criaComida();
        Bebida bebida = factory.criaBebida();

        comida.removeIntegrediente(ingrediente);
        bebida.escolheSemAcucar();
    }
}
