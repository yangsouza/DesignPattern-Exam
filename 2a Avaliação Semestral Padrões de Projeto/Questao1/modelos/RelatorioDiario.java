package logistica.modelos;

import logistica.relatorios.Relatorio;

public class RelatorioDiario implements Relatorio {
    @Override
    public void prepararDados() {
        System.out.println("-> [Diário] Coletando dados de desempenho e entregas do último dia.");
    }

    @Override
    public void formatar() {
        System.out.println("-> [Diário] Formatando em formato tabular simples.");
    }

    @Override
    public void emitir() {
        System.out.println("-> [Diário] Relatório Diário emitido. Prioridade: Baixa.");
    }
}