package Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan(3,true,5,"red");
        System.out.println(fan.toString());
        Fan fan2 = new Fan(2,false,4,"blue");
        System.out.println(fan2.toString());
    }
}
