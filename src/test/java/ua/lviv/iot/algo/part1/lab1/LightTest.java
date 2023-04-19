package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;

public class LightTest {
    @Test
    public void testLight() {

        Light light = new Light() {
            @Override
            public void turnOn() {

            }
            @Override
            public void turnOff() {

            }
        };


        light.turnOn();
        light.turnOff();
    }
}
