public class WaterBottle {

    private double volume;

    public WaterBottle(double volume){
        this.volume = volume;
    }

    public double getVolume(){
        return this.volume;
    }

    public double drink(){
        return this.volume -= 10;
    }

    public double emptyVolume(){
        return this.volume = 0;
    }

    public double fillVolume(){
        return this.volume = 100.0;
    }

}
