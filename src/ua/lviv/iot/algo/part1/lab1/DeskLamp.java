package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DeskLamp {
    private boolean isOn;
    private int brightness;
    private String color;
    private String producer;

    public DeskLamp(boolean b, int i, String white, String unknown) {
    }

    public void turnOn() {
        isOn = true;
        System.out.println("The lamp is on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("The lamp is off.");
    }

    public void setBrightness(int value) {
        if (value >= 1 && value <= 10) {
            brightness = value;
            System.out.println("The brightness has been set to " + value + ".");
        } else {
            System.out.println("Invalid brightness value. Please enter a value between 1 and 10.");
        }
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("The color has been set to " + color + ".");
    }



    public static void main(String [] args) {
        DeskLamp deskLamp = new DeskLamp(false, 5, "white", "Unknown");
        deskLamp.setBrightness(5);
        deskLamp.setColor("Yellow");
    }
}
