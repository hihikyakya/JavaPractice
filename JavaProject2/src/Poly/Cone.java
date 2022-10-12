package Poly;

public class Cone extends Circle{
	private double h;
	public Cone(double h, Point p) {
		super(p);
		// TODO Auto-generated constructor stub
		this.h=h;
	}
	@Override
	public double getArea(){
		return h*super.getArea()/3;
	}
	public double getH() {
		return this.h;
	}
	public void setH(double h) {
		this.h=h;
	}
}
