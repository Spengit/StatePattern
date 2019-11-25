
public class OrderedState implements State{
	private Package pkg;
	public OrderedState(Package pkg) {
		this.pkg = pkg;
	}

	@Override
	public void displayStatus() {
		// TODO Auto-generated method stub
		System.out.println(pkg.getName() +" was ordered");
	}

	@Override
	public void displayETA() {
		// TODO Auto-generated method stub
		System.out.println(pkg.getName() + " Should arrive in "
				+ "5 to 7 busisness days");
	}
	

}
