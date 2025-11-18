package monitoramento.observador;

public class ModuloAlerta implements Observador {
    private final String nome = "Módulo de Alertas";

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void atualizar(String regiao, double temperatura) {
        System.out.print("🚨 " + nome + " (Região " + regiao + "): ");
        if (temperatura > 35.0) {
            System.out.println("Alerta de Calor Extremo! (" + temperatura + "°C)");
        } else {
            System.out.println("Temperatura normal.");
        }
    }
}