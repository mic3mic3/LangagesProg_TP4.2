import java.util.Scanner;

public class Controleur {

	static Scanner scanner = new Scanner(System.in);	
	public Controleur() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)
	{
		Controleur controleur = new Controleur();
		
		try
		{
			controleur.lancerSimulation();
		}
		catch(EcrasementAvionException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fin de la journ�e de travail!");
		
		scanner.close();
		System.exit(0);
	}
	
	// Propri�t�s
	private TourControle tourControle;
	
	// M�thodes 
	
	private void afficherStatutSimulation()
	{
		// Affichage des avions en vol
		tourControle.afficherAvionsEnVol();
		
		// Affichage des pistes
		tourControle.afficherStatutPistes();
		
	}
	
	// Affichage le menu principal au contr�leur et retourne son option choisie.
	private String demanderInputMenuPrincipal()
	{
		// Affichage des choix possibles au contr�leur.
		System.out.println("***************************************************\n" +
							"1) Faire survoler les avions\n" +
							"2) Faire atterrir un avion\n" +
							"0) Fin de la journee de travail!\n" +
							"***************************************************\n" +
							"Votre choix?");
		
		// Obtention du choix du contr�leur.
		return scanner.nextLine();
	}
	
	private void lancerSimulation()  throws EcrasementAvionException
	{
		tourControle = new Aeroport();
		String choix = "";
		boolean simulationTerminee = false;
		while(simulationTerminee == false)
		{
			choix = demanderInputMenuPrincipal();
			if(choix.compareTo("0") == 0)
			{
				simulationTerminee = true;
			}
			else if(choix.compareTo("1") == 0)
			{
				afficherStatutSimulation();
				tourControle.faireSurvolerAvions();
			}
			else if(choix.compareTo("2") == 0)
			{
				// Obtention de l'avion � faire atterrir et sur quel piste.
				System.out.println("Entrer le noSerie de l'avion :");
				String numeroAvion = scanner.nextLine();
				System.out.println("Entrer le no de la piste :");
				String numeroPiste = scanner.nextLine();
				
				// Tentative d'atterrissage.
				tourControle.faireAtterrirAvion(numeroAvion, numeroPiste);
			}
			else
			{
				System.out.println("Entr�e invalide.");
			}
		}

	}

}
