
public class Hauptprogramm {

	public static void main(String[] args) {
		
		
		Mitarbeiter m1=new Mitarbeiter();
		m1.setName("Maier");
		m1.setAbteilung("Finanzierung");
		
		
		
		Kunde k1=new Kunde(m1);
    k1.setName("Hansen");
    k1.setId(111);
    k1.setKonten("DE1223456789",150.0);
    k1.setKonten("DE5345346789", 2250.0);
 m1.setKunden(k1);
    
    

	Kunde k2=new Kunde(m1);
k2.setName("kaiser");
k2.setId(222);
k2.setKonten("DE1223456789",0.0);
k2.setKonten("DE1223456789",1000.0);
k2.setKonten("DE5345346789", 280.0);
m1.setKunden(k2);
    

for(int i=1;i<=2;i++) {
System.out.println("kunde: "+m1.getKunden(i).getName());

for(int k=1;k<=m1.getKunden(i).getAnzahlkonten();k++) {
	System.out.println("konto NR: " +k);
	System.out.println("\t "+ m1.getKunden(i).getKonten(k).getIsbn());
	System.out.println("\t"+m1.getKunden(i).getKonten(k).getSaldo());
	
	
	
	
	
	
}
	
	System.out.println();
	

}

k1.steuerAbzub(5);

k2.steuerAbzub(5);


System.out.println("Nach Steuerabzug");
for(int i=1;i<=2;i++) {
System.out.println("kunde: "+m1.getKunden(i).getName());

for(int k=1;k<=m1.getKunden(i).getAnzahlkonten();k++) {
	System.out.println("konto NR: " +k);
	System.out.println("\t "+ m1.getKunden(i).getKonten(k).getIsbn());
	System.out.println("\t"+m1.getKunden(i).getKonten(k).getSaldo());
	
	
	
	
	
	
}
	
	System.out.println();
	

	}

}
}