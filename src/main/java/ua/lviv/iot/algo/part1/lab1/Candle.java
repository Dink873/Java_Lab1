package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper=true)
class Candle extends ua.lviv.iot.algo.part1.lab1.Light {

    private boolean isLit;

    public Candle (String producer, int workingHours, boolean isLit ){

        super(producer, workingHours);
        this.isLit = isLit;
    }
    @Override
    public void turnOn() {
        isLit = true;
        System.out.println("The candle is lit.");
    }
    @Override
    public void turnOff() {
        isLit = false;
        System.out.println("The candle is out.");
    }
///////////////////////////
    public String getHeaders() {
        return HEADER + "," + "isLit" ;
    }

    public String toCSV() {
        return super.toCSV() + "," + isLit ;
    }
    /////////////////////////////////////
}