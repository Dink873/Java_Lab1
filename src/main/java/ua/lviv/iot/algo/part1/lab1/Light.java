package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
abstract class Light {
//////////////////////////////////////////
    public static final String HEADER = "producer, workingHours";

    public String getHeaders() {
        return HEADER;
    }

    public String toCSV() {
        return producer + "," + workingHours;
    }
/////////////////////////////////////////////
    private String producer = "Unknown";
    private int workingHours;

    public abstract void turnOn();

    public abstract void turnOff();

}
