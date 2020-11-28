package homework5.Task4;

public class Constructor {
    int a;
    int b;
    char c;

    public Constructor(){
        this(15,25,'S');
    }

    public Constructor(int a, char c){
        this(a,25,c);
    }

    public Constructor(int a, int b, char c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
