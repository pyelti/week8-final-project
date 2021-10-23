package drones.state;

public class DroneMngmtStates {
	State newState;
	State cBRNEeventState;
	State deliverSuppliesState;
	State disasterState;
	State extinguishWildFires;
	
	State state;

	public DroneMngmtStates() {
		newState= new NewState(this);
		cBRNEeventState = new CBRNEeventState(this);
		deliverSuppliesState = new DeliverSuppliesState(this);
		disasterState = new DisasterState(this);
		extinguishWildFires = new ExtinguishWildFires(this);
		state = newState ;
	}
	
	public void findCause() {
		state.findCause();
	}
	public void findLocation() {
		state.findLocation();
	}
	public void deliver() {
		state.deliver();
	}
	public void extinguish() {
		state.extinguish();
	}
	
	
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public State getNewState() {
		return newState;
	}
	public State getCBRNEeventState() {
		return cBRNEeventState;
	}
	public State getDeliverSuppliesState() {
		return deliverSuppliesState;
	}
	public State getDisasterState() {
		return disasterState;
	}
	public State getExtinguishWildFires() {
		return extinguishWildFires;
	}

	
	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("---- Drone Traffic Management System ------");

		result.append("\nDrone is in " + state + "\n");

		return result.toString();
	}

}





