package drones.state;

public class DeliverSuppliesState implements State{
	DroneMngmtStates droneMngmtStates;
	public DeliverSuppliesState(DroneMngmtStates droneMngmtStates) {
		this.droneMngmtStates = droneMngmtStates;
	}
	

	@Override
	public void findCause() {
		System.out.println("causes include factory or power plant malfunctions, spills during transportation or even terrorist attacks. These events, known as CBRNE events (chemical, biological, radiological, nuclear or explosive)");

	}

	@Override
	public void findLocation() {
		System.out.println("Drones can be deployed quickly, generate high-resolution and 3D mapping, identify hotspot areas that have sustained the most damage and upload the data in real time to coordinate relief efforts.");		

	}

	@Override
	public void deliver() {
		System.out.println("When roads, bridges, communication cables and gas and water lines are compromised, the safety of residents in the area is also compromised. To mitigate suffering and further damage, rescue teams can utilize drones to support infrastructures, deliver supplies and establish communication.");		

	}

	@Override
	public void extinguish() {
		System.out.println("Drones can eliminate the risks that pilots face and can increase the effectiveness of battling fires. ");		
		droneMngmtStates.setState(droneMngmtStates.getExtinguishWildFires());

	}

	
	public String toString() {
		return " deliver supplies state";
	}


	@Override
	public void status(Context context) {
		// TODO Auto-generated method stub
		
	

	}
}







