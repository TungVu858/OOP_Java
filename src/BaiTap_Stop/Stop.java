package BaiTap_Stop;

import java.time.LocalTime;

public class Stop {
    private LocalTime batdau,ketthuc;

    public Stop(){
        batdau = LocalTime.now();
    }
    public LocalTime getBatdau() {
        return batdau;
    }

    public LocalTime getKetthuc() {
        return ketthuc;
    }

    public Stop(LocalTime batdau, LocalTime ketthuc) {
        this.batdau = batdau;
        this.ketthuc = ketthuc;
    }
    public void batdau(){
        batdau = LocalTime.now();
    }
    public void ketthuc(){
        ketthuc = LocalTime.now();
    }
    public int getElapsedTime(){
        return ((ketthuc.getHour() - batdau.getHour())*3600 + (ketthuc.getMinute()-batdau.getMinute())*60 + (ketthuc.getSecond() - batdau.getSecond())*1000);
    }
}
