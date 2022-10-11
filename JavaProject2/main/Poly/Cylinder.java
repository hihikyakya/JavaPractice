package Poly;

public class Cylinder extends Circle{
	private double h;
	public Cylinder(double h, Point p) {
		super(p);
		// TODO Auto-generated constructor stub
		this.h=h;
	}
	public double getH() {
		return this.h;
	}
	public void setH(double h) {
		this.h=h;
	}
	
	@Override
	public double getArea() {
		return super.getArea()*this.h;
	}

}
