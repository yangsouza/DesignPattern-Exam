package antifraude.verificacoes;

import antifraude.modelo.Transacao;
import antifraude.processador.ProcessadorBase;

public class VerificacaoGeolocalizacao extends ProcessadorBase {
    @Override
    protected void executarVerificacao(Transacao transacao) {
        System.out.print("2. Verificando geolocalização... ");
        // Simulação: Rejeita se o valor for de um país de risco (ex: 'Risco-A')
        if (transacao.getGeolocalizacao().equals("Risco-A")) {
            transacao.reprovar("Geolocalização de alto risco.");
            System.out.println("FALHA.");
        } else {
            System.out.println("OK.");
        }
    }
}