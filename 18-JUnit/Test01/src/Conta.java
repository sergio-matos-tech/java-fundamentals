public class Conta {
    private float saldo;
    private String estado;
    private Cliente cliente;

    public Conta() {
        this.saldo = 0;
        this.estado = "PRATA";
        this.cliente = new Cliente();
    }

    public void depositar(float quantia) {
        if (quantia <= 0) return;

        if (estado.equals("OURO")) {
            this.saldo += quantia * 1.01f;
        } else {
            this.saldo += quantia;
        }

        atualizarEstado();
    }

    public boolean sacar(float quantia) {
        if (quantia <= 0) return false;

        if (estado.equals("VERMELHO")) {
            return false;
        }

        if (estado.equals("PRATA")) {
            this.saldo -= (quantia + 2);
        } else {
            this.saldo -= quantia;
        }

        atualizarEstado();
        return true;
    }

    public void atualizarEstado() {
        if (saldo < 0) {
            estado = "VERMELHO";
        } else if (saldo <= 1000) {
            estado = "PRATA";
        } else {
            estado = "OURO";
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public String getEstado() {
        return estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
