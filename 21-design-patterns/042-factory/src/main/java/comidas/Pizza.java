package comidas;

public class Pizza implements Comida {
    @Override
    public void removeIntegrediente(String nome) {
        System.out.printf("Removido o ingrediente %s da pizza", nome);
    }
}
