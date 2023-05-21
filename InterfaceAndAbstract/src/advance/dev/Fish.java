package advance.dev;

public class Fish extends Animal implements Swimable{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish is eating.");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Fish is swimming.");
	}

}
