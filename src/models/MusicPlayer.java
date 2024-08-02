package models;

import interfaces.IMusicPlayer;

public class MusicPlayer implements IMusicPlayer {

    private String song;

    @Override
    public void play() {
        System.out.println("Playing song: " + song);
    }

    @Override
    public void pause() {
        System.out.println("Pausing song: " + song);
    }

    @Override
    public void stop() {
        System.out.println("Stopping song: " + song);
    }

    public void setSong(String song) {
        this.song = song;
    }
}
