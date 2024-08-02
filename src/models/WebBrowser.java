package models;

import interfaces.IWebBrowser;

public class WebBrowser implements IWebBrowser {

    private String url;

    @Override
    public void browse(String url) {
        this.url = url;
        System.out.println("Browsing URL: " + url);
    }
}
