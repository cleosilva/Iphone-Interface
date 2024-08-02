package main;

import models.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone myIPhone = new iPhone();

        // Usando como reprodutor musical
        myIPhone.setSong("Imagine - John Lennon");
        myIPhone.play();
        myIPhone.pause();
        myIPhone.stop();

        // Usando como telefone
        myIPhone.call("11-99888888");
        myIPhone.hangUp();

        // Usando como navegador
        myIPhone.browse("http://www.google.com");



    }

}
