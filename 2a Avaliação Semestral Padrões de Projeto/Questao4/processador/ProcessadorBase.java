package antifraude.processador;

import antifraude.modelo.Transacao;

// A classe Handler Base (Abstract Handler)
public abstract class ProcessadorBase implements ProcessadorAntifraude {
    
    protected ProcessadorAntifraude proximo;
    
    @Override
    public void setProximo(ProcessadorAntifraude proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processar(Transacao transacao) {
        // Verifica se a transação já foi reprovada por um processador anterior.
        // Se sim, para a cadeia imediatamente.
        if (!transacao.isAprovada()) {
            System.out.println("   [CHAIN] Processamento interrompido. Motivo: " + transacao.getMotivoReprovacao());
            return;
        }

        // Executa a lógica de verificação da subclasse.
        executarVerificacao(transacao);

        // Se a transação ainda estiver aprovada, passa para o próximo.
        if (transacao.isAprovada() && proximo != null) {
            proximo.processar(transacao);
        }
    }
    
    protected abstract void executarVerificacao(Transacao transacao);
}