package homework6.Task2Part2;

public class Main {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator(18,21);
        System.out.println("The result of Devide " + mc.devideValue());
        System.out.println("The result of Minus "+ mc.minusValue());
        System.out.println("The result of Plus "+ mc.plusValue());
        System.out.println("The result of Multiply " + mc.multiplyValue());
    }
}