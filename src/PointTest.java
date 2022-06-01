public class PointTest {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(10,20);
		
		Point3D p2 = new Point3D(50,60,70);
		
		ColoredPoint2D p3 = new ColoredPoint2D(30,40,"Red");
		
		ColoredPoint3D p4 = new ColoredPoint3D(50,60,70,"Yellow");
		
		System.out.println(p1.toString());
		System.out.println("-------------------");
		System.out.println(p2.toString());
		System.out.println("-------------------");
		System.out.println(p3.toString());
		System.out.println("-------------------");
		System.out.println(p4.toString());
		System.out.println("-------------------");
		
		/*GrandFather gf = new GrandFather();
		System.out.println("------------------------");
		
		Father f = new Father();
		System.out.println("------------------------");
		
		Child c = new Child();
		System.out.println("------------------------");*/
	}
	
}

class Point2D{
	private int x;
	private int y;
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	//redefining
	//overriding
	//filtering
	
	
}

class Point3D extends Point2D
{
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public String toString() {
		return "Point3D [toString()=" + super.toString() + ", z=" + z + "]";
	}	
}


class ColoredPoint2D extends Point2D
{
	private String color;

	public ColoredPoint2D(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	
	public String toString() {
		return "ColoredPoint2D [toString()=" + super.toString() + ", color=" + color + "]";
	}
}

class ColoredPoint3D extends Point3D
{
	private String color;

	public ColoredPoint3D(int x, int y, int z, String color) {
		super(x, y, z);
		this.color = color;
	}

	public String toString() {
		return "ColoredPoint3D [toString()=" + super.toString() + ", color=" + color + "]";
	}
	
	
}

/*class GrandFather
{
	GrandFather(int x)
	{
		System.out.println("GrandFather ctor....");
	}
}


class Father extends GrandFather
{
	Father(int h,String x)
	{
		super(78);
		System.out.println("\tFather ctor....");
	}
}

class Child extends Father
{
	Child()
	{
		super(65,"Yo");
		System.out.println("\t\tChild ctor....");
	}
}*/