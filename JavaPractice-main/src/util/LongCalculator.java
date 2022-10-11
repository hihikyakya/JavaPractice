package util;

import java.util.Objects;

public class LongCalculator implements Caltype{
    private long l1,l2;

    public LongCalculator(long l1, long l2) {
        this.l1=l1;
        this.l2=l2;
    }
    public long longsum(){
        return this.l1+this.l2;
    }
    public long longsubtract(){
        return this.l1-this.l2;
    }
    public long longmultiply(){
        return this.l1*this.l2;
    }
    public long longdivide(){
        return this.l1/this.l2;
    }

    @Override
    public Integer getIntValue(String option) {
        return null;
    }

    public Long getLongValue(String option){
        if (Objects.equals(option, "+")){
            return this.longsum();
        }
        else if (Objects.equals(option, "-")){
            return this.longsubtract();
        }
        else if (Objects.equals(option, "*")){
            return this.longmultiply();
        }
        else if (Objects.equals(option, "/")){
            return this.longdivide();
        }
        else{
            return null;
        }
    }

    @Override
    public Float getFloatValue(String option) {
        FloatCalculator floatCalculator=new FloatCalculator(this.l1,this.l2);
        return floatCalculator.getFloatValue(option);
    }

    @Override
    public Double getDoubleValue(String option) {
        return new DoubleCalculator(this.l1,this.l2).getDoubleValue(option);
    }
}
