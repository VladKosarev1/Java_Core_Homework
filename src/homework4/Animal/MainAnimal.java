package homework4.Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Animal an =new Animal("Shurik",188,9);
        System.out.println(an.toString());
        an.setAge(23);
        an.setName("Ne-Shurik");
        an.setSpeed(154);
        System.out.println("---------------------------------------");
        System.out.println(an.toString());
    }
}