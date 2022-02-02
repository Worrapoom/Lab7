package lab7;

public class SuperCar extends Car {
	
	Car C = new Car();	
	int x ;

	public void Move() {
		x = C.Wheel ;
		System.out.println (">>|Move SuperCar running on the road.|<<");
	}//end method
	
}//end class