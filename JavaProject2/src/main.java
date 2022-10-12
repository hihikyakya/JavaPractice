import Car.ChildB;
import Poly.Cylinder;//Poly 패키지의 Cylinder 클래스
import Poly.Point;

public class main {
	public static void main(String[] args) {
		Cylinder cylinder=new Cylinder(3,new Point(1,3));
		System.out.println(""+cylinder.getArea()+"");
		ChildB.func(10);
	}
}
