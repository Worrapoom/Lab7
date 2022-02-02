package lab7;

public class Main {
	
	public static void main(String[] args) {
		Vehicle V = new Vehicle();

		int x = V.Wheel;
		float y = (float) 219.2;
		
		V.Move();
		V.Move(" Worrapoom ");
		
		Car C = new Car();
		C.Move();
		C.Move(x,y);
		
		Motorbike M = new Motorbike();
		M.Move();
		M.Move("Worrapoom", x-2);

		Balloon B = new Balloon();
		B.Move();
		B.Move("Name : KSW2");

		SuperCar S = new SuperCar();
		S.Move();
		S.Move("Name : NovaRS_Super");
		Drone D = new Drone();
		D.Move();
		D.Move("Address : 0881688990");
		
	}//end method
}//end class

