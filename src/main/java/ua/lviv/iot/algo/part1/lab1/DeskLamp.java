package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper=true)
class DeskLamp extends ua.lviv.iot.algo.part1.lab1.Light {
    private boolean isOn;
    private int brightness;
    private String color;

    public DeskLamp ( String producer, int workingHours,boolean isOn, int brightness, String color ){
        super(producer, workingHours);
        this.isOn = isOn;
        this.brightness = brightness;
        this.color = color;
    }


    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("The lamp is on.");
    }

    @Override
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
////////////////////////////////////
    public String getHeaders() {
        return HEADER + "," + "isOn" + "," + "brightness" + "," + "color";
    }

    public String toCSV() {
        return super.toCSV() + "," + isOn + "," + brightness + "," + color ;
    }
//////////////////////////////////////
}

