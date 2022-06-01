
public class InheritanceTest {

	public static void main(String[] args) {
		Cycle Hercules = new Cycle(2);
		MotorCycle NewBikeWith6Wheels = new MotorCycle(2,"4 Stroke");
		
		System.out.println(Hercules.toString());
		System.out.println("--------------------");
		System.out.println(NewBikeWith6Wheels.toString());
	}
}

class Cycle
{
	int wheels;
	
	Cycle(int n)
	{
		wheels = n;
	}

	@Override
	public String toString() {
		return "Cycle [wheels=" + wheels + "]";
	}
	
	
}

class MotorCycle extends Cycle
{
	int wheels;
	String Engine;
	MotorCycle(int wheels,String e){
		super(wheels*3);
		this.wheels = wheels;
		Engine=e;
	}
	@Override
	public String toString() {
		return "MotorCycle [toString()=" + super.toString() + ", wheels=" + wheels + ", Engine=" + Engine + "]";
	}
	
	
}



