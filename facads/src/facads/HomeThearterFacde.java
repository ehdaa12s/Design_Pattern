/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facads;

/**
 *
 * @author ehdaaabdallah
 */
public class HomeThearterFacde {

    DVDPlayer DVD = new DVDPlayer();
    Lights light = new Lights();
    Amplifier amp = new Amplifier();
    Projector pro = new Projector();

    public void WatchMovie() {
        DVD.setMovie(" sellcon vall");
        light.turnOn();
        amp.setVolume(12);
        pro.setInput(" start");
    }

    public void endMovie() {
        DVD.turnOff();
        light.turnOff();
        amp.turnOff();
        pro.turnOff();
    }

}
