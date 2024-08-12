package pl.coderslab.tydzien3.z2stub;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class WeatherClientTest {

    @Mock
    //WeatherClient weatherClient;
    WeatherService weatherService;

    @Test
    void getWeatherReport() {
        //WeatherServiceStub weatherServiceStub = new WeatherServiceStub();
        WeatherClient weatherClient = new WeatherClient(weatherService);
        when(weatherService.getCurrentTemperature("Warszawa")).thenReturn(30.0);
        when(weatherService.getCurrentTemperature("Kraków")).thenReturn(20.0);
        when(weatherService.getCurrentTemperature("Random")).thenReturn(null);
        String wwa = weatherClient.getWeatherReport("Warszawa");
        assertEquals("Temperatura w " + "Warszawa" + " wynosi: " + 30.0 + "°C", wwa);
        String krk = weatherClient.getWeatherReport("Kraków");
        assertEquals("Temperatura w " + "Kraków" + " wynosi: " + 20.0 + "°C", krk);
        String random = weatherClient.getWeatherReport("Random");
        assertEquals("Miasto nie jest obsługiwane", random);
    }
}