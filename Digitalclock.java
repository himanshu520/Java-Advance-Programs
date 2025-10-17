import java.time.LocalTime;

public class DigitalClock {
    public static void main(String[] args) {
        while (true) {
            LocalTime time = LocalTime.now();
            System.out.print("\rCurrent Time: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
