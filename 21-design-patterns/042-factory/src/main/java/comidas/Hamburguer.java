package comidas;

public class Hamburguer implements Comida {

    @Override
    public void removeIntegrediente(String nome) {
        System.out.printf("Removido o ingrediente %s do hamburguer", nome);
    }
}
