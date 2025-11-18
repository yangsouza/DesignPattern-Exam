package monitoramento.sujeito;

import java.util.ArrayList;
import java.util.List;
import monitoramento.observador.Observador;

// A classe 'Assunto Concreto' (Sensor)
public class Sensor implements Sujeito {
    
    private List<Observador> observadores = new ArrayList<>();
    private String regiao;
    private double temperatura;
    
    public Sensor(String regiao) {
        this.regiao = regiao;
        this.temperatura = 0.0;
    }

    @Override
    public void adicionarObservador(Observador o) {
        observadores.add(o);
        System.out.println("✅ " + o.getNome() + " inscrito para receber atualizações da região " + this.regiao + ".");
    }

    @Override
    public void removerObservador(Observador o) {
        observadores.remove(o);
        System.out.println("❌ " + o.getNome() + " removido das atualizações.");
    }

    @Override
    public void notificarObservadores() {
        System.out.println("\n*** Sensor da região " + this.regiao + " notifica " + observadores.size() + " observadores. ***");
        for (Observador observador : observadores) {
            observador.atualizar(this.regiao, this.temperatura);
        }
    }
    
    // Método que simula a mudança de estado e inicia a notificação
    public void setNovaTemperatura(double novaTemperatura) {
        System.out.println("\n[SENSOR " + this.regiao + "] Nova leitura: " + novaTemperatura + "°C.");
        this.temperatura = novaTemperatura;
        // Quando o estado muda, notificamos os observadores.
        notificarObservadores();
    }
}