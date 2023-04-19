package ua.lviv.iot.algo.part1.lab1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.*;
import java.lang.reflect.Field;


public class LightWriter {
    public String writeToFile(List<Light> light) throws IOException {

        String defaultFileName = "File1.csv";

        if (light == null || light.isEmpty()) {
            return null;
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(defaultFileName));) {
            for (Light light_value : light) {
                bufferedWriter.write(light_value.getHeaders());
                bufferedWriter.newLine();
                bufferedWriter.write(light_value.toCSV());

                bufferedWriter.newLine();
            }

            bufferedWriter.close();

//

        } catch (IOException e) {

        }

        return defaultFileName;


    }

    public static void main(String[] args) throws IOException {
        PenManager penManager = new PenManager();
        DeskLamp lamp1 = new DeskLamp("Китай", 24, false, 5, "white");
        DeskLamp lamp2 = new DeskLamp("Україна", 48, true, 8, "black");
        Candle candle1 = new Candle("Китай", 2, true);
        Candle candle2 = new Candle("Україна", 5, false);
        penManager.addLight(lamp1);
        penManager.addLight(lamp2);
        penManager.addLight(candle1);
        penManager.addLight(candle2);

        LightWriter lightWriter = new LightWriter();
        lightWriter.writeToFile(penManager.getLight());


    }
}


