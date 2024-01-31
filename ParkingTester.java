public class ParkingTester {

    public static void main(String[] args) {
        ParkingLot lotA = new ParkingLot();

        String resultA = lotA.toString();
        System.out.println(resultA);

        Car carA = new Car("A", "Infiniti", true);
        lotA.ParkCar(carA);
        String resultB = lotA.toString();
        System.out.println(resultB);

        Car carB = new Car("B", "Cadillac", false);
        lotA.ParkCar(carB);
        String resultC = lotA.toString();
        System.out.println(resultC);

        lotA.removeCar(0);
        String resultD = lotA.toString();
        System.out.println(resultD);

    }

}
