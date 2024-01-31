//File name must be the same as the class name

public class Car {
    public String make; // public makes the variable public - You can also make private
    public String manufacturer;
    public boolean handicap;

    public Car(String make, String manufacturer, boolean handicap) {
        this.make = make; // like self in python - Tells java that we want to refer to something that
                          // belongs to the object in question
        // Take this object make, and make it the variable that we passed in
        this.manufacturer = manufacturer;
        this.handicap = handicap;

    }
}
