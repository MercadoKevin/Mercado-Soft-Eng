package commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        Device tv = new Tv();
        Device cf = new CeilingFan();
        Device st = new Stereo();
        RemoteControl rc = new RemoteControl();
        
        rc.setCommand(new PowerOn(cf));
        rc.clickButton();
       
        rc.setCommand(new PowerOff(cf));
        rc.clickButton();
        
        rc.setCommand(new PowerOn(tv));
        rc.clickButton();
       
        rc.setCommand(new PowerOff(tv));
        rc.clickButton();
        
        rc.setCommand(new PowerOn(st));
        rc.clickButton();
       
        rc.setCommand(new PowerOff(st));
        rc.clickButton();
    }
}
