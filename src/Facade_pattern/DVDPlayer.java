package Facade_pattern;

public class DVDPlayer {

    public void turnOn() {
        System.out.println("DVD 플레이어를 킵니다.");
    }

    public void turnOff() {
        System.out.println("DVD 플레이어를 끕니다.");
    }

    public void stop() {
        System.out.println("영화 재생을 중지합니다.");
    }

    public void play(String movie) {
        System.out.println(movie + " 영화를 재생합니다.");
    }
}
