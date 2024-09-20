package adapterPattern;

public class AirCon {
    public String turnOn(){
        return "Aircon is grumble.  Initializing cooling stage!";
    }

    public String turnOff(){
        return "Aircon is shutting down but not totally off!";
    }

    public String tempUp(){
        return "Aircon is heating up the room temperature!";
    }

    public String tempDown(){
        return "Aircon is cooling down the room temperature!";
    }
}
