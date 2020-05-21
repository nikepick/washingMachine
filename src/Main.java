import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WashingMachine wm = new WashingMachine(new Off());
		Scanner s = new Scanner(System.in);
		String in  = "";
		while (true) {
			System.out.println("Press 1 to put machine in Motion");
			System.out.println("Press 2 to put change Mode");
			System.out.println("Press 3 to cut off Power");
			in = s.next();
			if (in.equals("2")) {
				wm.onModeChange();
			} else if (in.equals("1")) {
				wm.onMotionChange();
			} else if (in.equals("3")) {
				wm.onPowerChange();
			}
		}
	}

}
