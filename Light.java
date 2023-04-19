import lombok.*;
@NoArgsConstructor
@AllArgsConstructor@Getter
@Setter@ToString
abstract class Light {    private String producer = "Unknown";
    private int workingHours;
    public abstract void turnOn();
    public abstract void turnOff();
}

