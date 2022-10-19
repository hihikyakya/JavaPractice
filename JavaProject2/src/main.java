import Car.ChildB;
import Poly.Circle;
import Poly.Cylinder;//Poly 패키지의 Cylinder 클래스
import Poly.Point;
import app.A;

import java.math.MathContext;

public class main {
	public static void main(String[] args) {
		/*Cylinder cylinder=new Cylinder(3,new Point(1,3));
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
		StringBuffer stringBuffer2=new StringBuffer("My name is 김준희.");
		String newname="wearwearw";
		stringBuffer2.replace(stringBuffer2.length()-4,stringBuffer2.length()-1, newname);
		System.out.println(stringBuffer2);
		*/
		//static method? static member?
		double PI=Math.PI;
		System.out.println(PI==Math.PI);
		Circle circle = new Circle(new Point(10, 11));
		System.out.println(circle.getarea(circle)+" vs "+ Circle.getarea(circle)); //static메소드는 객체를 생성해서도 되고 객체를 생성 안해도 클래스를 통해서 호출 가능.


	}
	protected abstract class AbstractClass {
		public abstract int sum(); //abstract 메소드는 굳이 여기서 구현할 필요가 없다.
		/*public int multiply(){ //그냥 메소드는 abstract class에서도 구현을 해줘야한다.
		}//오류*/
		//중간 고사 끝나고 인터페이스부터 함.
	}
}
