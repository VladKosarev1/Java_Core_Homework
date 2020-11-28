package homework6.Task2Part2;

import homework6.Task2.Numerable;

public class MyCalculator implements Numerable {
    float a;
    float b;
    public MyCalculator(float a,float b){
        this.a = a;
        this.b = b;
    }

    public float plusValue(){
        return a+b;
    }
    public float devideValue(){
        return a/b;
    }
    public float minusValue(){
        return a-b;
    }
    public float multiplyValue(){
        return a*b;
    }
}