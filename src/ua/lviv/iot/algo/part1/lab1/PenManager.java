package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;


class PenManager {
    private final List<ua.lviv.iot.algo.part1.lab1.Light> lightList = new LinkedList<>();

    private void addLight(ua.lviv.iot.algo.part1.lab1.Light light){
        lightList.add(light);
    }

    public void PrintLights() {
        for (ua.lviv.iot.algo.part1.lab1.Light light : lightList) {
            System.out.println(light);
        }
    }
    public void findAllLightsWithThisProduser(String producer) {
        lightList.stream()
                .filter(light -> light.getProducer().equals(producer)).forEach(System.out::println);}

    public void findAllLightsWithWorkingHoursGreaterThan(int workingHours) {
        lightList.stream()
                .filter(light -> light.getWorkingHours() > workingHours).forEach(System.out::println);}


    public static void main(String [] args) {
        PenManager penManager = new PenManager();


        penManager.addLight(new ua.lviv.iot.algo.part1.lab1.DeskLamp("Китай", 24, false, 5, "white" ));
        penManager.addLight(new ua.lviv.iot.algo.part1.lab1.Candle("Україна", 2, true));

        penManager.PrintLights();


        System.out.println();
        System.out.println("Виробник Китай" );
        penManager.findAllLightsWithThisProduser("Китай");


        System.out.println();
        System.out.println("Години роботи більше ніж 1" );
        penManager.findAllLightsWithWorkingHoursGreaterThan(1);





    }
}






















