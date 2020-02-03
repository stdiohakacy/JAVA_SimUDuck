
public class Client {
	public static void main(String[] args) {
		MallardDuck mDuck = new MallardDuck();
		System.out.println(mDuck.performFly());
		System.out.println(mDuck.performQuack());
		
		ModelDuck modelDuck = new ModelDuck();
		System.out.println(modelDuck.performFly());
		System.out.println(modelDuck.performQuack());
	}
}
