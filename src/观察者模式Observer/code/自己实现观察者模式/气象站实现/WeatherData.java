package 观察者模式Observer.code.自己实现观察者模式.气象站实现;

import 观察者模式Observer.code.自己实现观察者模式.myInterface.MyObservable;

/**
 * @description: 气象站
 * @author: zhangys
 * @create: 2020-08-06 14:56
 **/
public class WeatherData extends MyObservable {

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData(){}

    public void measurementsChanged(){
        super.setChanged();
        super.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
