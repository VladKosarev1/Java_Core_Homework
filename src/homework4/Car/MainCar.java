package homework4.Car;

class mainCar {
    public static void main(String[] args) {
        Helm hm = new Helm(65);
        Wheel wl = new Wheel(85);
        Body bd = new Body(43);
        Car car = new Car(wl,bd,hm);
        System.out.println(hm.toString());
        hm.setHelm(200);
        wl.setWheel(250);
        bd.setBody(20);
        System.out.println(car.toString());
    }
}