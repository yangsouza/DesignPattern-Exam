package antifraude.verificacoes;

import antifraude.modelo.Transacao;
import antifraude.processador.ProcessadorBase;

public class VerificacaoDispositivoIncomum extends ProcessadorBase {
    @Override
    protected void executarVerificacao(Transacao transacao) {
        System.out.print("3. Verificando dispositivo incomum... ");
        // Simulação: Rejeita se o ID for 'DISP-FAKE'
        if (transacao.getDispositivoId().equals("DISP-FAKE")) {
            transacao.reprovar("Dispositivo nunca antes utilizado ou falsificado.");
            System.out.println("FALHA.");
        } else {
            System.out.println("OK.");
        }
    }
}