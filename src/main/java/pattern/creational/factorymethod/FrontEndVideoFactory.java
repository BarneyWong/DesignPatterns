package pattern.creational.factorymethod;

public class FrontEndVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FrontEndVideo();
    }
}
