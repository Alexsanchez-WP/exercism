public class JedliksToyCar {

    private int distance = 0;
    private int batery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distance);
    }

    public String batteryDisplay() {
        if(batery <= 0){
            return "Battery empty";
        }
        return String.format("Battery at %d", batery) + "%";
    }

    public void drive() {
        if (batery > 0){
            batery --;
            distance += 20;
        }
    }
}
