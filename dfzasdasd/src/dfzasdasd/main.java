package dfzasdasd;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(10);
		
		Iterator<Integer> it=v.iterator();
		//iterator�� ����� ��� ���� �ϳ��� ���
		while(it.hasNext()) {
			int n=it.next();
			System.out.println(n);
		}
		//iterator�� ����� ��� ������ �� ���ϱ�
		int sum=0;
		it=v.iterator();
		while(it.hasNext()) {
			int n=it.next();
			sum+=n;
		}
		System.out.println("sum="+sum);
	}

}
