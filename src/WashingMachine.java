
public class WashingMachine {
	private State currentState;
	
	public WashingMachine(State initailState) {
		currentState = initailState;
	}
	
	public void onMotionChange() {
		currentState.changeMotion(this);
	}
	public void onModeChange() {
		currentState.changeMode(this);
	}
	public void onPowerChange() {
		currentState.changePower(this);
	}
	
	void setState(State state) {
		currentState = state;
	}
}
	