package adapter;

public class TemperaturaCelsius implements ITemperatura {

    private double graus;

    @Override
    public double getGraus() {
        return this.graus;
    }

    @Override
    public void setGraus(double graus) {
        this.graus = graus;
    }
}
