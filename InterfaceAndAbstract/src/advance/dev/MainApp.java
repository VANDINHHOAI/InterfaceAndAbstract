package advance.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.eat();
		dog.run();
		System.out.println("=====================");
		Fish fish = new Fish();
		fish.eat();
		fish.swim();
		System.out.println("=====================");
		Bird bird = new Bird();
		bird.eat();
		bird.fly();
		System.out.println("=====================");
		Car car = new Car();
		car.run();
		car.fule();
		System.out.println("=====================");
		AirPlain airPlain = new AirPlain();
		airPlain.fly();
		airPlain.fule();
	}

}
