package fabricas;

import bebidas.Bebida;
import bebidas.MilkShake;
import comidas.Comida;
import comidas.Hamburguer;

public class HamburgueriaFactory implements DeliveryFactory{
    @Override
    public Comida criaComida() {
        return new Hamburguer();
    }

    @Override
    public Bebida criaBebida() {
        return new MilkShake();
    }
}
