import java.util.Arrays;

public class AssembleAPhone {
	
	public static void main(String[] args) {
		
	
	Core c1 = new Core(1.2,"Ghz",3);
	Core c2 = new Core(1.2,"Ghz",3);
	Core cores[] = {c1,c2};
	GPU gp = new GPU(100000, 1);
	NetworkChip nc = new NetworkChip("4G");
	Processor p = new Processor(cores, gp,nc);
	Input_Device touchscreen = new Input_Device("Touchscreen", "FingerTouch");
	Smartphone ApplePhone = new Smartphone("Apple", false,p,touchscreen);	
	// Try to call
	NetworkLine callTo100 = new NetworkLine(100, "Police", ApplePhone.getMainProcessor().getNet().NetworkType, true);
	//ApplePhone.Dial(callTo100);
	ApplePhone.showSpecification();
	}
	
	
}

class Core
{
	double clockSpeed;
	String clockSpeedUnit;
	int CacheMB;
	
	public Core(double clockSpeed, String clockSpeedUnit, int cacheMB) {
		super();
		this.clockSpeed = clockSpeed;
		this.clockSpeedUnit = clockSpeedUnit;
		CacheMB = cacheMB;
	}

	@Override
	public String toString() {
		return "Core [clockSpeed=" + clockSpeed + ", clockSpeedUnit=" + clockSpeedUnit + ", CacheMB=" + CacheMB + "]";
	}	
	
}

class GPU {
	double FOPS;
	int GPUFlag;
	public GPU(double fOPS, int gPUFlag) {
		super();
		FOPS = fOPS;
		GPUFlag = gPUFlag;
	}
	@Override
	public String toString() {
		return "GPU [FOPS=" + FOPS + ", GPUFlag=" + GPUFlag + "]";
	}
	
	
	
}

class NetworkChip
{
	String NetworkType;

	public NetworkChip(String networkType) {
		super();
		NetworkType = networkType;
	}

	@Override
	public String toString() {
		return "NetworkChip [NetworkType=" + NetworkType + "]";
	}	
	
	
}

class Processor
{
	Core processorCores[];
	GPU GamingProcessor; //hasA
	NetworkChip net;

	public Processor(Core[] processorCores, GPU gamingProcessor, NetworkChip net) {
		super();
		this.processorCores = processorCores;
		GamingProcessor = gamingProcessor;
		this.net = net;
	}

	public NetworkChip getNet() {
		return net;
	}

	@Override
	public String toString() {
		return "Processor [processorCores=" + Arrays.toString(processorCores) + ", GamingProcessor=" + GamingProcessor
				+ ", net=" + net + "]";
	}
	
	
	
}

class Phone
{
	String Brand;
	boolean needWires;
	Processor mainProcessor;
	Input_Device input;
	

	
	public Phone(String brand, boolean needWires, Processor mainProcessor, Input_Device input) {
		super();
		Brand = brand;
		this.needWires = needWires;
		this.mainProcessor = mainProcessor;
		this.input = input;
		
	}
	
	public void Dial(NetworkLine l)
	{
		System.out.println(l.toString());
	}

	public Processor getMainProcessor() {
		return mainProcessor;
	}

	@Override
	public String toString() {
		return "Phone [Brand=" + Brand + ", needWires=" + needWires + ", mainProcessor=" + mainProcessor + ", input="
				+ input + "]";
	}
	
	public void showSpecification() {
		System.out.println(this.toString());
	}
	
}

class Input_Device{
	String Name;
	String OperateMode;
	
	
	public Input_Device(String name, String operateMode) {
		super();
		Name = name;
		OperateMode = operateMode;
	}


	@Override
	public String toString() {
		return "Input_Device [Name=" + Name + ", OperateMode=" + OperateMode + "]";
	}
	
	
}


class Smartphone extends Phone
{
	public Smartphone(String brand, boolean needWires, Processor mainProcessor, Input_Device input) {
		super(brand, needWires, mainProcessor, input);	
		}

	@Override
	public String toString() {
		return "Smartphone [Brand=" + Brand + ", needWires=" + needWires + ", mainProcessor=" + mainProcessor
				+ ", input=" + input + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

class NetworkLine
{
	int dialNumber;
	String LineName;
	String LineTechnology;
	boolean supportsData;
	
	public NetworkLine(int dialNumber, String lineName, String lineTechnology,
			boolean supportsData) {
		super();
		this.dialNumber = dialNumber;
		LineName = lineName;
		LineTechnology = lineTechnology;
		this.supportsData = supportsData;
	}

	public int getDialNumber() {
		return dialNumber;
	}

	public void setDialNumber(int dialNumber) {
		this.dialNumber = dialNumber;
	}

	public String getLineTechnology() {
		return LineTechnology;
	}

	public void setLineTechnology(String lineTechnology) {
		LineTechnology = lineTechnology;
	}

	@Override
	public String toString() {
		return "NetworkLine [dialNumber=" + dialNumber + ", LineName=" + LineName + ", LineTechnology=" + LineTechnology
				+ ", supportsData=" + supportsData + ", toString()=" + super.toString() + "]";
	}
	
}