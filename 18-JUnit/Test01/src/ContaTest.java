import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    @Test
    void estadoInicialEhPrata() {
        Conta conta = new Conta();
        assertEquals("PRATA", conta.getEstado());
        assertEquals(0, conta.getSaldo());
    }

    @Test
    void depositoMudaParaOuro() {
        Conta conta = new Conta();
        conta.depositar(1500);
        assertEquals("OURO", conta.getEstado());
    }

    @Test
    void saqueComTaxaNoEstadoPrata() {
        Conta conta = new Conta();
        conta.depositar(500);
        boolean sucesso = conta.sacar(100);
        assertTrue(sucesso);
        assertEquals(398, conta.getSaldo());
    }

    @Test
    void saqueSemTaxaNoEstadoOuro() {
        Conta conta = new Conta();
        conta.depositar(1500);
        boolean sucesso = conta.sacar(500);
        assertEquals(1000, conta.getSaldo(), 0.01);
    }

    @Test
    void naoSacaNoEstadoVermelho() {
        Conta conta = new Conta();
        conta.sacar(100); 
        assertEquals("VERMELHO", conta.getEstado());
        boolean sucesso = conta.sacar(50);
        assertFalse(sucesso);
    }

    @Test
    void depositoNoEstadoVermelho() {
        Conta conta = new Conta();
        conta.sacar(50);
        assertEquals("VERMELHO", conta.getEstado());
        conta.depositar(60);
        assertTrue(conta.getSaldo() > 0);
        assertEquals("PRATA", conta.getEstado());
    }

    @Test
    void rendimentoNoEstadoOuro() {
        Conta conta = new Conta();
        conta.depositar(1500);
        conta.depositar(100);
        assertEquals(1601, conta.getSaldo(), 0.01);
    }
}
