package util;

import java.util.Objects;

public class FloatCalculator extends DoubleCalculator implements Caltype{
    private float f1;
    private float f2;
    public FloatCalculator(float f1, float f2) {
        super(f1,f2);
        this.f1=f1;
        this.f2=f2;
    }
    public float floatsum(){
        return this.f1+this.f2;
    }
    public float floatsubtract(){
        return this.f1-this.f2;
    }
    public float floatmultiply(){
        return this.f1*this.f2;
    }
    public float floatdivide(){
        return this.f1/this.f2;
    }

    @Override
    public Integer getIntValue(String option) {
        return null;
    }

    @Override
    public Long getLongValue(String option) {
        return null;
    }

    public Float getFloatValue(String option){
        if (Objects.equals(option, "+")){
            return this.floatsum();
        }
        else if (Objects.equals(option, "-")){
            return this.floatsubtract();
        }
        else if (Objects.equals(option, "*")){
            return this.floatmultiply();
        }
        else if (Objects.equals(option, "/")){
            return this.floatdivide();
        }
        else{
            return null;
        }
    }
}
