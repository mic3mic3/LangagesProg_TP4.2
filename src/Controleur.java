import java.util.Scanner;

public class Controleur {

	static Scanner scanner = new Scanner(System.in);	
	public Controleur() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)
	{
		System.out.println("D�part");
		Aeroport aeroport = new Aeroport();
		
		//Controleur controleur = new Controleur();
		//controleur.lancerSimulation();
		
		//scanner.close();
	}
	
	private void afficherStatutSimulation()
	{
		// Affichage des avions en vol
		
		// Affichage des pistes
	}
	
	// Affichage le menu principal au contr�leur et retourne son option choisie.
	private String demanderInputMenuPrincipal()
	{
		// Affichage des choix possibles au contr�leur.
		System.out.print("***************************************************\n" +
							"1) Faire survoler les avions\n" +
							"2) Faire atterrir un avion\n" +
							"0) Fin de la journee de travail!\n" +
							"***************************************************\n" +
							"Votre choix?\n");
		
		// Obtention du choix du contr�leur.
		return scanner.nextLine();
	}
	
	private void lancerSimulation()
	{
		Controleur controleur = new Controleur();
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
				
			}
			else
			{
				System.out.print("Entr�e non g�r�e.\n");
			}
		}
		
		System.out.print("Fin de la journ�e de travail!\n");
	}

}
