package antifraude.modelo;

public class Transacao {
    private final String usuarioId;
    private final double valor;
    private final String geolocalizacao;
    private final String dispositivoId;
    private boolean aprovada;
    private String motivoReprovacao;

    public Transacao(String usuarioId, double valor, String geolocalizacao, String dispositivoId) {
        this.usuarioId = usuarioId;
        this.valor = valor;
        this.geolocalizacao = geolocalizacao;
        this.dispositivoId = dispositivoId;
        this.aprovada = true; // Assume-se aprovada no início da cadeia
        this.motivoReprovacao = "Aprovada";
    }

    public String getUsuarioId() { return usuarioId; }
    public double getValor() { return valor; }
    public String getGeolocalizacao() { return geolocalizacao; }
    public String getDispositivoId() { return dispositivoId; }

    public boolean isAprovada() { return aprovada; }
    public String getMotivoReprovacao() { return motivoReprovacao; }

    // Método para barrar a transação
    public void reprovar(String motivo) {
        this.aprovada = false;
        this.motivoReprovacao = motivo;
    }

    @Override
    public String toString() {
        return "Transacao [ID: " + usuarioId + ", Valor: R$" + valor + ", Status: " + motivoReprovacao + "]";
    }
}