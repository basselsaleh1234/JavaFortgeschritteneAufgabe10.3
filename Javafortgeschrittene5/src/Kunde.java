import java.util.ArrayList;

public class Kunde extends Person {

	private int id;
	private Mitarbeiter betreuer;

	private ArrayList<Konto> konten = new ArrayList<Konto>();

	private int anzahlkonten;

	public Kunde(Mitarbeiter betreuer) {
		super();
		this.betreuer = betreuer;
	}

	public Konto getKonten(int i) {
		return konten.get(i - 1);
	}

	public void setKonten(String isbn, double saldo) {
		if (konten.size() <= 3) {
			Konto konto = new Konto();

			konto.setIsbn(isbn);
			konto.setSaldo(saldo);
			konten.add(konto);
			anzahlkonten++;
		} else
			System.out.println("du kannst nicht mehr als 3 konten hinzufügen");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Mitarbeiter getBetreuer() {
		return betreuer;
	}

	public void setBetreuer(Mitarbeiter betreuer) {
		this.betreuer = betreuer;
	}

	public int getAnzahlkonten() {
		return anzahlkonten;
	}

	public void setAnzahlkonten(int anzahlkonten) {
		this.anzahlkonten = anzahlkonten;
	}

	public void steuerAbzub(double prozent) {
		
       
	// konten.forEach(k -> k.setSaldo(k.getSaldo()*(1-prozent/100.0)));
	
		
   /* for(int i=0;i<konten.size();i++) {
    	double t=konten.get(i).getSaldo();
    	if(konten.get(i).getSaldo()!=0) {
    	konten.get(i).setSaldo(t-(t*0.05));
    	
    	}
    }*/
	}

}
