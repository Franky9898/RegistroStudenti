package registro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

	public static void gestioneRegistro(Registro registro) //Gestisce registro in base a input utente
	{
		int scelta = -1;
		int conferma = 1;
		Scanner input = new Scanner(System.in);
		//public Studenti(String nome, String cognome, int matricola)
		while (conferma == 1)
		{
			switch (scelta)
			{
			case 1: //Aggiungi studente
				System.out.println("Inserisci nome studente: ");
				String nome = input.next();
				System.out.println("Inserisci cognome studente: ");
				String cognome = input.next();
				System.out.println("Inserisci numero matricola: ");
				int matricola = input.nextInt();
				Studenti nuovoStudente = new Studenti(nome, cognome, matricola);
				Registro.aggiungiStudente(registro.registro, nuovoStudente);
				scelta = -1;
				break;
			case 2: //Visualizza registro
				Registro.visualizzaStudenti(registro.registro);
				scelta = -1;
				break;
			case 3: //Cerca studente
				System.out.println("Inserisci numero matricola: ");
				matricola = input.nextInt();
				Registro.cercaStudente(registro.registro, matricola);
				scelta = -1;
				break;
			case 4: //Salta azioni
				scelta = -1;
				break;
			default:
				System.out.println("Premi 1 per aggiungere un nuovo arrivato , 2 visualizzare tutti gli studenti, 3 cercare studente in base a numero matricola, 4 per uscire");
				scelta = input.nextInt();
				continue;
			}
			System.out.println("");
			System.out.println("Vuoi fare altro? Premi 1 per sì."); //Esci
			conferma = input.nextInt();
		}
		input.close();
		System.exit(0);
	}

	public static void main(String[] args)
	{
		//Studenti studente1 = new Studenti("Francesco", "Martini", 0); //Controlla errore su numero matricola
		//Studenti studente1 = new Studenti("F", "M", 10); ************INSERIRE IN CONSOLE PER TESTARE NUMERO MATRICOLA GIà USATO***********
		Studenti studente2 = new Studenti("Mario", "Rossi", 10);
		Studenti studente3 = new Studenti("Luca", "Bianchi", 11);
		ArrayList<Studenti> registro = new ArrayList<Studenti>();
		registro.add(studente2);
		registro.add(studente3);
		Registro scuola = new Registro(registro);
		gestioneRegistro(scuola);
	}

}
