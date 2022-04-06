package BaiTap_PTB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập a: ");
//        double a = sc.nextInt();
//        System.out.println("Nhập b: ");
//        double b = sc.nextInt();
//        System.out.println("Nhập c: ");
//        double c = sc.nextInt();
        PTB2 giaiPTB2 = new PTB2(1, 2, 1);
        giaiPTB2.getA();
        giaiPTB2.getB();
        giaiPTB2.getC();
        System.out.println("Delta là : " + giaiPTB2.getDelta());
        if (giaiPTB2.getDelta() > 0) {
            System.out.println("Phương trình có 2 nghiệm : ");
            System.out.println("Nghiệm 1 là : " + giaiPTB2.getRoot1());
            System.out.println("Nghiệm 2 là : " + giaiPTB2.getRoot2());
        } else if (giaiPTB2.getDelta() == 0) {
            System.out.println("Phương trình có 1 nghiệm : " + (-giaiPTB2.getB() / 2 / giaiPTB2.getA() / giaiPTB2.getC()));
        } else {
            System.out.println("Phương trình vô nghiệm ");
        }
    }
}
