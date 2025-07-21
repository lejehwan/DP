package Facade_pattern;

public class Amplifier {

    public void turnOn() {
        System.out.println("앰프를 킵니다.");
    }

    public void turnOff() {
        System.out.println("앰프를 끕니다.");
    }

    public void setVolume(int volume) {
        System.out.println("음량을  " + volume + " 으로 설정합니다.");
    }
}
