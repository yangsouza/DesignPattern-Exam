package logistica.modelos;

import logistica.relatorios.Relatorio;

public class RelatorioEmergencial implements Relatorio {
    @Override
    public void prepararDados() {
        System.out.println("-> [Emergencial] Coletando dados em tempo real sobre o incidente crítico.");
    }

    @Override
    public void formatar() {
        System.out.println("-> [Emergencial] Formatando em alerta vermelho e envio de SMS.");
    }

    @Override
    public void emitir() {
        System.out.println("-> [Emergencial] Relatório Emergencial emitido! Prioridade: ALTÍSSIMA.");
    }
}