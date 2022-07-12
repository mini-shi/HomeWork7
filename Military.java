public class Military extends Air{
    private boolean ejectionSys;
    private  int numOfMissiles;

    public boolean isEjectionSys() {
        return ejectionSys;
    }
    public void setEjectionSys(boolean ejectionSys) {
        this.ejectionSys = ejectionSys;
    }
    public int getNumOfMissiles() {
        return numOfMissiles;
    }
    public void setNumOfMissiles(int numOfMissiles) {
        this.numOfMissiles = numOfMissiles;
    }
    public Military(int power, int speed, int weight, String model, int wingspan, int minRunwayLenght, boolean ejectionSys, int numOfMissiles) {
        super(power, speed, weight, model, wingspan, minRunwayLenght);
        this.ejectionSys = ejectionSys;
        this.numOfMissiles = numOfMissiles;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", ejectionSys=" + isEjectionSys() +
                ", numOfMissiles=" + getNumOfMissiles() +
                '}';
    }
    public void shot(){
        while (getNumOfMissiles()!=0){
            System.out.println("Ракета пошла");
            numOfMissiles--;
        }
        System.out.println("Боеприпасы отсутствуют");
    }
    public  void isHasEjectionSys(){
        if(isEjectionSys()){
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
