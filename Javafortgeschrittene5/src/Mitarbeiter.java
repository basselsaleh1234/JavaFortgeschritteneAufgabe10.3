import java.util.ArrayList;

public class Mitarbeiter extends Person {
	
private String abteilung ;

private ArrayList<Kunde>kunden=new ArrayList<Kunde>();









public Mitarbeiter() {
	super();
}

public String getAbteilung() {
	return abteilung;
}

public void setAbteilung(String abteilung) {
	this.abteilung = abteilung;
}

public Kunde getKunden(int i) {
	return kunden.get(i-1);
	
}

public void setKunden(Kunde k) {
	
	kunden.add(k);
}



	
	

}
