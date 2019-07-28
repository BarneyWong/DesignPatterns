package principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.fly("鸵鸟");
//        bird.fly("大雁");
        FlyBird flyBird = new FlyBird();
        flyBird.fly("大雁");
    }
}
