package aadaa;
import java.io.*;
import java.util.*;
import Thread.*;


public class main {
	public static void main(String[] args) {
//		FileWriter fout=null;
//		int c;
//		Scanner scanner=new Scanner(System.in);
//		try {
//			fout=new FileWriter("c:\\Temp\\test.txt");
//			while(true) {
//				String line=scanner.nextLine();
//				if(line.length()==0) {
//					break;
//				}
//				fout.write(line,0,line.length());
//				fout.write("\r\n",0,2);
//			}
//			fout.close();
//		}
//		catch(IOException e){
//			System.out.println("입출력 오류");
//		}
//		scanner.close();
		
		Mythread mythread=new Mythread();
		mythread.start();
	}
}
