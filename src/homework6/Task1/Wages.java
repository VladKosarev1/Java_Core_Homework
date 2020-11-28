package homework6.Task1;

public class Wages implements Income{
    int hours = 230;
    int payment=70;
    int calculate = hours * payment;

    public int getIncome() {
        return calculate;
    }
}