
public class Tabellone {

	Casella caselle[]= new Casella [64];

	Tabellone() {
		 
	for (int i=0; i<64;i++) {	
		caselle[i].setTipo("Base");	
	}	
	caselle[6].setTipo("Ponte");
	caselle[19].setTipo("Casa");
	caselle[31].setTipo("Pozzo");
	caselle[52].setTipo("Pozzo");
	caselle[42].setTipo("Labirinto");
	caselle[58].setTipo("Scheletro");
		
	for(int i=0;i<64;) {
		i=i+5;
		caselle[i].setTipo("Oca");
		i=i+4;
		caselle[i].setTipo("Oca");
	}
	caselle[64].setTipo("Fine");
	
	}
	
}
