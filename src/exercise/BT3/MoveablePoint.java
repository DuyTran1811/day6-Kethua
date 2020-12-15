package exercise.BT3;

public class MoveablePoint extends Point {
    private float xSeed = 0.0f;
    private float ySeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSeed, float ySeed) {
        this.xSeed = xSeed;
        this.ySeed = ySeed;
    }

    public MoveablePoint(float x, float y, float xSeed, float ySeed) {
        super(x, y);
        this.xSeed = xSeed;
        this.ySeed = ySeed;
    }

    public float getxSeed() {
        return xSeed;
    }

    public void setxSeed(float xSeed) {
        this.xSeed = xSeed;
    }

    public float getySeed() {
        return ySeed;
    }

    public void setySeed(float ySeed) {
        this.ySeed = ySeed;
    }
    public float[] getSpeed() {
        float[] result = {xSeed, ySeed};
        return result;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSeed = xSpeed;
        this.ySeed = ySpeed;
    }
    public MoveablePoint move() {
        float x = getX();
        float y = getY();
        x += xSeed;
        y += ySeed;
        setX(x);
        setY(y);
        return this;
    }
}
