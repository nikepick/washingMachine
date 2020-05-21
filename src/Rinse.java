
public class Rinse implements State {

	@Override
	public void changeMode(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(new Spin());
	}

	@Override
	public void changeMotion(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(this);
		System.out.println("washing not finished yet");
	}

	@Override
	public void changePower(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(new PowerOff());
		
		
	}
	public Rinse() {
		System.out.println("Rinsing");	// TODO Auto-generated constructor stub
	}

}
