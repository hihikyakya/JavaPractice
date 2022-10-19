package Poly;

public class Circle extends Point{
	private double r;
	public Circle(Point p) {
		super(p.getX(), p.getY());
		// TODO Auto-generated constructor stub
		this.r=Math.sqrt(Math.pow(p.getX(),2)+Math.pow(p.getY(),2));
		
	}
	public Circle(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.r=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

	}
	public double getR() {
		return this.r;
	}
	public void setR(double r) {
		this.r=r;
	}
	
	public double getArea() {
		return this.r*this.r*Math.PI;
	}
	public static final double getarea(Circle circle){
		return circle.getR()*circle.getR()*Math.PI;
	}
}
