package dfzasdasd;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(10);
		
		Iterator<Integer> it=v.iterator();
		//iterator을 사용한 모든 정수 하나씩 출력
		while(it.hasNext()) {
			int n=it.next();
			System.out.println(n);
		}
		//iterator을 사용한 모든 정수의 합 구하기
		int sum=0;
		it=v.iterator();
		while(it.hasNext()) {
			int n=it.next();
			sum+=n;
		}
		System.out.println("sum="+sum);
	}

}
