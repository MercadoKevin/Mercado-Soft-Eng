package adapterPattern;

public class Tv {
    public String switchOn(){
        return "TV is switched on!";
    }

    public String switchOff(){
        return "TV is switched off!";

    }

    public String changeChannelUp(){
        return "TV is changing channel forward!";
    }

    public String changeChannelDown(){
        return "TV is changing channel backward!";
    }
}
