
public class PersonTest {
	public static void main(String[] args) {
		
		//Employee Ramesh = new Employee("Ramesh Singh","M",29,"IIT","MCA",240,"SBI","AM (SYS)",1015,30000);
		//System.out.println(Ramesh.toString());
		
		Person pObj = new Person("Jayant", "M", 26, "Sector 11", "Sector 11", "Navi Mumbai", "UP", "India", (short)4, "Meerapur","Meerapur", "Prayagraj", "UP", "India", (short)2);
				
				
				//new Person("Jayant Sachdeva", "M", 26, "Sector 11","CBD Belapur","Navi Mumbai", "MH", "India",1,"Meerapur", "Meerapur","Prayagraj" , "UP", "India", 1);
		pObj.printPerson();
	}
}

class Address{
	private String area;
	private String street;
	private String city;
	private String state;
	private String country;
	private short pin;

	public Address()
	{
		
	}

	public Address(String area, String street, String city, String state, String country, short pin) {
		super();
		this.area = area;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public short getPin() {
		return pin;
	}



	public void setPin(short pin) {
		this.pin = pin;
	}
	
	public void printAddress()
	{
		System.out.println("Address                  :\t "+area+", "+street+", "+city+", "+state+", "+country+" --"+pin);
	}
	
}

class Person{
	private String name,gender;
	private int age;
	private Address homeAddress;
	private Address corrAddress;
	
	
	
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		homeAddress = new Address();
		corrAddress = new Address();
	}
	
	

	public Person(
			String name,
			String gender,
			int age,
			
			String area,
			String street,
			String city,
			String state,
			String country,
			short pin,
			
			String area1,
			String street1,
			String city1,
			String state1,
			String country1,
			short pin1
			) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		homeAddress = new Address(
				area,
				street,
				city,
				state,
				country,
				pin
				);
		corrAddress = new Address(
				area1,
				street1,
				city1,
				state1,
				country1,
				pin1
				);
		
	}



	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	public void printPerson()
	{
		System.out.println("Name                     :\t "+name);
		System.out.println("Age                      :\t "+age);
		System.out.println("Gender                   :\t "+gender);
		
		if(homeAddress!=null)
			homeAddress.printAddress();
		
		if(corrAddress!=null)
			corrAddress.printAddress();
		
	}
}

class Student extends Person
{
	private String collegeName,stream;
	private int rollno;
	
	
	public Student(String name, String gender, int age, String collegeName, String stream, int rollno) {
		super(name, gender, age);
		this.collegeName = collegeName;
		this.stream = stream;
		this.rollno = rollno;
	}


	@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + ", collegeName=" + collegeName + ", stream=" + stream
				+ ", rollno=" + rollno + "]";
	}
	
	
}

class Employee extends Student
{
	private String companyName, designation;
	private int empNo,salary;
	
	
	public Employee(String name, String gender, int age, String collegeName, String stream, int rollno,
			String companyName, String designation, int empNo, int salary) {
		super(name, gender, age, collegeName, stream, rollno);
		this.companyName = companyName;
		this.designation = designation;
		this.empNo = empNo;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [toString()=" + super.toString() + ", companyName=" + companyName + ", designation="
				+ designation + ", empNo=" + empNo + ", salary=" + salary + "]";
	}	
	
}