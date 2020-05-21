
public class Washine implements State {

	@Override
	public void changeMode(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(new Rinse());
		
	}

	@Override
	public void changeMotion(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		System.out.println("Can't cahnge Motion before all steps ends");
	}

	@Override
	public void changePower(WashingMachine washingMachine) {
		// TODO Auto-generated method stub
		washingMachine.setState(new PowerOff());
	}
	public Washine() {
		System.out.println("Washing");// TODO Auto-generated constructor stub
	}

}
