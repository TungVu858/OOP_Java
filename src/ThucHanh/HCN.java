package ThucHanh;

public class HCN {
    double dai, rong;

    public HCN() {

    }

    public HCN(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDienTich() {
        return this.dai * this.rong;
    }

    public double getChuVi() {
        return (this.dai + this.rong) * 2;
    }

    public String disPlay() {
        return "HCN{ chiều dài : " + dai + " ,chiều rộng : " + rong + " }";
    }
}
