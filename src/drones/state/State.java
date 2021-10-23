package drones.state;

public interface State {
	public void status(Context context);
	
	public void findCause();
	public void findLocation();
	public void deliver();
	public void extinguish();

	


}
