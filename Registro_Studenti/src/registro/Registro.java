package registro;

import java.util.ArrayList;

public class Registro
{
	ArrayList<Studenti> registro;

	public Registro(ArrayList<Studenti> registro) //ArrayList che conterrà gli oggetti di tipo Studenti
	{
		this.registro = registro;
	}

	public static void aggiungiStudente(ArrayList<Studenti> registro, Studenti studente) //Si aggiunge uno studente se ha matricola univoca
	{
		int checkCounter = 0;
		for (int i = 0; i < registro.size(); i++) //Si deve controllare tutto il registro per dire che il numero matricola sia univoco
		{
			if (studente.getMatrNumber() != registro.get(i).getMatrNumber())
				checkCounter++; //Per il momento è unico, dunque aumento il counter
			else
				break; //Non è unico si interrompe il ciclo
		}
		if (checkCounter == registro.size()) //Si aggiunge dato che si è controllato tutto il registro e non si è trovata una corrispondenza
		{
			registro.add(studente);
			System.out.println("Studente aggiunto con successo.");
		} else
			System.out.println("La matricola è già in uso.");
	}

	public static void visualizzaStudenti(ArrayList<Studenti> registro) //Stampa il registro studenti in base a nome e cognome
	{
		for (int i = 0; i < registro.size(); i++)
		{
			Studenti.stampaStudenti(registro.get(i));
		}
	}

	public static void cercaStudente(ArrayList<Studenti> registro, int matricola) //Cerca lo studente in base a numero matricola
	{
		int c = 0;
		for (int i = 0; i < registro.size(); i++) //Stesso ragionamento di prima ma il counter aumenta se NON c'è corrispondenza
		{
			if (matricola == registro.get(i).getMatrNumber())
			{
				//System.out.println("Studente trovato");
				Studenti.stampaStudenti(registro.get(i));
				break; //Si interrompe il ciclo (la matricola è univoca, se non lo fosse si dovrebbero fare altri controllo)
			} else
				c++;
		}
		if (c == registro.size())
			System.out.println("Studente non trovato");
	}

}
