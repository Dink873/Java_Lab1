package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PenManagerTest {
 @BeforeEach
 void setUp(){}


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

     }

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

     }

 }




