public class Lasagna {
    
    public int expectedMinutesInOven(){
        return 40;
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
        return 2 * layers;
    }

    public int totalTimeInMinutes(int layers, int minuts){
        int layerTotal = this.preparationTimeInMinutes(layers);
        return layerTotal + minuts;
    }
}
