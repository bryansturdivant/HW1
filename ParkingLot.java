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

    public String toString() {

        return "";// Returns a string

    }

}
