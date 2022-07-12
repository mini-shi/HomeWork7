public class Air extends Transport{
    int wingspan;
    int minRunwayLenght;

    public int getWingspan() {
        return wingspan;
    }
    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }
    public int getMinRunwayLenght() {
        return minRunwayLenght;
    }
    public void setMinRunwayLenght(int minRunwayLenght) {
        this.minRunwayLenght = minRunwayLenght;
    }
    public Air(int power, int speed, int weight, String model, int wingspan, int minRunwayLenght) {
        super(power, speed, weight, model);
        this.wingspan = wingspan;
        this.minRunwayLenght = minRunwayLenght;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", wingspan=" + getWingspan() +
                ", minRunwayLenght=" + getMinRunwayLenght() +
                '\'';
    }
}
