package antifraude.verificacoes;

import antifraude.modelo.Transacao;
import antifraude.processador.ProcessadorBase;

public class VerificacaoValorSuspeito extends ProcessadorBase {
    @Override
    protected void executarVerificacao(Transacao transacao) {
        System.out.print("1. Verificando valor suspeito... ");
        if (transacao.getValor() > 5000.00) {
            transacao.reprovar("Valor excede o limite suspeito (R$5000.00)");
            System.out.println("FALHA.");
        } else {
            System.out.println("OK.");
        }
    }
}