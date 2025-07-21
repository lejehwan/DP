package Facade_pattern;

public class HomeTheaterFacade {

    private TV tv;
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(TV tv, Amplifier amplifier, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("=== 영화 시청 준비 ===");
        tv.turnOn();
        amplifier.turnOn();
        amplifier.setVolume(10);
        dvdPlayer.turnOn();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("=== 영화 시청 종료 ===");
        dvdPlayer.stop();
        dvdPlayer.turnOff();
        amplifier.turnOff();
        tv.turnOff();
    }
}
