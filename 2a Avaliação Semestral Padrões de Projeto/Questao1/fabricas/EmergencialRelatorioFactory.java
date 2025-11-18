package logistica.fabricas;

import logistica.modelos.RelatorioEmergencial;
import logistica.relatorios.Relatorio;

// Fábrica Concreta para Relatório Emergencial
public class EmergencialRelatorioFactory extends RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
}