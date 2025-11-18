package monitoramento.observador;

public class PainelControle implements Observador {
    private final String nome = "Painel de Controle";

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void atualizar(String regiao, double temperatura) {
        System.out.println("🖥️ " + nome + " (Região " + regiao + "): Exibindo T=" + temperatura + "°C na interface.");
    }
}