package commandPattern;

public class CeilingFan implements Device {

    @Override
    public String switchOn() {
        return "Ceiling Fan is switched on!";
    }

    @Override
    public String switchOff() {
        return "Ceiling Fan is switched off!";
    }
}
