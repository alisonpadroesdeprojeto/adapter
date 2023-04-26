package adapter;

public class Termometro {

    ITemperatura avaliacao;
    TemperaturaAdapter persistencia;

    public Termometro() {
        avaliacao = new TemperaturaCelsius();
        persistencia = new TemperaturaAdapter(avaliacao);
    }

    public void setGrausCelsius(double graus) {
        avaliacao.setGraus(graus);
        persistencia.salvarTemperatura();
    }

    public double getGrausCelsius() {
        return persistencia.recuperarTemperatura();
    }

    public double getKelvin() {
        return persistencia.getKelvin();
    }

}