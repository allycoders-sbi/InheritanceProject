
public class CircleTest {
public static void main(String[] args) {
	Circle mycircle = new Circle(5);
	mycircle.calcArea();
}
}

class Circle{
	final double PI=3.14;
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	void calcArea()
	{
		double area = PI * radius * radius;
		System.out.println("Area:"+area);
	}
}

