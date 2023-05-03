package W1D2;

public class Sim {
	private String numeroTelefono;
	private double creditoDisponibile;
	private String[] chiamate;
	
	public Sim(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		this.creditoDisponibile = 0;
		this.chiamate = new String[5];
	}
	
	public void salvaChiamata(String numero, double durata) {
		String nuovaChiamata = "Numero chiamato:" + numero + ", Durata:" + durata;
		for (int i = this.chiamate.length - 2; i >= 0; i--) {
	        this.chiamate[i + 1] = this.chiamate[i];
	    }
	    this.chiamate[0] = nuovaChiamata;
	}
	
	public void stampaDati() {
		System.out.println("Numero di telefono: " + this.numeroTelefono);
		System.out.println("Credito disponibile: " + this.creditoDisponibile);
		System.out.println("Lista delle chiamate effettuate: ");
		for (int i=0; i<this.chiamate.length; i++) {
			if(this.chiamate[i] != null) {
				System.out.println("Chiamata " + (i + 1) + ": " + this.chiamate[i]);
			}
		}
	}
}
