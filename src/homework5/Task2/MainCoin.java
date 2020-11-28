package homework5.Task2;

public class MainCoin {
    public static void main(String[] args) {
        int x = 20+(int)(Math.random()*56);
        if(x<10){
            System.out.println("Випав Avers, " + "X = " + x);
        }
        else{
            System.out.println("Випав Revers, " + "X = " + x);
        }
    }
}