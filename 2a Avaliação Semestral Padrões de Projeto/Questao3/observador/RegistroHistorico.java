package monitoramento.observador;

public class RegistroHistorico implements Observador {
    private final String nome = "Módulo de Registro Histórico";

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void atualizar(String regiao, double temperatura) {
        System.out.println("💾 " + nome + " (Região " + regiao + "): Salvando registro: T=" + temperatura + "°C.");
    }
}