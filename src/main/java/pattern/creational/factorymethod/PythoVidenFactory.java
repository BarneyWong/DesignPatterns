package pattern.creational.factorymethod;

public class PythoVidenFactory extends  VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
