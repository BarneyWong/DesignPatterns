package principle.lIskovsubstitution;

public class Square implements Quadrangle{
   private long sideLength;

    @Override
    public long getLength() {
        return sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    public long getSideLength() {
        return sideLength;
    }
}
