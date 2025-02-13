package entities;

public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private Integer numeroDeFuncionarios;

    public PessoaJuridica(String nome, String endereco, Double rendaAnual, Integer numeroDeFuncionarios, String CNPJ) {
        super(nome, endereco, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
        this.CNPJ = CNPJ;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double calcularImpostoDeRenda2024()
    {
        double renda = getRendaAnual();
        boolean temMaisDe100Funcionarios = numeroDeFuncionarios > 100;

        double imposto = 0.0;
        if (renda <= 180000) {
            imposto = renda * 0.06;
        } else if (renda <= 360000) {
            imposto = renda * 0.112;
        } else if (renda <= 720000) {
            imposto = renda * 0.135;
        } else if (renda <= 1800000) {
            imposto = renda * 0.16;
        } else if (renda <= 3600000) {
            imposto = renda * 0.21;
        } else {
            imposto = renda * 0.30;
        }

        if (temMaisDe100Funcionarios) {
            // Desconto de 5% no imposto para empresas com mais de 100 funcionários
            imposto -= imposto * 0.05;
        }

        return imposto;
    }
}
