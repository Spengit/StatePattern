
public class InTransitState implements State{
	private Package pkg;

	public InTransitState(Package pkg) {
		this.pkg = pkg;
	}

	@Override
	public void displayStatus() {
		// TODO Auto-generated method stub
		System.out.println(pkg.getName()+" is out for transit");
		
	}

	@Override
	public void displayETA() {
		// TODO Auto-generated method stub
		System.out.println(pkg.getName()+ " should arrive within 5 days");
		
	}
	

}
