package week2.les03.practicum1;

public class Huis{
	private String adres;
	private int bouwjaar;
	private Persoon huisbaas;

	public Huis(String adr, int bwjr){
		adres = adr;
		bouwjaar = bwjr;
	}

	public void setHuisbaas(Persoon hb){
		huisbaas = hb;
	}

	public Persoon getHuisbaas(){
		return huisbaas;
	}

	public String toString(){
		String message = "Huis " +adres+ " is gebouwd in " +bouwjaar+ "\n" +huisbaas;
		return message;
	}
}