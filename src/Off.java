
public class Off implements State {

	@Override
	public void changeMode(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(this);
		System.out.println("First Turn On");
	}

	@Override
	public void changeMotion(WashingMachine washineMachine) {
		// TODO Auto-generated method stub
		washineMachine.setState(new Running());
		
	}

	@Override
	public void changePower(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(this);
		System.out.println("Still Off");
		
	}
	
	public Off() {
		System.out.println("Machine Not Running");// TODO Auto-generated constructor stub
	}


}
