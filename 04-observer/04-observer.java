// Corrections
import java.util.ArrayList; // You forgot his
import java.util.List; // You forgot his

interface IObservable {
    add(IOobserver o);
    remove(IOobserver o);
    notify();
}

interface IObserver(){
    update();
}

class WeatherStation : IObservable {
    
    // private IObserver[] observers = []; wrong
    private int temperature;

    public void add(IObserver o) {
        this.observers.add(o)
    }

    public void remove(IObserver o) {
        this.observers.remove(o)
    }
    
    public void notify {
        foreach(IObserver o in this.observers){
            o.update();
        }
    }

    public int getTemperature(){
        return this.temperature;
    }
}

class PhoneDisplay : IObserver{
    WeatherStation station;

    public PhoneDisplay(WeatherStation station){
        this.station = station;
    }

    public void update(){
        this.station.getTemperature();
    }
}