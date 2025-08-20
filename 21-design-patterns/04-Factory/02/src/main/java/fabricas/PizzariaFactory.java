package fabricas;

import bebidas.Bebida;
import bebidas.Refrigerante;
import comidas.Comida;
import comidas.Pizza;

public class PizzariaFactory implements DeliveryFactory {

    @Override
    public Comida criaComida() {
        return new Pizza();
    }

    @Override
    public Bebida criaBebida() {
        return new Refrigerante();
    }
}
