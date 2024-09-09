package commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        Tv tv = new Tv();
        CeilingFan cf = new CeilingFan();
        RemoteControl rc = new RemoteControl();

        PowerOn powerOn = new PowerOn(tv);
        System.out.println(powerOn.execute());

        PowerOff powerOff = new PowerOff(tv);
        System.out.println(powerOff.execute());

        PowerOn powerOn = new PowerOn(cf);
        System.out.println(powerOn.execute());

        PowerOff powerOff = new PowerOff(cf);
        System.out.println(powerOff.execute());
    
    }
}
