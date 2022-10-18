import Car.ChildB;
import Poly.Cylinder;//Poly 패키지의 Cylinder 클래스
import Poly.Point;
import app.A;

public class main {
	public static void main(String[] args) {
		Cylinder cylinder=new Cylinder(3,new Point(1,3));
		System.out.println(""+cylinder.getArea()+"");
		ChildB.func(10);

		A a=new A();
		a.method_B();
		String java="Java";
		int res=java.compareTo("C++");
		System.out.println(""+res+"");
		String str1="11111";
		str1.replace("1","dafswfwerfwe");
		System.out.println(str1); //바뀌지 않음

		StringBuffer stringBuffer1=new StringBuffer("11111");
		stringBuffer1.replace(0,1,"abdsf"); // (0 1) 2 3 4 =>(*replace) 2 3 4
		System.out.println(stringBuffer1);

	}
}
