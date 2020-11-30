
public class Tabellone {

	Casella numCaselle[]= new Casella [64];
	
	void tabellone( Tabellone a ) {
		
	for (int i=0; i<64;i++) {	
	a.numCaselle[i].setTipo("Base");	
	}	
	a.numCaselle[6].setTipo("Ponte");
	a.numCaselle[19].setTipo("Casa");
	a.numCaselle[31].setTipo("Pozzo");
	a.numCaselle[52].setTipo("Prigione");
	a.numCaselle[42].setTipo("Labirinto");
	a.numCaselle[58].setTipo("Scheletro");
		
	for(int i=0;i<64;) {
		i=i+5;
		a.numCaselle[i].setTipo("Oca");
		i=i+4;
		a.numCaselle[i].setTipo("Oca");
	}
	a.numCaselle[0].setTipo("Start");
	a.numCaselle[64].setTipo("Fine");
	
	}
	
}
