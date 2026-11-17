public class Lasagna {

    final static int EXPECTED_MINUTES_IN_OVEN = 40;
    final static int PREPARATION_TIME_IN_MINUTES = 2;
    
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int minuts){
        int total = this.expectedMinutesInOven() - minuts;
        if(total <= 0){
            return 0;
        }
        return total;
    }

    public int preparationTimeInMinutes(int layers){
        if(layers <= 0){
            return 0;
        }
        return PREPARATION_TIME_IN_MINUTES * layers;
    }

    public int totalTimeInMinutes(int layers, int minuts){
        int layerTotal = this.preparationTimeInMinutes(layers);
        return layerTotal + minuts;
    }
}
