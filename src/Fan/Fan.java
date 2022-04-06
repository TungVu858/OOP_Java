package Fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String toString(){
        String trangthai = "";
        if (this.isOn()){
            trangthai += "\n fan is on";
            trangthai += "\n speed : " + speed;
        }
        else {
            trangthai +="\n fan is off";
        }
        trangthai += "\n color : " + color;
        trangthai += "\n radius : " +radius;
        return trangthai;
    }
}
