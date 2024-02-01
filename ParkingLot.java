public class ParkingLot {
    public ParkingSpot[] spots;

    public ParkingLot() {
        this.spots = new ParkingSpot[10];
        for (int i = 0; i < 10; i++) {
            if (i <= 1) {
                this.spots[i] = new ParkingSpot(true);

            } else {
                this.spots[i] = new ParkingSpot(false);
            }

        }

    }

    public int ParkCar(Car x) {

        if (x.handicap) {
            for (int i = 0; i <= 1; i++) {
                if (spots[i].parkedCar == null) {
                    spots[i].parkedCar = x;
                    return i;

                }
            }
        } else {
            for (int i = 2; i <= 10; i++) {
                if (spots[i].parkedCar == null) {
                    spots[i].parkedCar = x;
                    return i;
                }
            }
        }


        return -1;

    }

    public Car removeCar(int y) {
        if (spots[y].parkedCar != null) {
            Car removedCar = spots[y].parkedCar;
            spots[y].parkedCar = null;
            return removedCar;

        } else {
            System.out.println("There is no car in this spot\n");
            return spots[y].parkedCar;

        }
    }

    public String toString() {
        int x = 0;
        int y = 0;
        for (int i = 0; i <= 9; i++) {
            if (spots[i].parkedCar == null) {
                if (spots[i].handicap == true) {
                    x = x + 1;
                } else {
                    y = y + 1;
                }
            }
        }
        return "" + x + " " + y;//I think I did this right

    }

}
