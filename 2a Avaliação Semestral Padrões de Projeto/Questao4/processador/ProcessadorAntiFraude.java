package antifraude.processador;

import antifraude.modelo.Transacao;

// A interface Handler
public interface ProcessadorAntifraude {
    void setProximo(ProcessadorAntifraude proximo);
    void processar(Transacao transacao);
}