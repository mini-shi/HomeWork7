public class Civil extends Air{
    private int numOfPassengers;
    private boolean businessClass;

    public int getNumOfPassengers() {
        return numOfPassengers;
    }
    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
    public boolean isBusinessClass() {
        return businessClass;
    }
    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
    public Civil(int power, int speed, int weight, String model, int wingspan, int minRunwayLenght, int numOfPassengers, boolean businessClass) {
        super(power, speed, weight, model, wingspan, minRunwayLenght);
        this.numOfPassengers = numOfPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "Civil{" +
                "numOfPassengers=" + numOfPassengers +
                ", businessClass=" + businessClass +
                '}';
    }
    public void passengerСapacity( int numOfPassengers){
        if (numOfPassengers>getNumOfPassengers()){
            System.out.println("Вам нужен самолёт побольше");
        }else {
            System.out.println("Самолёт загружен");
        }
    }
}
