public class Giocatore {
	
	private String nomeGiocatore;
	private Pedina pedina;
	private int turno = 0;
	private boolean pozzo=false;
	
	public Pedina getPedina(){return pedina;}
	
	public int getTurno() {return turno;}
	public void setTurno(int turno) {this.turno=turno;}
	public void setNome(String nomeGiocatore) {this.nomeGiocatore = nomeGiocatore;}
	public String getNome() {return nomeGiocatore;}
	
	
	public int lanciaDado() {
		Dado valore = new Dado();
		return valore.lancia();
		
	}
	
	public void muovi() {
		pedina.setPosizione(pedina.getPosizione() + lanciaDado()) ;
		if (pedina.getPosizione()>63) {
			pedina.setPosizione(pedina.getPosizione()-63);
		}
	}
	
	public void controllo(Tabellone a, int posizione) {
		
		switch(a.caselle[posizione].getTipo()) {
		
		case "Base" : break;	
		case "Ponte": 
			muovi();
			controllo(a,pedina.getPosizione());
			break;
		
		case "Casa" : 
			turno = 3;
			break;
			
		case "Pozzo": 
			pozzo=true;
			break;
			
		case "Labirinto": 
			pedina.setPosizione(39);
			break;
			
		case "Scheletro": 
			pedina.setPosizione(1);
			break;
			
		case "Oca": 
			muovi();
			controllo(a,pedina.getPosizione());
			break;
			
		case "Fine":
			pedina.setFine(true);
			break;
		
		}	
		
	}
}

