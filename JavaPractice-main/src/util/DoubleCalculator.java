package util;

import java.util.Objects;

public class DoubleCalculator implements Caltype{ //doublecalculator 클래스 생성
    private double d1,d2;
    public DoubleCalculator(double d1, double d2){
        this.d1=d1;
        this.d2=d2;
    }

    public double doublesum(){
        return this.d1+this.d2;
    }
    public double doublesubtract(){
        return this.d1-this.d2;
    }
    public double doublemultiply(){
        return this.d1*this.d2;
    }
    public double doubledivide(){
        return this.d1/this.d2;
    }

    @Override
    public Integer getIntValue(String option) {
        return null;
    }

    @Override
    public Long getLongValue(String option) {
        return null;
    }

    @Override
    public Float getFloatValue(String option) {
        return null;
    }

    //옵션에 따라 다른 연산을 할 수 있도록 함
    public Double getDoubleValue(String option){
        if (Objects.equals(option, "+")){
            return this.doublesum();
        }
        else if (Objects.equals(option, "-")){
            return this.doublesubtract();
        }
        else if (Objects.equals(option, "*")){
            return this.doublemultiply();
        }
        else if (Objects.equals(option, "/")){
            return this.doubledivide();
        }
        else{
            return null;
        }
    }

    public double getD1() {
        return d1;
    }


    public double getD2() {
        return d2;
    }


}
