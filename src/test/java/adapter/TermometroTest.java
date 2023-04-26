package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TermometroTest {

    @Test
    void deveRetornarTemperaturaGrausCelsiusTermometro() {
        Termometro termometro = new Termometro();
        termometro.setGrausCelsius(0.0);
        assertEquals(0.0, termometro.getGrausCelsius());
    }

    @Test
    void deveRetornarTemperaturaKelvinTermometro() {
        Termometro termometro = new Termometro();
        termometro.setGrausCelsius(0.0);
        assertEquals(-273.15, termometro.getKelvin());
    }

}