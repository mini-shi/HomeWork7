public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(250,60,76,"Audi", 4,45,"Sedan", 4);
        System.out.println( passenger.toString());
        passenger.method(2);
        System.out.println();
        Freight freight = new Freight(110, 100,3000,"Ford",5,90,100);
        System.out.println(freight.toString());
        freight.cargoСapacity(10);
        System.out.println();
        Civil civil = new Civil(5,200,35000,"Боинг 747",400,1500,450, true);
        System.out.println(civil.toString());
        civil.passengerСapacity(500);
        System.out.println();
        Military military = new Military(10,350,50000,"Messerschmitt Bf 109 G-6", 150,1500,true,3);
        System.out.println(military.toString());
        military.shot();
        military.isHasEjectionSys();

    }
}
