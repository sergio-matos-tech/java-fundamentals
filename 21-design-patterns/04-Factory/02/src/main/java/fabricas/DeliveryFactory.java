package fabricas;

import bebidas.Bebida;
import comidas.Comida;

public interface DeliveryFactory {

    Comida criaComida();

    Bebida criaBebida();
}
