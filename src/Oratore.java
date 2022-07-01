
public class Oratore {

	
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getTitolo() {
		return titolo;
	}
	
	
	private String nome;
	private String cognome;
	private String titolo;
	
	public Oratore(String nome, String cognome, String titolo) throws Exception {
        
		this.nome=nome;
		this.cognome=cognome;
		this.titolo=titolo;
		rigavuota();
		
	}
	
	private void rigavuota() throws Exception {
		if (nome == null || titolo.equalsIgnoreCase("")) {
			throw new Exception("il nome non puo' essere vuoto");	
	}
		if (cognome == null || titolo.equalsIgnoreCase("")) {
			throw new Exception("il cognome non puo' essere vuoto");	
	}
		if (titolo == null || titolo.equalsIgnoreCase("")) {
			throw new Exception("il titolo non puo' essere vuoto");	
	}
		
		
	}
}
