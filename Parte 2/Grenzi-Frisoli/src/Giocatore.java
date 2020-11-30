public class Giocatore {
	private int posizione = 0;
	private String nomeGiocatore;
	private String colore;
	
	public Giocatore(String nomeGiocatore, String colore) {
		this.nomeGiocatore = nomeGiocatore;
		this.colore = colore;
	}
	
	public int muovi() {
		Dado valore = new Dado();
		posizione = posizione + valore.lancia();
		return posizione;
	}

}

