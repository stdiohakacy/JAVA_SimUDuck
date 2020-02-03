
public interface IFlyBehavior {
	public String fly();
}

class FlyNoWay implements IFlyBehavior {
	@Override
	public String fly() {
		return "can't fly";
	}
}

class FlyRocketPowered implements IFlyBehavior {
	@Override
	public String fly() {
		return "flying with rocket";
	}
}

class FlyWithWings implements IFlyBehavior {
	@Override
	public String fly() {
		return "flying with wings";
	}
}