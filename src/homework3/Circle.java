package homework3;

public class Circle {
    public double r;
    public double d;

    public Circle() {
        this.r = 5;
        this.d = 2 * this.r;
    }

    public Circle(double r){
     this.r = r;
     this.d = 2 * this.r;
    }

    public double getArea(){
        return (Math.PI * Math.pow(this.r, 2));
    }

    public double getLength(){
        return (Math.PI * this.d);
    }
}
