package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;


class PenManager {
    private final List<Light> lightList = new LinkedList<>();

    void addLight(Light light) {
        lightList.add(light);
    }

    public void PrintLights() {
        for (ua.lviv.iot.algo.part1.lab1.Light light : lightList) {
            System.out.println(light);
        }
    }

    public void findAllLightsWithThisProduser(String producer) {
        lightList.stream()
                .filter(light -> light.getProducer().equals(producer)).toList();

    }

    public void findAllLightsWithWorkingHoursGreaterThan(int workingHours) {
        lightList.stream()
                .filter(light -> light.getWorkingHours() > workingHours).toList();
    }

/////////////////////
List<Light> getLight() {
    return lightList;
}


////////////////////

}




























