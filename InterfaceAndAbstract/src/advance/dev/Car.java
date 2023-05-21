package advance.dev;

public class Car extends Machine implements Runable{

	@Override
	public void fule() {
		// TODO Auto-generated method stub
		System.out.println("Car is fueled with gasoline.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car is running.");
	}

}
