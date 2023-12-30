
public class CarManager {
    public static void main(String[] args) {
        Car dogCar = new Car();
        Car cowCar = new Car();

        dogCar.speedUp();  //dogCar의 속도를 높일 때
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());
        dogCar.speedDown();
        System.out.println(dogCar.getCurrentSpeed());
    }
}
