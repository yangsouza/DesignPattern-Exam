package logistica.cliente;

import logistica.fabricas.DiarioRelatorioFactory;
import logistica.fabricas.EmergencialRelatorioFactory;
import logistica.fabricas.RelatorioFactory;

public class SistemaLogistica {
    
    public static void main(String[] args) {
        
        // 1. Criação do Relatório Diário
        // O cliente usa a Fábrica Concreta Diária.
        RelatorioFactory fabricaDiaria = new DiarioRelatorioFactory();
        System.out.println("Cliente: Solicitando Relatório Diário...");
        fabricaDiaria.gerarRelatorio(); 
        
        // 2. Criação do Relatório Emergencial
        // O cliente usa a Fábrica Concreta Emergencial.
        RelatorioFactory fabricaEmergencial = new EmergencialRelatorioFactory();
        System.out.println("\nCliente: Solicitando Relatório Emergencial...");
        fabricaEmergencial.gerarRelatorio();
        
        // --- Vantagem do Factory Method ---
        System.out.println("\n--- Extensão Futura ---");
        System.out.println("Para adicionar um Relatório Semanal (novo tipo), basta criar as classes:");
        System.out.println("1. logistica.modelos.RelatorioSemanal (Produto Concreto)");
        System.out.println("2. logistica.fabricas.SemanalRelatorioFactory (Fábrica Concreta)");
        System.out.println("O método gerarRelatorio() em RelatorioFactory não precisa ser alterado (Princípio Open/Closed).");
    }
}