package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class LightWriterTest extends TestCase {
    private LightWriter writer = new LightWriter();
    private static final String EXPECTED = "File1.csv";
    private static final String ACTUAL = "File2.csv";
    List<Light> lightList = new LinkedList<>();




    private PenManager lightManager;


    @BeforeEach
    public void setUp() throws IOException {
        lightManager = new PenManager();
        PenManager penManager = new PenManager();
        DeskLamp lamp1 = new DeskLamp("Китай", 24, false, 5, "white");
        DeskLamp lamp2 = new DeskLamp("Україна", 48, true, 8, "black");
        Candle candle1 = new Candle("Китай", 2, true);
        Candle candle2 = new Candle("Україна", 5, false);
        penManager.addLight(lamp1);
        penManager.addLight(lamp2);
        penManager.addLight(candle1);
        penManager.addLight(candle2);
        writer = new LightWriter();
    }

//     @Test
//    public void testFileEmpty() throws IOException {
//        try {
//            FileWriter writer = new FileWriter(EXPECTED);
//            writer.write(lightList.toString());
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//           fail("Could not write to the empty list file.");
//        }
//        File emptyListFile = new File(EXPECTED);
//        assertFalse(emptyListFile.length() == 0);
//    }


    @Test
    public void testEmptytWrite() throws IOException {
        writer.writeToFile(lightList);
        File file = new File(EXPECTED);
        Assertions.assertTrue(file.exists());

    }

    @Test
    public void testWriteListOfDesk() throws IOException {
        writer.writeToFile(lightList);
        File file = new File(EXPECTED);

        Path expected = new File(EXPECTED).toPath();
        Path actual = new File(ACTUAL).toPath();

        Assertions.assertEquals(-1L, Files.mismatch(expected, actual));
    }

    @Test
    public void testFileOverride() throws IOException {
        testWriteListOfDesk();
    }

}
