package logistica.fabricas;

import logistica.relatorios.Relatorio;

// A classe 'Criadora' abstrata que declara o Factory Method.
public abstract class RelatorioFactory {
    
    // O Factory Method: Subclasses devem implementar este método para retornar 
    // a instância do Produto Concreto.
    public abstract Relatorio criarRelatorio();

    // Método principal que define a lógica de criação e uso do produto.
    public void gerarRelatorio() {
        System.out.println("\n--- Iniciando Geração de Relatório ---");
        
        // Chama o Factory Method para criar o objeto.
        Relatorio relatorio = criarRelatorio();
        
        relatorio.prepararDados();
        relatorio.formatar();
        relatorio.emitir();
        
        System.out.println("--------------------------------------");
    }
}