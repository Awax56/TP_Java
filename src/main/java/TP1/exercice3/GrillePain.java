package TP1.exercice3;

public class GrillePain {

    int HeureD;
    int MinuteD;

    public GrillePain(int h, int m) {
        HeureD = h;
        MinuteD = m;
    }

    public void dort(int m) {
        MinuteD += m;
        if (MinuteD >= 60) {
            MinuteD -= 60;
            HeureD += 1;
        }
    }
}
