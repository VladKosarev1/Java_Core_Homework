package homewrk1;

public class Main {
    public static void main(String[] args) {

        Byte wrapperByte = 2;
        Byte byteVar = new Byte(wrapperByte);
        System.out.println(wrapperByte);

        Integer myInt = 5;
        System.out.println(myInt);

        Double myDouble = 5.99;
        System.out.println(myDouble);

        Character myChar = 'A';
        System.out.println(myChar);

        Boolean b1 = true;
        Boolean b2 = false;
        String s1 = Boolean.toString(b1);
        String s2 = Boolean.toString(b2);
        System.out.println(s1);
        System.out.println(s2);

        float f = 89;
        String o = Float.toString(f);
        System.out.println(o);

        long l = 12345L;
        String str = Long.toString(l);
        System.out.println(str);

        short s = 20;
        System.out.println(Short.toString(s));
        System.out.println(Short.valueOf(s));

        //2
        System.out.println("Integer.MAX_VALUE = "
                + Integer.MAX_VALUE);


        //3
        int[] array = new int[]{1, 23, 13, 5, 87, 8, 32, 9, 32, 4};
        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("min value" + minValue);
        System.out.println("min index" + minIndex);

        int maxValue = array[0];
        int maxIndex = 0;
        for (int i = 1; i > array.length; i++) {
            if (array[i] > minValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
    }
}
