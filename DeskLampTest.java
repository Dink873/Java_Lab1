import org.junit.Test;
import static org.junit.Assert.*;

public class DeskLampTest {

    @Test
    public void testTurnOn() {
        DeskLamp lamp = new DeskLamp("ACME", 100, false, 5, "white");
        assertFalse(lamp.isOn());
        lamp.turnOn();
        assertTrue(lamp.isOn());
    }

    @Test
    public void testTurnOff() {
        DeskLamp lamp = new DeskLamp("ACME", 100, true, 5, "white");
        assertTrue(lamp.isOn());
        lamp.turnOff();
        assertFalse(lamp.isOn());
    }

    @Test
    public void testSetBrightness() {
        DeskLamp lamp = new DeskLamp("ACME", 100, true, 5, "white");
        assertEquals(5, lamp.getBrightness());
        lamp.setBrightness(8);
        assertEquals(8, lamp.getBrightness());
        lamp.setBrightness(12); // Invalid value
        assertEquals(8, lamp.getBrightness());
    }

    @Test
    public void testSetColor() {
        DeskLamp lamp = new DeskLamp("ACME", 100, true, 5, "white");
        assertEquals("white", lamp.getColor());
        lamp.setColor("blue");
        assertEquals("blue", lamp.getColor());
    }
}
