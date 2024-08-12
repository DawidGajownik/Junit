package pl.coderslab.tydzien3.z2stub;

public class WeatherClient {
    private WeatherService weatherService;

    public WeatherClient(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String getWeatherReport(String city) {
        try {
            double temperature = weatherService.getCurrentTemperature(city);
            return "Temperatura w " + city + " wynosi: " + temperature + "°C";
        } catch (NullPointerException e) {
            return "Miasto nie jest obsługiwane";
        }
    }
}