
public class Spin implements State {

	@Override
	public void changeMode(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		
		washingMachine.setState(this);
		System.out.println("no washing cycles left, Change Motion");
	}

	@Override
	public void changeMotion(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(new Finish());
		
	}

	@Override
	public void changePower(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(new PowerOff());
		
	}
	public Spin() {
	System.out.println("Spinning");	// TODO Auto-generated constructor stub
	}

}
