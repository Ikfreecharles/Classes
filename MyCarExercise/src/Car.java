public class Car {

    String name;
    int maxSpeed;
    boolean withTyreAtTheBack;

    public Car(String name, int maxSpeed, boolean withTyreAtTheBack){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.withTyreAtTheBack = withTyreAtTheBack;
    }
    public Car(String name, int maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    public void message(){
        if(withTyreAtTheBack){
            System.out.println("Your car, " + name + " is moving at a maximum speed of " + maxSpeed + "km/hr!. Your car has a tyre on the back");
        }else{
            System.out.println("Your car, " + name + " is moving at a maximum speed of " + maxSpeed + "km/hr!. No tyre on the back");
        }
    }
}
