package car.example.constructor.injection;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }


    //.toString is not required in this instance but when it's used to store, it will be required
    public void displayDetails(){
        System.out.println("Car Details: " + specification.toString());
    }
}
