import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class CandleTest {

    @Test
    public void testTurnOn() {
        Candle candle = new Candle("Producer", 100, false);
        assertFalse(candle.isLit());
        candle.turnOn();
        assertTrue(candle.isLit());
    }

    @Test
    public void testTurnOff() {
        Candle candle = new Candle("Producer", 100, true);
        assertTrue(candle.isLit());
        candle.turnOff();
        assertFalse(candle.isLit());
    }

    @Test
    public void testToString() {
        Candle candle = new Candle("Producer", 100, true);
        String expected = "Candle(producer=Producer, workingHours=100, isLit=true)";
        assertEquals(expected, candle.toString());
    }
}
