import Shape.Circle;
import book.Book;
import util.Calculator;
import util.DoubleCalculator;
import util.FloatCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int[] objects= new int[]{};
        //int i=objects.length;
        // int[][] poligon=MakePolygonArray(3,2,3,2);
        // for(int i=0; i<4;i++){
        //     for(int j=0;j<poligon[i].length;j++){
        //         System.out.print(poligon[i][j]+" ");
        //     }
        //     System.out.println('\n');
        // }
//        int[][] a=new int[3][4];
//        int sum=0;
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                a[i][j]=i*j;
//            }
//        }
//
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                sum+=a[i][j];
//            }
//        }
//        System.out.println(sum);
        /*
        Car myCar = new Car();
        myCar.color = 0x14346525;
        myCar.speed = 0;
        Car myCar2 = new Car();
        myCar2.color = 0x0000;
        myCar2.speed = 0;
        Car myCar3 = new Car();
        myCar3.color = 0x1111111;
        myCar3.speed = 0;
        System.out.println(myCar.color+","+myCar2.speed);*/

        //static은 같은 이름의 메소드를 여러개 만들 수 있지만, 클래스내에서는 똑같은 이름의 매소드 여러개를 못만든다...?

        /*
        float f1=10.34f,f2=11.234f;
        double d1=113.34,d2=-123.345;
        double d3=-24,d4=10.2;
        DoubleCalculator doubleCalculator1=new DoubleCalculator(d1,d2);
        DoubleCalculator doubleCalculator2=new DoubleCalculator(d3,d4);
        FloatCalculator floatCalculator = new FloatCalculator(f1,f2);
        System.out.println(doubleCalculator1.getDoubleValue("+"));
        System.out.println(doubleCalculator2.getDoubleValue("-"));
        System.out.println(floatCalculator.getFloatValue("*"));
        System.out.println(floatCalculator.getFloatValue("/"));
        System.out.println(floatCalculator.getDoubleValue("/"));*/

        /*
        Scanner scanner = new Scanner(System.in);

        Circle circle=new Circle();
        circle.setRadius(scanner.nextInt());
        circle.setName(scanner.next());
        System.out.println(""+circle.getName()+"의 넓이는 "+circle.getSquare()+"이다.");*/

        Book[] book = new Book[10];
        for(int i=0; i<book.length; i++){
            book[i]=new Book("1234","abcde");
        }



        int n1=1,n2=11;
        replace(n1,n2);//안 바뀜
        System.out.println("n1="+n1+", n2="+n2+"");
    }
    static void replace(int n1, int n2){
        int temp=n1;
        n1=n2;
        n2=temp;
    }


    static void print(Object o, String e){
        System.out.print(o+e);
    }
    static void print(Object o){
        System.out.println(o);
    }
    private static int[][] MakePolygonArray(int n1,int n2,int n3,int n4){
        int[][] ints=new int[4][];
        ints[0]=new int[n1];
        ints[1]=new int[n2];
        ints[2]=new int[n3];
        ints[3]=new int[n4];
        for(int i=0; i<ints.length;i++){
            for(int j=0;j<ints[i].length;j++){
                ints[i][j]=(i+1)*10+j;
            }
        }
        return ints;
    }
}
