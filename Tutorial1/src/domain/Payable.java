package domain;

public interface Payable {
	
	
	//don't need to type final, since it is implicit, all attributes in a interface is "final".
	public final double OVTRATE = 1.25;
	public double calculateOverTime();

}
