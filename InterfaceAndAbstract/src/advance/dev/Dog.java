package advance.dev;

public class Dog extends Animal implements Runable{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Dog is running.");
	}
	
}
