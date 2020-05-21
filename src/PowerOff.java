
public class PowerOff implements State{

	@Override
	public void changeMode(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(this);
		System.out.println("No Power");
		
	}

	@Override
	public void changeMotion(WashingMachine washineMachine) {
		// TODO Auto-generated method stub
		washineMachine.setState(this);
		System.out.println("no power");
		
	}

	@Override
	public void changePower(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(new Running());
		
	}
	
	public PowerOff() {
	System.out.println("Seems like you live in INDIA, POWER OFF");	// TODO Auto-generated constructor stub
	}

}
