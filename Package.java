/**
 * 
 * @author Elijah Spencer
 *
 */

public class Package {
	private State orderedState;
	private State inTransitState;
	private State deliveredState;
	private String name;
	private State state;
	
	//constructor for package states
	public Package(String contents) {
		this.setName(contents);
		this.orderedState  = new OrderedState(this);
		this.inTransitState = new InTransitState(this);
		this.deliveredState = new DeliveredState(this);
	}
	
	public void order() {
		this.setState(orderedState);
		orderedState.displayStatus();
		orderedState.displayETA();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void mail() {
		this.setState(inTransitState);
		inTransitState.displayStatus();
		inTransitState.displayETA();
	}
	
	public void received() {
		this.setState(deliveredState);
		deliveredState.displayStatus();
		deliveredState.displayETA();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	

}
