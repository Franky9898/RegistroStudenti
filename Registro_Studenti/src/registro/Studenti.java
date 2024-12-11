package registro;

public class Studenti
{
	final private String nome;
	final private String cognome;
	final private int matricola;

	public Studenti(String nome, String cognome, int matricola) //Costruttore con controllo su matricola negativa
	{
		if (matricola < 1)
			throw new IllegalArgumentException("Il numero matricola non può essere non positivo.");
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}

	public String getFirstName()
	{
		return nome;
	}

	public String getLastName()
	{
		return cognome;
	}

	public int getMatrNumber()
	{
		return matricola;
	}

	public static void stampaStudenti(Studenti studente) //Stampa personalizzata
	{
		System.out.println("Nome: " + studente.getFirstName() + ". Cognome: " + studente.getLastName() + ".");
	}

}
