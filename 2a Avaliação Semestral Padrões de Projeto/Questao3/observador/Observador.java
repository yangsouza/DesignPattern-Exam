package monitoramento.observador;

// A interface 'Observador'
public interface Observador {
    String getNome();
    void atualizar(String regiao, double temperatura);
}