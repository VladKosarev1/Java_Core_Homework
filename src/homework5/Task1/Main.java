package homework5.Task1;

public class Main {
    public static void main(String[] args) {
        Pet pt = new Dog();
        Pet pt2 = new Cat();
        Pet pt3 = new Cow();
        pt.callVoice();
        pt2.callVoice();
        pt3.callVoice();
    }
}