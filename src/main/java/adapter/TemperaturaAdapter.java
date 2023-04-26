package adapter;

public class TemperaturaAdapter extends TemperaturaKelvin {

    private ITemperatura temperaturaCelsius;

    public TemperaturaAdapter(ITemperatura temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double recuperarTemperatura() {
        return this.getKelvin() + 273.15;
    }

    public void salvarTemperatura() {
        this.setKelvin(temperaturaCelsius.getGraus() - 273.15);
    }
}
