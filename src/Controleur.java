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
		}
		
		
		scanner.close();
		System.exit(0);
	}
	
	// Propriétés
	private TourControle tourControle;
	
	// Méthodes 
	
	private void afficherStatutSimulation()
	{
		// Affichage des avions en vol
		tourControle.afficherAvionsEnVol();
		
		// Affichage des pistes
		tourControle.afficherStatutPistes();
		
	}
	
	// Affichage le menu principal au contrôleur et retourne son option choisie.
	private String demanderInputMenuPrincipal()
	{
		// Affichage des choix possibles au contrôleur.
		System.out.println("***************************************************\n" +
							"1) Faire survoler les avions\n" +
							"2) Faire atterrir un avion\n" +
							"0) Fin de la journee de travail!\n" +
							"***************************************************\n" +
							"Votre choix?");
		
		// Obtention du choix du contrôleur.
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
				// Obtention de l'avion à faire atterrir et sur quel piste.
				System.out.println("Entrer le noSerie de l'avion :");
				String numeroAvion = scanner.nextLine();
				System.out.println("Entrer le no de la piste :");
				String numeroPiste = scanner.nextLine();
				
				// Tentative d'atterrissage.
				tourControle.faireAtterrirAvion(numeroAvion, numeroPiste);
			}
			else
			{
				System.out.println("Entrée invalide.");
			}
		}
		
		System.out.println("Fin de la journée de travail!");
	}

}
