package util;


public class Calculator implements Caltype{
    private int i1,i2;
    private long l1,l2;
    private float f1,f2;
    private double d1,d2;

    public Calculator() {
    }

    public IntCalculator setInt(int i1,int i2){
        this.i1=i1;
        this.i2=i2;
        return new IntCalculator(i1,i2);
    }
    public LongCalculator setLong(long l1,long l2){
        this.l1=l1;
        this.l2=l2;
        return new LongCalculator(l1,l2);
    }
    public FloatCalculator setFloat(float f1,float f2){
        this.f1=f1;
        this.f2=f2;
        return new FloatCalculator(f1,f2);
    }
    public DoubleCalculator setDouble(double d1,double d2){
        this.d1=d1;
        this.d2=d2;
        return new DoubleCalculator(d1,d2);
    }
    public String description(){
        return "1. 계산기를 생성한다. \n" +
                "2. 계산기에 들어갈 두개의 변수를 setXX메소드를 통해 원하는 타입의 값을 설정한다.\n" +
                "3. getXXValue메소드나 XXsum. XXsubtract, XXmultiply, XXdivide 메소드들을 통해 계산을 한다. \n" +
                "4. XX는 자료형 Int,Long,Float,Double중 하나이며 getXXValue의 option은 +,-,*,/ 4가지가 있다.";
    }



    @Override
    public Integer getIntValue(String option) {
        IntCalculator intCalculator=new IntCalculator(i1,i2);
        return intCalculator.getIntValue(option);
    }

    @Override
    public Long getLongValue(String option) {
        LongCalculator longCalculator=new LongCalculator(l1,l2);
        return longCalculator.getLongValue(option);
    }

    @Override
    public Float getFloatValue(String option) {
        FloatCalculator floatCalculator=new FloatCalculator(f1,f2);
        return floatCalculator.getFloatValue(option);
    }

    @Override
    public Double getDoubleValue(String option) {
        DoubleCalculator doubleCalculator=new DoubleCalculator(d1,d2);
        return doubleCalculator.getDoubleValue(option);
    }
}
