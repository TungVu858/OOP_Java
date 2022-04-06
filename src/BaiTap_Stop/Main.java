package BaiTap_Stop;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
            LocalTime batdau = LocalTime.now();
            a = xep(a);
            LocalTime ketthuc = LocalTime.now();
            Stop sw = new Stop(batdau,ketthuc);
            System.out.println("Thời gian : " +sw.getElapsedTime());
            for (int i =0;i<a.length;i++){
                System.out.println(i);
            }
        }

    static int[] xep(int... a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        return a;
    }
}
