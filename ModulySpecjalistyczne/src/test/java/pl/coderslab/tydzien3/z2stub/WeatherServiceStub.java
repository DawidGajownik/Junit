package pl.coderslab.tydzien3.z2stub;

public class WeatherServiceStub implements WeatherService{
    @Override
    public Double getCurrentTemperature(String city) {
        if (city.equals("Warszawa")){
            return 30.0;
        }
        if (city.equals("Kraków")){
            return 20.0;
        }
        return null;
    }
}
