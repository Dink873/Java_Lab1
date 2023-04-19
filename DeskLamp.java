import lombok.*;@AllArgsConstructor
@NoArgsConstructor@Getter
@Setter@ToString(callSuper=true)
class DeskLamp extends Light {    private boolean isOn;
    private int brightness;    private String color;
    public DeskLamp ( String producer, int workingHours,boolean isOn, int brightness, String color ){

        super(producer, workingHours);
        this.isOn = isOn;
        this.brightness = brightness;
        this.color = color;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("The lamp is on.");
    }

    public void turnOff() {        isOn = false;
        System.out.println("The lamp is off.");    }
    public void setBrightness(int value) {
        if (value >= 1 && value <= 10) {            brightness = value;
            System.out.println("The brightness has been set to " + value + ".");        } else {
            System.out.println("Invalid brightness value. Please enter a value between 1 and 10.");        }
    }
    public void setColor(String color) {        this.color = color;
        System.out.println("The color has been set to " + color + ".");    }
}