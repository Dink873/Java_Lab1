import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PenManagerTest {

    @Test
    public void testFindAllLightsWithThisProduser() {
        // Arrange
        PenManager penManager = new PenManager();
        DeskLamp lamp1 = new DeskLamp("Китай", 24, false, 5, "white");
        DeskLamp lamp2 = new DeskLamp("Україна", 48, true, 8, "black");
        Candle candle1 = new Candle("Китай", 2, true);
        Candle candle2 = new Candle("Україна", 5, false);
        penManager.addLight(lamp1);
        penManager.addLight(lamp2);
        penManager.addLight(candle1);
        penManager.addLight(candle2);

        // Redirect System.out to a buffer for testing purposes
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        penManager.findAllLightsWithThisProduser("Китай");

        // Assert
        assertEquals("DeskLamp(producer=Китай, workingHours=24, isOn=false, brightness=5, color=white)\n" +
                "Candle(producer=Китай, workingHours=2, isLit=true)\n", outContent.toString());
    }

    @Test
    public void testFindAllLightsWithWorkingHoursGreaterThan() {
        // Arrange
        PenManager penManager = new PenManager();
        DeskLamp lamp1 = new DeskLamp("Китай", 24, false, 5, "white");
        DeskLamp lamp2 = new DeskLamp("Україна", 48, true, 8, "black");
        Candle candle1 = new Candle("Китай", 2, true);
        Candle candle2 = new Candle("Україна", 5, false);
        penManager.addLight(lamp1);
        penManager.addLight(lamp2);
        penManager.addLight(candle1);
        penManager.addLight(candle2);

        // Redirect System.out to a buffer for testing purposes
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        penManager.findAllLightsWithWorkingHoursGreaterThan(2);

        // Assert
        assertEquals("DeskLamp(producer=Китай, workingHours=24, isOn=false, brightness=5, color=white)\n" +
                "DeskLamp(producer=Україна, workingHours=48, isOn=true, brightness=8, color=black)\n", outContent.toString());
    }
}
