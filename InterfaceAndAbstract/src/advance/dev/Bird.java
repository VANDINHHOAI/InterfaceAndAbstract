package advance.dev;

public class Bird extends Animal implements Flyable{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Bird is eating.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird is flying.");
	}

}
