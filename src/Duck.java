
public abstract class Duck {
	protected IFlyBehavior flyBehavior;
	protected IQuackBehavior quackBehavior;

	public IFlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public IQuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(IQuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public abstract String display();

	public String performFly() {
		return this.flyBehavior.fly();
	}

	public String performQuack() {
		return this.quackBehavior.quacking();
	}

	public String swim() {
		return "all ducks float, even toys ...";
	}
}
class MallardDuck extends Duck
{
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public String display() {
		return "I'm a real Mallard duck";
	}
}

class ModelDuck extends Duck
{
	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public String display() {
		return "I'm a model duck";
	}
}
