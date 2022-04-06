package BaiTap_PTB2;

public class PTB2 {
    private double a, b, c;

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDelta(){
        return this.b*this.b - 4*this.a*this.c;
    }
    public double getRoot1(){
        return (-this.b + Math.pow(getDelta(),0.5))/2/this.a;
    }
    public double getRoot2(){
        return (-this.b - Math.pow(getDelta(),0.5))/2/this.a;
    }
}
