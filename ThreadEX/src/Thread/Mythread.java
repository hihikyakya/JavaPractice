package Thread;

public class Mythread extends Thread{
	int n=100;
	
	@Override
	public void run() {
		while(true) {
			if(n>0) {
				n--;
			}
			else {
				break;
			}
			System.out.println(n);
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}

}
