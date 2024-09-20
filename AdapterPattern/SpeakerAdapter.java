package adapterPattern;

public class SpeakerAdapter implements RemoteControllerFunction {
    private Speaker speaker;

    public SpeakerAdapter(Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public String powerOn() {
        return speaker.speakerOn();
    }

    @Override
    public String powerOff() {
        return speaker.speakerOff();
    }

    @Override
    public String pressPlusButton() {
        return speaker.volumeUp();
    }

    @Override
    public String pressMinusButton() {
        return speaker.voulumeDown();
    }
}
