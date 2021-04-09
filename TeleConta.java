import java.util.ArrayList;

public class TeleConta {
	private String localita;
	private int codice;
	private int[] nMoto;
	private int[] nMacchine;
	
	public TeleConta(String localita, int codice, int[] nMoto, int[] nMacchine) {
		super();
		this.localita = localita;
		this.codice = codice;
		this.nMoto = nMoto;
		this.nMacchine = nMacchine;
	}
	
	
	public TeleConta() {
		super();
	}


	public int[] getnMoto() {
		return nMoto;
	}
	public void setnMoto(int[] nMoto) {
		this.nMoto = nMoto;
	}

	public int[] getnMacchine() {
		return nMacchine;
	}
	public void setnMacchine(int[] nMacchine) {
		this.nMacchine = nMacchine;
	}
	public String getLocalita() {
		return localita;
	}
	public void setLocalita(String localita) {
		this.localita = localita;
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	

}

