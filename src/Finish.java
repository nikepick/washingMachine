
public class Finish implements State {

	@Override
	public void changeMode(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(this);
		System.out.println("washing already finished");
		
	}

	@Override
	public void changeMotion(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(this);
		System.out.println("washing already finished");
		
	}

	@Override
	public void changePower(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(this);
		System.out.println("washing already finished");
		
	}
	public Finish() {
		// TODO Auto-generated constructor stub
		System.out.println("Finished Washing");
	}

}
