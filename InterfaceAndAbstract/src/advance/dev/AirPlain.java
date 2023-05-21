package advance.dev;

public class AirPlain extends Machine implements Flyable{

	@Override
	public void fule() {
		// TODO Auto-generated method stub
		System.out.println("Airplane is fueled with aviation fuel.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Air plain is flying.");
	}

}
