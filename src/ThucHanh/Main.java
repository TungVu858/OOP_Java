package ThucHanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài : ");
        double dai = sc.nextDouble();
        System.out.println("Nhập chiều rộng : ");
        double rong = sc.nextDouble();
        HCN hcn = new HCN(dai,rong);
        System.out.println("Hình chữ nhật : " + hcn.disPlay());
        System.out.println("Diện tích : " + hcn.getDienTich());
        System.out.println("Chu vi : " + hcn.getChuVi());
    }
}
