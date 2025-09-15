package org.api.factory;

import org.api.calculator.PriceCalculator;
import org.api.calculator.base.SubtotalCalculator;
import org.api.calculator.decorators.*;

public class ProductFactory {

    /**
     * BasicBR = Subtotal + ICMS + Arredondamento + Auditoria
     * A ordem de "empilhamento" (wrapping) é a inversa da ordem de cálculo.
     * O cálculo flui "de dentro para fora".
     *
     * Minha interpretação de "Auditoria": logar os passos parciais.
     * Por isso, vou "polvilhar" o AuditoriaDecorator entre os passos.
     */
    public static PriceCalculator createBasicBR() {
        PriceCalculator calc = new SubtotalCalculator();
        calc = new AuditoriaDecorator(calc, "Subtotal"); // Loga o subtotal
        calc = new ICMSDecorator(calc);
        calc = new AuditoriaDecorator(calc, "Após ICMS"); // Loga após ICMS
        calc = new ArredondamentoDecorator(calc);
        calc = new AuditoriaDecorator(calc, "Final (Arredondado)"); // Loga o final
        return calc;
    }

    /**
     * PromoBR = Subtotal + Cupom + ICMS + Arredondamento + Auditoria
     * "A ordem importa": O cupom é aplicado ANTES do imposto.
     */
    public static PriceCalculator createPromoBR() {
        PriceCalculator calc = new SubtotalCalculator();
        calc = new AuditoriaDecorator(calc, "Subtotal");
        calc = new CouponDecorator(calc); // Aplicando cupom primeiro
        calc = new AuditoriaDecorator(calc, "Após Cupom");
        calc = new ICMSDecorator(calc); // ICMS é sobre o valor com desconto
        calc = new AuditoriaDecorator(calc, "Após ICMS");
        calc = new ArredondamentoDecorator(calc);
        calc = new AuditoriaDecorator(calc, "Final (Arredondado)");
        return calc;
    }

    /**
     * FullBR = Subtotal + Cupom + Lealdade + ICMS + Frete + Arredondamento + Auditoria
     */
    public static PriceCalculator createFullBR() {
        // Regras de frete (poderiam vir de um config)
        final String FIXED_SHIPPING = "15.00";
        final String FREE_SHIPPING_THRESHOLD = "200.00";

        PriceCalculator calc = new SubtotalCalculator();
        calc = new AuditoriaDecorator(calc, "Subtotal");
        calc = new CouponDecorator(calc);
        calc = new AuditoriaDecorator(calc, "Após Cupom");
        calc = new LealdadeDecorator(calc);
        calc = new AuditoriaDecorator(calc, "Após Lealdade");
        calc = new ICMSDecorator(calc);
        calc = new AuditoriaDecorator(calc, "Após ICMS");
        // O frete é calculado sobre o valor com impostos, mas antes do arredondamento
        calc = new FreteDecorator(calc, FIXED_SHIPPING, FREE_SHIPPING_THRESHOLD);
        calc = new AuditoriaDecorator(calc, "Após Frete");
        calc = new ArredondamentoDecorator(calc);
        calc = new AuditoriaDecorator(calc, "Final (Arredondado)");
        return calc;
    }
}
