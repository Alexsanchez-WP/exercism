public class CarsAssemble {
    static final int CAR_HOUR = 221;

    public double productionRatePerHour(int speed) {
        int total = speed * CAR_HOUR;
        if (speed <= 4) {
            return total;
        } else if (speed <= 8) {
            return total * 0.9;
        } else if (speed == 9) {
            return total * 0.8;
        } else {
            return total * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double total = 0.0;
        int number = speed * CAR_HOUR;
        if (speed <= 4) {
            total = number;
        } else if (speed <= 8) {
            total = number * 0.9;
        } else if (speed == 9) {
            total = number * 0.8;
        } else {
            total = number * 0.77;
        }
        return (int) (total / 60);
    }
}
