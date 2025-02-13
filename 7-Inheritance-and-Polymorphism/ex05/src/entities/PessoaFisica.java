package entities;

public class PessoaFisica extends Pessoa {
    private String CPF;
    private Double gastosComSaude;

    public PessoaFisica(String nome, String endereco, Double rendaAnual, String CPF, Double gastosComSaude) {
        super(nome, endereco, rendaAnual);
        this.CPF = CPF;
        this.gastosComSaude = gastosComSaude;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double calcularImpostoDeRenda2024()
    {
        if (getRendaAnual() <= 27110.40) {
            return 0.0;
        } else if (getRendaAnual() <= 33919.80) {
            return (getRendaAnual() * 0.075) - gastosComSaude - 2033.28;
        } else if (getRendaAnual() <= 45012.60) {
            return (getRendaAnual() * 0.15) - gastosComSaude - 4577.28;
        } else if (getRendaAnual() <= 55976.16) {
            return (getRendaAnual() * 0.225) - gastosComSaude - 7953.24;
        } else {
            return (getRendaAnual() * 0.275) - gastosComSaude - 10752.00;
        }

    }
}
