package 观察者模式Observer.code.自己实现观察者模式.布告板实现;

import 观察者模式Observer.code.自己实现观察者模式.myInterface.MyObservable;
import 观察者模式Observer.code.自己实现观察者模式.myInterface.MyObserver;
import 观察者模式Observer.code.自己实现观察者模式.气象站实现.WeatherData;

/**
 * @description: 目前状况布告板
 * @author: zhangys
 * @create: 2020-08-06 15:07
 **/
public class ForecastDisplay implements MyObserver {

    private MyObservable myObservable;

    private float temperature;

    private float humidity;

    private float pressure;

    public ForecastDisplay(MyObservable myObservable){
        this.myObservable = myObservable;
        myObservable.addObServer(this);
    }

    @Override
    public void update(MyObservable observable, Object arg) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public void display(){
        System.out.println("###ForecastDisplay###");
        System.out.println("temperature：" + temperature + 1);
        System.out.println("humidity：" + humidity + 1);
        System.out.println("pressure：" + pressure + 1);
    }
}
