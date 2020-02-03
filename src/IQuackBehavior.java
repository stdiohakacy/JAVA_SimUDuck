
public interface IQuackBehavior {
	public String quacking();
}

class MuteQuack implements IQuackBehavior
{
	@Override
	public String quacking() {
		return "*silence*";
	}
}

class Quack implements IQuackBehavior
{
	@Override
	public String quacking() {
		return "Quack";
	}
}

class Squeak implements IQuackBehavior
{
	@Override
	public String quacking() {
		return "Squeak";
	}
}