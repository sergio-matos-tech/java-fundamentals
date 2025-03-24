package domain;

public enum TipoCliente {
    PESSOA_FISICA(1) {
        @Override
        Double calcularDesconto(Double valor) {
            return valor * 0.1;
        }
    },
    PESSOA_JURIDICA(2) {
        @Override
        Double calcularDesconto(Double valor) {
            return valor * 0.05;
        }
    };

    private final int valor;

    TipoCliente(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    abstract Double calcularDesconto(Double valor);
}
