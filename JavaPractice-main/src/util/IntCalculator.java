package util;

import java.util.Objects;

public class IntCalculator extends LongCalculator implements Caltype{
    private int i1,i2;
    public IntCalculator(int i1, int i2) {
        super(i1, i2);
        this.i1=i1;
        this.i2=i2;
    }
    public int intsum(){
        return this.i1+this.i2;
    }
    public int intsubtract(){
        return this.i1-this.i2;
    }
    public int intmultiply(){
        return this.i1*this.i2;
    }
    public int intdivide(){
        return this.i1/this.i2;
    }
    public Integer getIntValue(String option){
        if (Objects.equals(option, "+")){
            return this.intsum();
        }
        else if (Objects.equals(option, "-")){
            return this.intsubtract();
        }
        else if (Objects.equals(option, "*")){
            return this.intmultiply();
        }
        else if (Objects.equals(option, "/")){
            return this.intdivide();
        }
        else{
            return null;
        }
    }
}
