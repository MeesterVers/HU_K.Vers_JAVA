package week2.les03.practicum2;

public class Auto{
	private String type;
	private double prijsPerDag;

	public Auto(String tp, double prPd){
		type = tp;
		prijsPerDag = prPd;
	}

	public void setPrijsPerDag(double prPd){
		prijsPerDag = prPd;
	}

	public double getPrijsPerDag(){
		return prijsPerDag;
	}

	public String toString(){
		String message = "autotype: " +type+ " met prijs per dag: " +prijsPerDag;
		return message;
	}
}