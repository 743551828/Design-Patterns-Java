package 观察者模式Observer.test;

import 观察者模式Observer.code.自己实现观察者模式.布告板实现.CurrentConditionsDisplay;
import 观察者模式Observer.code.自己实现观察者模式.布告板实现.ForecastDisplay;
import 观察者模式Observer.code.自己实现观察者模式.气象站实现.WeatherData;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-08-06 15:18
 **/
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(1,1,1);
        weatherData.setMeasurements(2,2,2);
    }
}
