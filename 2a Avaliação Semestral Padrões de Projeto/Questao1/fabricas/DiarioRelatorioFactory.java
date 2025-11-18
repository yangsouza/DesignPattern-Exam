package logistica.fabricas;

import logistica.modelos.RelatorioDiario;
import logistica.relatorios.Relatorio;

// Fábrica Concreta para Relatório Diário
public class DiarioRelatorioFactory extends RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioDiario();
    }
}