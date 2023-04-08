import org.junit.Test;

public class LightTest {

    @Test
    public void testLight() {
        // Створюємо об'єкт анонімного класу, який реалізує абстрактний клас Light
        Light light = new Light() {
            @Override
            public void turnOn() {
                // Реалізація методу turnOn() для тестування
            }

            @Override
            public void turnOff() {
                // Реалізація методу turnOff() для тестування
            }
        };

        // Викликаємо методи об'єкту для перевірки роботи
        light.turnOn();
        light.turnOff();
    }
}
