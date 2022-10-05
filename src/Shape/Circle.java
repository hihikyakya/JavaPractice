package Shape;

public class Circle {
    private int radius;
    private String name;

    public Circle(){
    }
    public double getSquare(){
        return this.radius*this.radius*Math.PI;
    } //this를 통해 이 클래스의 것이라고 지정해줌

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
