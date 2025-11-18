package antifraude.app;

import antifraude.modelo.Transacao;
import antifraude.processador.ProcessadorAntifraude;
import antifraude.verificacoes.VerificacaoValorSuspeito;
import antifraude.verificacoes.VerificacaoGeolocalizacao;
import antifraude.verificacoes.VerificacaoDispositivoIncomum;

public class SistemaAntifraude {
    
    public static void main(String[] args) {
        // 1. Criação dos Handlers (Verificações)
        ProcessadorAntifraude p1 = new VerificacaoValorSuspeito();
        ProcessadorAntifraude p2 = new VerificacaoGeolocalizacao();
        ProcessadorAntifraude p3 = new VerificacaoDispositivoIncomum();
        
        // 2. Montagem da Cadeia de Responsabilidade
        // Ordem: p1 -> p2 -> p3 -> fim
        p1.setProximo(p2);
        p2.setProximo(p3);
        
        System.out.println("--- Execução da Cadeia de Verificações ---");
        
        // --- Simulação 1: Transação Aprovada (Passa por toda a cadeia) ---
        Transacao t1 = new Transacao("USER-456", 450.00, "Local-B", "DISP-OK-99");
        System.out.println("\n[Processando T1]: Transação Segura.");
        p1.processar(t1);
        System.out.println("Resultado T1: " + t1);
        
        // --- Simulação 2: Transação Reprovada no 1º passo (Interrupção imediata) ---
        Transacao t2 = new Transacao("USER-999", 5500.00, "Local-B", "DISP-OK-10");
        System.out.println("\n[Processando T2]: Transação com Valor Suspeito.");
        p1.processar(t2);
        System.out.println("Resultado T2: " + t2);
        
        // --- Simulação 3: Transação Reprovada no 2º passo ---
        Transacao t3 = new Transacao("USER-111", 100.00, "Risco-A", "DISP-OK-10");
        System.out.println("\n[Processando T3]: Transação com Geolocalização de Risco.");
        p1.processar(t3);
        System.out.println("Resultado T3: " + t3);
        
        System.out.println("\n--- Vantagem do Chain of Responsibility ---");
        System.out.println("Para adicionar uma nova verificação (ex: Histórico do Usuário), basta criar uma nova classe e reconfigurar os .setProximo(), sem alterar as classes VerificacaoValorSuspeito, VerificacaoGeolocalizacao ou a lógica central.");
    }
}