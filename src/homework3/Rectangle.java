package homework3;

public class Rectangle {
    double width;
    double length;

    public Rectangle(){
        this.width = 10;
        this.length = 8;
    }

    public Rectangle(double width, double lenght){
        this.width = width;
        this.length = lenght;
    }

    public double getPerimeter(){

        return 2 * (this.width + this.length);
    }

    public double getArea(){

        return this.width * this.length;
    }
}
























