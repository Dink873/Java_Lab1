package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CandleTest {

    @Test
    public void testTurnOn() {
        Candle candle = new Candle("Producer", 100, false);
        assertFalse(candle.isLit());
        candle.turnOn();
        Assertions.assertTrue(candle.isLit());
    }

    @Test
    public void testTurnOff() {
        Candle candle = new Candle("Producer", 100, true);
        Assertions.assertTrue(candle.isLit());
        candle.turnOff();
        assertFalse(candle.isLit());
    }

    @Test
    public void testToString() {
        Candle candle = new Candle("Producer", 100, true);
        String expected = "Candle(super=Light(producer=Producer, workingHours=100), isLit=true)";
        Assertions.assertEquals(expected, candle.toString());

    }

}

