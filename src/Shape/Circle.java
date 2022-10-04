package Shape;

public class Circle {
    private int radius;
    private String name;

    public Circle(){
    }
    public double getSquare(){
        return this.radius*this.radius*Math.PI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }
}
