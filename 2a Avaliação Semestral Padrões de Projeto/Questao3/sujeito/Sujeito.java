package monitoramento.sujeito;

import monitoramento.observador.Observador;

// A interface 'Sujeito' (Assunto)
public interface Sujeito {
    void adicionarObservador(Observador o);
    void removerObservador(Observador o);
    void notificarObservadores();
}