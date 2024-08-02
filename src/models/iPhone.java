package models;

import interfaces.IMusicPlayer;
import interfaces.IPhone;
import interfaces.IWebBrowser;

public class iPhone implements IMusicPlayer, IPhone, IWebBrowser {
    private MusicPlayer musicPlayer = new MusicPlayer();
    private Phone phone = new Phone();
    private WebBrowser webBrowser = new WebBrowser();

    @Override
    public void play() {
        musicPlayer.play();
    }

    @Override
    public void pause() {
        musicPlayer.pause();
    }

    @Override
    public void stop() {
        musicPlayer.stop();
    }

    @Override
    public void call(String number) {
        phone.call(number);
    }

    @Override
    public void hangUp() {
        phone.hangUp();
    }

    @Override
    public void browse(String url) {
        webBrowser.browse(url);
    }

    public void setSong(String song) {
        musicPlayer.setSong(song);
    }
}
